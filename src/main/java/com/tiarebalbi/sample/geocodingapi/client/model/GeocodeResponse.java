package com.tiarebalbi.sample.geocodingapi.client.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GeocodeResponse {

  private Result result;

  private String status;

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
