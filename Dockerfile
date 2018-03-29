FROM tomcat
MAINTAINER Kiet T. Tran, Ph.D.
ADD build/libs/patient-portal-0.0.1-SNAPSHOT.war.original /usr/local/tomcat/webapps/patient-portal.war
CMD ["catalina.sh", "run"]
EXPOSE 8080
