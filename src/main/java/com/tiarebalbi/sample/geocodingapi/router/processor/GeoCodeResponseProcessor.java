package com.tiarebalbi.sample.geocodingapi.router.processor;

import com.tiarebalbi.sample.geocodingapi.client.model.GoogleSearchResponse;
import com.tiarebalbi.sample.geocodingapi.client.model.Result;
import com.tiarebalbi.sample.geocodingapi.router.model.GeoCodeResponse;
import org.springframework.stereotype.Component;

@Component
public class GeoCodeResponseProcessor {

  public GeoCodeResponse parseToGeoCodeResponse(GoogleSearchResponse googleSearchResponse) {
    GeoCodeResponse geoCodeResponse = new GeoCodeResponse();

    if (!googleSearchResponse.hasResult()) {
      return geoCodeResponse;
    }

    Result result = googleSearchResponse.getResult();
    geoCodeResponse.setFormattedAddress(result.getFormattedAddress());

    if (result.hasGeometry() && result.getGeometry().hasLocation()) {
      geoCodeResponse.setLatitude(result.getGeometry().getLocation().getLat());
      geoCodeResponse.setLongitude(result.getGeometry().getLocation().getLng());
    }

    return geoCodeResponse;
  }

}
