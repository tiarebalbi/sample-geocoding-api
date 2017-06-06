package com.tiarebalbi.sample.geocodingapi.client;

import com.tiarebalbi.sample.geocodingapi.client.model.GeocodeResponse;

public interface GeocodingOperations {

  GeocodeResponse lookup(String address);

}