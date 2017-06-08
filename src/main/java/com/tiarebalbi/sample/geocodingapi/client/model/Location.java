package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
  "lat",
  "lng"
})
public class Location {

  protected Double lat;
  @XmlElement(required = true)
  protected Double lng;


  public Location(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public Location() {
  }

  /**
   * Gets the value of the lat property.
   */
  public Double getLat() {
    return lat;
  }

  /**
   * Sets the value of the lat property.
   */
  public void setLat(Double value) {
    this.lat = value;
  }

  /**
   * Gets the value of the lng property.
   *
   * @return possible object is
   * {@link String }
   */
  public Double getLng() {
    return lng;
  }

  /**
   * Sets the value of the lng property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLng(Double value) {
    this.lng = value;
  }

}
