# rest-api-crud-postgresql #

## Spring-boot restful webservice backed by Postgresql that does CRUD oeprations ##

A postges database called elections has been created having 4 tables and 2 views
1. elections
2. candidate
3. election_candidate
4. vote
5. votes_by_elections
6. vote_totals

### ER digram of elections database ###
![alt text](https://github.com/kbhagi/rest-api-crud-postgresql/blob/master/elections_database_diagram.png)


#### Metrics of performance testing with JMeter at 1000 requests / second for 10 second loop with ramp up period of 5 seconds ####

Please check out the logs folder for an html file that contains charts and graphs of this testing this endpoint
Api Endpoint : http://localhost:8082/candidates 
requests per second : 1000 
Ramp up time : 5 seconds
Loop timer : 10 seconds
Request Type : GET

Fore more info checkout the index.html at logs folder https://github.com/kbhagi/rest-api-crud-postgresql/blob/master/log/index.html

Metrics of this spring-boot application application is monitored with actuator plugin

http://localhost:8082/actuator
https://localhost:8082/actuator/health
https://localhost:8085/actuator/metrics

-     GET Endpoints : 
                  - `http://localhost:8082/candidates/summary`

                  - `http://localhost:8082/candidates`

                  - `http://localhost:8082/candidates/26`

                  - `http://localhost:8082/elections`

                  -  `http://localhost:8082/elections/15`

                  - `http://localhost:8082/profile/vote-totals`

                  - `http://localhost:8082/elections/summary`

 -     PUT Endpoint:
               -   `http://localhost:8082/candidates/{id}`
                 
                 
-      POST Endpoints:
               -     `http://localhost:8082/candidates`   
               
-      DELETE Endpoints:
               -    `http://localhost:8082/candidates/{id}`        
               
               
               
 ## References

-   <https://www.javabullets.com/calling-database-views-from-spring-data-jpa>
-   <http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api>
-   <http://www.vogella.com/tutorials/Lombok/article.html>
-   <https://spring.io/guides/gs/accessing-data-jpa>
-   <https://dzone.com/articles/integrating-spring-data-jpa-postgresql-and-liquiba>
-   <https://auth0.com/blog/integrating-spring-data-jpa-postgresql-liquibase>
-   <http://mrbool.com/rest-server-with-spring-data-spring-boot-and-postgresql/34023>
-   <https://www.tutorialspoint.com/postgresql/postgresql_create_database.htm>
                


                
                 

