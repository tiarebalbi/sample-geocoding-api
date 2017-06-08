package com.tiarebalbi.sample.geocodingapi.client.exceptions;

import org.springframework.http.HttpStatus;

public class GoogleApiHttpStatusCodeException extends RuntimeException {

  private final HttpStatus status;

  public GoogleApiHttpStatusCodeException(HttpStatus status) {
    super(String.format("%d (%s)", status.value(), status.getReasonPhrase()));
    this.status = status;
  }

  public HttpStatus getStatus() {
    return status;
  }
}
