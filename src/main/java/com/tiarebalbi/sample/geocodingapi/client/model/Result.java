package com.tiarebalbi.sample.geocodingapi.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "Result", propOrder = {
  "type",
  "formattedAddress",
  "geometry"
})
public class Result {

  @XmlElement
  protected String type;
  @JacksonXmlProperty(localName = "formatted_address")
  protected String formattedAddress;

  @XmlElement(required = true)
  protected Geometry geometry;

  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean hasGeometry() {
    return geometry != null;
  }
}
