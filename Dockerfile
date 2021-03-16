FROM openjdk:8
COPY target/scientific-calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","scientific-calc-1.0-SNAPSHOT-jar-with-dependencies.jar","calc.calculate"]
