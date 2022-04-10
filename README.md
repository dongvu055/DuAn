# Guild run Application
## Config  
- Download and install Java 8 https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html
- Check version java : 
  - Run cmd : 
    - java -version
- Download and install Maven https://maven.apache.org/download.cgi
- Check version maven:
  - Run cmd: 
    - mvn --version
- Add database from script Backend-DuAn/sql/duan.sql t 
- Connect Application to Database:
##### Cd to src/main/resources/application.properties and Edit
  - spring.datasource.url=jdbc:mysql://localhost:3306/duan (database name of you )
  - spring.datasource.username= username for mysql of you 
  - spring.datasource.password= password for mysql of you
## Run Application   
  #### After configuring the installation successfully
- Open terminal then cd to Backend-DuAn ( Directory contain pom.xml )
- Run command:
  - mvn spring-boot:run
##### Openbrower call API http://localhost:8080/play/multiple_choice/8258 to check data
## List API:
- API get Data for Multiple Choice
  - http://localhost:8080/play/multiple_choice/{object_id}
- API get Data for ColumeJoin
  - http://localhost:8080/play/column_join/{object_id}
