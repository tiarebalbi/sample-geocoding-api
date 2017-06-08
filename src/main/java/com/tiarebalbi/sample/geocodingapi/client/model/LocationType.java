package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LocationType")
@XmlEnum
public enum LocationType {

  ROOFTOP,
  RANGE_INTERPOLATED,
  GEOMETRIC_CENTER,
  APPROXIMATE;

  public static LocationType fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
