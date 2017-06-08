package com.tiarebalbi.sample.geocodingapi;

import com.google.common.collect.Maps;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@SpringBootApplication
public class GeoCodingApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(GeoCodingApiApplication.class, args);
  }


  @Configuration
  public static class ContextConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
      ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(), "/camel/*");
      registration.setName("CamelServlet");
      return registration;
    }

    @Bean
    public RestTemplate googleRestTemplate(GeoCodingApiProperties geoCodingApiProperties) {
      RestTemplate restTemplate = new RestTemplate();

      HashMap<String, Object> defaultUriVariables = Maps.newHashMap();
      defaultUriVariables.put("key", geoCodingApiProperties.getGoogleKey());
      restTemplate.setDefaultUriVariables(defaultUriVariables);

      return restTemplate;
    }
  }
}
