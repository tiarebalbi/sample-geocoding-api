package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"placeId", "formattedAddress", "addressComponent", "type", "geometry"})
public class Result {

  @XmlElement(name = "place_id")
  private String placeId;

  @XmlElement(name = "formatted_address")
  private String formattedAddress;

  @XmlElement(name = "address_component")
  private AddressComponent[] addressComponent;

  private String type;

  private Geometry geometry;

  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }

  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public AddressComponent[] getAddressComponent() {
    return addressComponent;
  }

  public void setAddressComponent(AddressComponent[] addressComponent) {
    this.addressComponent = addressComponent;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }
}
