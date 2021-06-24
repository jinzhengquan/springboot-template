FROM carsharing/alpine-oraclejdk8-bash
COPY build/libs/springboot-template-0.0.1-SNAPSHOT.jar springboot-template.jar
ENTRYPOINT ["java","-jar", "springboot-template.jar"]