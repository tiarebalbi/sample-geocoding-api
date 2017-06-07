package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"southwest", "northeast"})
public class Viewport {

  private Southwest southwest;

  private Northeast northeast;

  public Southwest getSouthwest() {
    return southwest;
  }

  public void setSouthwest(Southwest southwest) {
    this.southwest = southwest;
  }

  public Northeast getNortheast() {
    return northeast;
  }

  public void setNortheast(Northeast northeast) {
    this.northeast = northeast;
  }
}
