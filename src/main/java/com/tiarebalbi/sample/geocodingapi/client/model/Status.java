package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Status")
@XmlEnum
public enum Status {

  OK,
  ZERO_RESULTS,
  OVER_QUERY_LIMIT,
  REQUEST_DENIED,
  INVALID_REQUEST;

  public static Status fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
