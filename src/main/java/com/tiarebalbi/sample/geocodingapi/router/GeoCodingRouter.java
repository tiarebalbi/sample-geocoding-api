package com.tiarebalbi.sample.geocodingapi.router;

import com.tiarebalbi.sample.geocodingapi.router.model.GeoCodeResponse;
import com.tiarebalbi.sample.geocodingapi.router.processor.GeoCodeResponseProcessor;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import static org.apache.camel.model.rest.RestParamType.query;

@Component
public class GeoCodingRouter extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    restConfiguration()
      .component("servlet")
      .bindingMode(RestBindingMode.json)
      .dataFormatProperty("prettyPrint", "true")
      .apiContextPath("/api-doc")
      .apiProperty("api.title", "GeoCoding API").apiProperty("api.version", "1.0.0")
      .apiProperty("api.description", "API documented here: https://goo.gl/UqIsRf")
      .apiProperty("cors", "true");

    rest("/address").description("Google Address Lookup")
      .consumes("application/json")
      .produces("application/json")

      .get("/search").description("Address Search").outType(GeoCodeResponse.class)
      .param().name("address").type(query).description("Address to be used in the search").dataType("string").endParam()
      .responseMessage().code(200).message("Address found").endResponseMessage()
      .to("direct:lookup");

    from("direct:lookup")
      .log(LoggingLevel.INFO, "Searching for the address: ${header.address}")
      .to("bean:geoCodingTemplate?method=lookup(${header.address})")
      .bean(GeoCodeResponseProcessor.class, "parseToGeoCodeResponse");

  }
}
