# GeoCoding API
[![Build Status](https://travis-ci.org/tiarebalbi/sample-geocoding-api.svg?branch=master)](https://travis-ci.org/tiarebalbi/sample-geocoding-api)

## Installing
To test the application we can use the following command:
 
    ./mvnw clean install

## Executing the application
To execute the application in your local machine you can use the command:

    ./mvnw spring-boot:run -Dgeocoding.api.google-key=223

To deploy the application to an external server we need to build it and then execute the packages created using the command above.

## Testing
To test the application we can access the link below replacing the **{ADDRESS}** to the address that your are searching.

    http://localhost:8080/camel/address/search?address={ADDRESS}
    
       
