package com.tiarebalbi.sample.geocodingapi.client;

import com.tiarebalbi.sample.geocodingapi.client.model.GoogleSearchResponse;

public interface GeoCodingOperations {

  GoogleSearchResponse lookup(String address);

}