# Springboot application with NGINX Reverse Proxy

This is a small example using an **NGINX** server as reversal proxy

# Requirements
- jdk17
- Docker/Compose

## Build the images from the root folder
Run:
**mvn clean package**
**docker build -t reverseproxy .**
**docker build -f DockerfileApp -t proxyapp .**
**docker compose up**


## UML
```mermaid
sequenceDiagram
Client ->> Proxy: /api/
Note right of Client: Client performs a get /api <br/> then the proxy redirects to the<br/>root endpoint
Proxy-->>Application: /
