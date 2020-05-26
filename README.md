GRPC Server:
=================================================

Create a project with maven dependency <BR />

add proto file <BR />

run maven to generate class <BR />


Then run the server <BR />



GRPC Client:
==================================================


Create a maven project with dependency <BR />

Take the proto file <BR />

In main method of the client class, use cloudGrpc (<name>Grpc) to get stub. Look for stub in the implemented class, what kind of stub it is. Here is blocingstub. <BR />

and run the client. <BR />


Please refer screen shot to understand the workflow. <BR />



Install Bloomrpc client to test grpc:
===================================================

1. Install choco in powershell <BR />

Set-ExecutionPolicy Bypass -Scope Process -Force; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1')) <BR />


2. Install yarn <BR />

choco install yarn <BR />


3. https://github.com/uw-labs/bloomrpc <BR />

git clone https://github.com/uw-labs/bloomrpc.git <BR />
cd bloomrpc <BR />
npm install <BR />

4. Run following command from bloomrpc folder in two different command window: <BR />

npm run start-server-dev <BR />
npm run start-main-dev <BR />


Kubernetes Deployment
===========================================

docker build -t grpc-service:v1 grpc-project/

docker build -t grpc-client:v1 grpc-client/


kubectl apply -f grpc_server.yaml
kubectl apply -f grpc_client.yaml

Logs:

![GRPC Communication](https://github.com/arindam-b/grpc-java-kubernetes/blob/master/demo/Kubernetes%20Deployment.png)   
