### Kubectl Command
#### Create deployment from yaml named file.
* kubectl apply -f deployment.yaml
#### List all deployments in the current namespace
* kubectl get deployment
#### List all pods in the exist namespaces
* kubectl get pods -A
#### List all pods in the current namespace
* kubectl get pods
#### Get detail info of pod
* kubectl describe pods <pods-name>
#### Show logs of <container-name>
* kubectl logs -f <container-name>
* kubectl delete deployment <deployment-name>
* kubectl set resources deployment/springdockeraws --limits=cpu=768m,memory=512Mi
* kubectl port-forward pod/<container-name> <local-port>=<expose-port>
#### Scale 
* kubectl scale deployment/<deploymentname> --replicas=5
#### Port forward
* kubectl port-forward pod/springdockerwas-6684487bfc-jq6x9 8085:8085on
#### Minikube Service - Open the tunnel to NodePort onto Minikube
* minikube service --url springaws
