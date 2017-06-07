package com.tiarebalbi.sample.geocodingapi.client.impl;

import com.tiarebalbi.sample.geocodingapi.client.GeoCodingOperations;
import com.tiarebalbi.sample.geocodingapi.client.model.GoogleSearchResponse;
import org.springframework.stereotype.Service;

@Service
public class GeoCodingTemplate implements GeoCodingOperations {

//  @Autowired
//  private RestTemplate restTemplate;

  @Override
  public GoogleSearchResponse lookup(String address) {
    String endpoint = buildEndpoint(address);

    GoogleSearchResponse googleSearchResponse = new GoogleSearchResponse();
    googleSearchResponse.setFormattedAddress(endpoint);
    googleSearchResponse.setLatitude(2d);
    return googleSearchResponse;
  }

  private String buildEndpoint(String address) {
    return "http://" + address;
  }

}
