# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM tomcat
ENV DIR_WEBAPP /usr/local/tomcat/webapps/
RUN  rm -rf $DIR_WEBAPP/*
ADD FirstRest.war $DIR_WEBAPP/app.war 
RUN  unzip $DIR_WEBAPP/app.war  -d  $DIR_WEBAPP/ROOT/