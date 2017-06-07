package com.tiarebalbi.sample.geocodingapi;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "geocoding.api")
public class GeoCodingApiProperties {

  private String googleKey;

  public String getGoogleKey() {
    return googleKey;
  }

  public void setGoogleKey(String googleKey) {
    this.googleKey = googleKey;
  }
}
