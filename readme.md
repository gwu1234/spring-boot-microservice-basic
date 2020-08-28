## Application of multiple microsevices from Spring Boot and Spring Cloud

it is self-improving exercise. Following a course, it builds an application of multiple microservices

of Spring Boot and Spring Cloud.

this application has three microservices, each being a running process: a naming-server, 

a currency-exchange microservice, and a data service.

naming server uses eureka server, data service uses jpa and h2 for database, and ribbon for load 

balancing.

## How to display multiple microservices 

1) run eureka-name-server 

2) run currency-exchange 

3) run 2 copies of data-service at port 8000 and 8001: at run configuration set -Dserver.port=8000

and -Dserver.port=8001

4) display Eureka Naming Server from a browser (http://localhost:8761/)

you should see one process of currency exchange service and two processes of data service

5) access data service at port 8000

http://localhost:8000/currency-exchange/from/USD/to/CAD

6) access data service at port 8001

http://localhost:8001/currency-exchange/from/USD/to/CAD

7) access currency-exchange microservice at port 8100

http://localhost:8100/currency-converter/from/USD/to/CAD/quantity/10000

8) display load balancing of data service 

http://localhost:8100/currency-converter-feign/from/USD/to/CAD/quantity/10000

run multiple times, you should see responses alternatively from port 8000 and 8001













