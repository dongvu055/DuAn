#Guild run Application
##Config  
- Download and install Java 8 https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html
- Check version java : 
  - Run cmd : 
    - java -version
- Download and install Maven https://maven.apache.org/download.cgi
- Check version maven:
  - Run cmd: 
    - mvn --version
- Add database from Backend-DuAn/sql/duan.sql 
##Run Application   
  ####After configuring the installation successfully
- Open terminal then cd to Backend-DuAn ( Directory contain pom.xml )
- Run command:
  - mvn spring-boot:run
##### Openbrower call API http://localhost:8080/play/multiple_choice/8258 to check data
