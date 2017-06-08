package com.tiarebalbi.sample.geocodingapi.client.impl;

import com.tiarebalbi.sample.geocodingapi.client.exceptions.GoogleApiHttpClientException;
import com.tiarebalbi.sample.geocodingapi.client.exceptions.GoogleApiHttpServerException;
import com.tiarebalbi.sample.geocodingapi.client.exceptions.GoogleApiHttpStatusCodeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

public class GoogleApiErrorHandling extends DefaultResponseErrorHandler {

  @Override
  public void handleError(ClientHttpResponse response) throws IOException {
    HttpStatus statusCode = response.getStatusCode();

    switch (statusCode.series()) {
      case CLIENT_ERROR:
        throw new GoogleApiHttpClientException(statusCode);
      case SERVER_ERROR:
        throw new GoogleApiHttpServerException(statusCode);
      default:
        throw new GoogleApiHttpStatusCodeException(statusCode);
    }
  }
}