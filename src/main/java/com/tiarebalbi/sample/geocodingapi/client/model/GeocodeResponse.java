package com.tiarebalbi.sample.geocodingapi.client.model;

public class GeocodeResponse {

  private String formattedAddress;

  private Double latitude;

  private Double longitude;

  public GeocodeResponse(String formattedAddress, Double latitude, Double longitude) {
    this.formattedAddress = formattedAddress;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public String getFormattedAddress() {
    return formattedAddress;
  }

  public Double getLatitude() {
    return latitude;
  }

  public Double getLongitude() {
    return longitude;
  }
}
