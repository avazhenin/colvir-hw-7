# colvir homework 7

### Ping pong multimodule service

### Build project
mvn clean install

### To start ping service, run command 
mvn -f ping-service spring-boot:run

### To start pong service, run command
mvn -f pong-service spring-boot:run

### To send messsage use CURL
curl -X POST http://localhost:8888/ping
