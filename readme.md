#### Start naming server
`mvn clean spring-boot:run -Dserver.port=8030`  
http://localhost:8030/

#### Start catalog service(s)
`mvn clean spring-boot:run -Dserver.port=8010`  
`mvn clean spring-boot:run -Dserver.port=8011`  

#### Start shoppingcart service
`mvn clean spring-boot:run -Dserver.port=8020`  

#### Start api gateway
`mvn clean spring-boot:run -Dserver.port=8040`

