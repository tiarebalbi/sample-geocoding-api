package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"lng", "lat"})
public class Location {

  private String lng;

  private String lat;

  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }
}
