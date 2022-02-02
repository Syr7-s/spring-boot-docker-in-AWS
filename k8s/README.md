### Kubectl Command
* kubectl apply -f deployment.yaml
* kubectl get deployment
* kubectl get pods
* kubectl describe pods <pods-name>
* kubectl logs -f <container-name>
* kubectl delete deployment <deployment-name>
* kubectl set resources deployment/springdockeraws --limits=cpu=768m,memory=512Mi
* kubectl port-forward pod/<container-name> <local-port>=<expose-port>
* kubectl port-forward pod/springdockerwas-6684487bfc-jq6x9 8085:8085
