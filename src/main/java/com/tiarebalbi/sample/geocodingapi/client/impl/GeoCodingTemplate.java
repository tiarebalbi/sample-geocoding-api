package com.tiarebalbi.sample.geocodingapi.client.impl;

import com.tiarebalbi.sample.geocodingapi.client.GeoCodingOperations;
import com.tiarebalbi.sample.geocodingapi.client.model.GoogleSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeoCodingTemplate implements GeoCodingOperations {

  private final static String XML_ENDPOINT = "https://maps.googleapis.com/maps/api/geocode/xml?address=";

  @Autowired
  @Qualifier("googleRestTemplate")
  private RestTemplate restTemplate;

  @Override
  public GoogleSearchResponse lookup(String address) {
    String endpoint = getEndpoint(address);
    ResponseEntity<GoogleSearchResponse> response = this.restTemplate.getForEntity(endpoint, GoogleSearchResponse.class);

    if (response.hasBody()) {
      return response.getBody();
    }

    return null;
  }

  private String getEndpoint(String address) {
    return XML_ENDPOINT + address;
  }

}