package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"longName", "shortName", "type"})
public class AddressComponent {

  @XmlElement(name = "long_name")
  private String longName;

  @XmlElement(name = "short_name")
  private String shortName;

  private String type;

  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
