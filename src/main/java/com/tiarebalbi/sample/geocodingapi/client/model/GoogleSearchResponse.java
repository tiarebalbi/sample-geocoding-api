package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeResponse", propOrder = {
  "status",
  "result"
})
@XmlRootElement(name = "GeocodeResponse")
public class GoogleSearchResponse {


  @XmlElement(required = true)
  protected Status status;
  protected Result result;


  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public boolean hasResult() {
    return this.result != null;
  }
}
