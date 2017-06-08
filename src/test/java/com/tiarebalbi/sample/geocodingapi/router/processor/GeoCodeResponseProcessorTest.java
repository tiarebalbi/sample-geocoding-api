package com.tiarebalbi.sample.geocodingapi.router.processor;

import com.tiarebalbi.sample.geocodingapi.client.model.Geometry;
import com.tiarebalbi.sample.geocodingapi.client.model.GoogleSearchResponse;
import com.tiarebalbi.sample.geocodingapi.client.model.Location;
import com.tiarebalbi.sample.geocodingapi.client.model.Result;
import com.tiarebalbi.sample.geocodingapi.router.model.GeoCodeResponse;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeoCodeResponseProcessorTest {

  @Test
  public void shouldBeAbleToParseGoogleResultToGeoCodeResponse() {

    Result result = new Result();
    result.setFormattedAddress("Formatted Address");

    Geometry geometry = new Geometry();
    geometry.setLocation(new Location(-10d, -20d));

    result.setGeometry(geometry);

    GoogleSearchResponse googleResponse = new GoogleSearchResponse();
    googleResponse.setResult(result);


    GeoCodeResponseProcessor processor = new GeoCodeResponseProcessor();
    GeoCodeResponse geoCode = processor.parseToGeoCodeResponse(googleResponse);

    assertThat(geoCode.getFormattedAddress()).isEqualTo("Formatted Address");
    assertThat(geoCode.getLatitude()).isEqualTo(-10d);
    assertThat(geoCode.getLongitude()).isEqualTo(-20d);
  }

  @Test
  public void shouldIgnoreFormattedAddressIfNotAvailable() {
    Result result = new Result();

    Geometry geometry = new Geometry();
    geometry.setLocation(new Location(-10d, -20d));

    result.setGeometry(geometry);

    GoogleSearchResponse googleResponse = new GoogleSearchResponse();
    googleResponse.setResult(result);


    GeoCodeResponseProcessor processor = new GeoCodeResponseProcessor();
    GeoCodeResponse geoCode = processor.parseToGeoCodeResponse(googleResponse);

    assertThat(geoCode.getFormattedAddress()).isNullOrEmpty();
    assertThat(geoCode.getLatitude()).isEqualTo(-10d);
    assertThat(geoCode.getLongitude()).isEqualTo(-20d);
  }


  @Test
  public void shouldIgnoreLocationIfGeometryIsNotAvailable() {
    Result result = new Result();
    result.setFormattedAddress("Formatted Address");
    GoogleSearchResponse googleResponse = new GoogleSearchResponse();
    googleResponse.setResult(result);


    GeoCodeResponseProcessor processor = new GeoCodeResponseProcessor();
    GeoCodeResponse geoCode = processor.parseToGeoCodeResponse(googleResponse);

    assertThat(geoCode.getFormattedAddress()).isEqualTo("Formatted Address");
    assertThat(geoCode.getLatitude()).isNull();
    assertThat(geoCode.getLongitude()).isNull();
  }

  @Test
  public void shouldIgnoreAllValuesIfResultIsNull() {
    GoogleSearchResponse googleResponse = new GoogleSearchResponse();

    GeoCodeResponseProcessor processor = new GeoCodeResponseProcessor();
    GeoCodeResponse geoCode = processor.parseToGeoCodeResponse(googleResponse);

    assertThat(geoCode).isNotNull();
    assertThat(geoCode.getFormattedAddress()).isNullOrEmpty();
    assertThat(geoCode.getLatitude()).isNull();
    assertThat(geoCode.getLongitude()).isNull();
  }

}