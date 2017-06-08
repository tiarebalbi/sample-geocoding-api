package com.tiarebalbi.sample.geocodingapi.client.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "api.error.server")
public class GoogleApiHttpServerException extends GoogleApiHttpStatusCodeException {
  public GoogleApiHttpServerException(HttpStatus statusCode) {
    super(statusCode);
  }
}
