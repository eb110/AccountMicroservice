#download java-17 to docker image
FROM openjdk:17-ea-slim

MAINTAINER figura

##copy jar to docker image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

##atm docker image will have java-17 and jar

##exec of normal jar is: java -jar <jar-file>
#no target/ as the jar is directly in docker container location
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]