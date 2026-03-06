## a little bit of history

* java ee (java enterprise edition): from sun (1999 j2ee until 2017 java ee 8), under javax.*: jsp, ejb, jpa, jms etc
* servlet api: one the java ee specs. defines how java handles http requests.
* jsp: built on top of servlet api. let's you write html with java using `<%= %>`. server compiles .jsp file into a servlet.
* jstl: jsp standard tag library, use `<c:forEach>`, `<c:if>`, `<c:out>` instead of `<%= %>`
* jakarta ee: 2017 oracle donated java ee to eclipse. tomcat 10+ requires jakarta, tomcat 9- uses javax.*

## how to run

local: `mvn jetty:run` → http://localhost:8080/serv

docker: `docker compose up --build` → http://localhost:8080/serv

![form view](form.png "form title")