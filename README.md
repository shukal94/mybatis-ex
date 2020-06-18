* start up mysql server
* include `config.properties` file into `src/main/resources/`
the example of config
```
username=username
password=password
url=url
driver=driver
```

* run `mvn clean test -Dsuite=basic_tests`
