package com.tiarebalbi.sample.geocodingapi.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressComponent", propOrder = {
  "longName",
  "shortName",
  "type"
})
public class AddressComponent {

  @JacksonXmlProperty(localName = "long_name")
  protected String longName;

  @JacksonXmlProperty(localName = "short_name")
  protected String shortName;

  @JacksonXmlProperty
  protected List<AddressComponentType> type;

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

  public List<AddressComponentType> getType() {
    return type;
  }

  public void setType(List<AddressComponentType> type) {
    this.type = type;
  }
}
