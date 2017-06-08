package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ResultType")
@XmlEnum
public enum ResultType {

  @XmlEnumValue("establishment")
  ESTABLISHMENT("establishment"),
  @XmlEnumValue("street_address")
  STREET_ADDRESS("street_address"),
  @XmlEnumValue("route")
  ROUTE("route"),
  @XmlEnumValue("intersection")
  INTERSECTION("intersection"),
  @XmlEnumValue("political")
  POLITICAL("political"),
  @XmlEnumValue("country")
  COUNTRY("country"),
  @XmlEnumValue("administrative_area_level_1")
  ADMINISTRATIVE_AREA_LEVEL_1("administrative_area_level_1"),
  @XmlEnumValue("administrative_area_level_2")
  ADMINISTRATIVE_AREA_LEVEL_2("administrative_area_level_2"),
  @XmlEnumValue("administrative_area_level_3")
  ADMINISTRATIVE_AREA_LEVEL_3("administrative_area_level_3"),
  @XmlEnumValue("colloquial_area")
  COLLOQUIAL_AREA("colloquial_area"),
  @XmlEnumValue("locality")
  LOCALITY("locality"),
  @XmlEnumValue("sublocality")
  SUBLOCALITY("sublocality"),
  @XmlEnumValue("neighborhood")
  NEIGHBORHOOD("neighborhood"),
  @XmlEnumValue("premise")
  PREMISE("premise"),
  @XmlEnumValue("subpremise")
  SUBPREMISE("subpremise"),
  @XmlEnumValue("postal_code")
  POSTAL_CODE("postal_code"),
  @XmlEnumValue("natural_feature")
  NATURAL_FEATURE("natural_feature"),
  @XmlEnumValue("airport")
  AIRPORT("airport"),
  @XmlEnumValue("park")
  PARK("park"),
  @XmlEnumValue("point_of_interest")
  POINT_OF_INTEREST("point_of_interest");
  private final String value;

  ResultType(String v) {
    value = v;
  }

  public static ResultType fromValue(String v) {
    for (ResultType c : ResultType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String value() {
    return value;
  }

}
