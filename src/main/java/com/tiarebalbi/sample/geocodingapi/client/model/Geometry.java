package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"viewport", "locationType", "location"})
public class Geometry {

  private Viewport viewport;

  @XmlElement(name = "location_type")
  private String locationType;

  private Location location;

  public Viewport getViewport() {
    return viewport;
  }

  public void setViewport(Viewport viewport) {
    this.viewport = viewport;
  }

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
}
