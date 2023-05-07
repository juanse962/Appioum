# Perficient Links


## Execution
* To run this project on Android
``` 
./gradlew clean test -Dproperties=android.properties -DappiumApp=PATH_DOWNLOADED_APP
```
* To run this project on IOS
``` 
./gradlew clean test -Dproperties=ios.properties -DappiumApp=PATH_DOWNLOADED_APP
```
## Local Example
* In my case this is my path for ``` android.properties``` and ```ios.propertires```

* Android
```
./gradlew clean test -Dproperties=android.properties -DappiumApp=/Users/sebastian.gomezg/Downloads/app-debug.apk -Denvironment=local
```
* IOS
```
./gradlew clean test -Dproperties=ios.properties -DappiumApp=/Users/sebastian.gomezg/Downloads/Perficient-links.app -Denvironment=local
```
## Cloud Example BrowserStack 

* Change the path for your BrowserStack app link in ``` android.properties``` and ```ios.propertires```
 ```
browserstack.app:bs://8aaadf33473b3c389abeb1b4c0a0f2068893fd8a
```
* Add Enviroment variables to BrowserStack in your IDE or System
```
BROWSERSTACK_USERNAME=juan_HO5s3T
BROWSERSTACK_ACCESS_KEY=zjAnigXgSsapDnVAEkm9;
```

* Android
```
./gradlew clean test -Dproperties=android.properties -Dbrowserstack=bs://8aaadf33473b3c389abeb1b4c0a0f2068893fd8a
```
* IOS
```
  ./gradlew clean test -Dproperties=ios.properties -Dbrowserstack=bs://8aaadf33473b3c389abeb1b4c0a0f2068893fd8a
* To run tags in feature files, add this property
``` 
-Dcucumber.options="-tags @tagname"
```# Appioum
# Appioum
