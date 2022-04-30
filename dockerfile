FROM java:8
WORKDIR /var/www/java
COPY . /var/www/java
RUN javac TranssacApplication.java
CMD ["java", "TranssacApplication"]