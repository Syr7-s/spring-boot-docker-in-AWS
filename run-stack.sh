#!/bin/bash

#!/bin/bash

aws cloudformation deploy \
    --region us-east-2 \
    --stack-name spring-production \
    --template-body file://service.yaml \
    --capabilities CAPABILITY_NAMED_IAM \
    --parameters \
    ParameterKey=DockerImage,ParameterValue=847534376633.dkr.ecr.us-east-2.amazonaws.com/spring-boot-docker-in-aws:$(git rev-parse HEAD) \
    ParameterKey=VPC,ParameterValue=vpc-06f5865afd460f3aa
    ParameterKey=Cluster,ParameterValue=default \
    ParameterKey=Listener,ParameterValue=arn:aws:elasticloadbalancing:us-east-2:847534376633:listener/app/spring-production/facd15f6f5265770/2c45e509a446e0ac