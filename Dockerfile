FROM tomcat:9-jdk8-openjdk-slim

# remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

WORKDIR /usr/local/tomcat/webapps/ROOT

# copy web content (includes jstl jar in WEB-INF/lib)
COPY ContentWeb/ .

# copy and compile java source files using tomcat's servlet-api
COPY src/ /tmp/src/
RUN mkdir -p WEB-INF/classes && javac -cp "/usr/local/tomcat/lib/servlet-api.jar" -d WEB-INF/classes /tmp/src/*/*.java && rm -rf /tmp/src

EXPOSE 8080

CMD ["catalina.sh", "run"]