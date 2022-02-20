def builderImage
def productionImage
def ACCOUNT_REGISTRY_PREFIX
def GIT_COMMIT_HASH

pipeline {
    agent any
    stages {
        stage('Checkout Source Code and Logging Into Registry') {
            steps {
                echo 'Logging Into the Private ECR Registry'
                script {
                    GIT_COMMIT_HASH = sh (script: "git log -n 1 --pretty=format:'%H'", returnStdout: true)
                    ACCOUNT_REGISTRY_PREFIX = "847534376633.dkr.ecr.us-east-2.amazonaws.com"
                    sh """
                    \$(aws ecr get-login --no-include-email --region us-east-2)
                    """
                }
            }
        }

        stage('Build Production Image') {
            steps {
                echo 'Starting to build docker image'
                script {
                    productionImage = docker.build("${ACCOUNT_REGISTRY_PREFIX}/spring-boot-docker-in-aws:${GIT_COMMIT_HASH}")
                    productionImage.push()
                    productionImage.push("${env.GIT_BRANCH}")
                }
            }
        }

        stage('Deploy to Production fixed server') {
            when {
                branch 'master'
            }
            steps {
                echo 'Deploying release to production'
                script {
                    productionImage.push("master")
                    sh """
                       aws ec2 reboot-instances --region us-east-2 --instance-ids i-048585b24401810d8
                    """
                }
            }
        }
    }
}