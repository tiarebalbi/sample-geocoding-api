package com.tiarebalbi.sample.geocodingapi.client.impl;

import com.tiarebalbi.sample.geocodingapi.client.GeoCodingOperations;
import com.tiarebalbi.sample.geocodingapi.client.model.GoogleSearchResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GeoCodingTemplateTest {

  @MockBean
  private RestTemplate restTemplate;

  @Autowired
  private GeoCodingOperations geoCodingOperations;

  @Test
  public void shouldSearchAddressWithGoogleApi() {
    given(
      this.restTemplate.getForEntity("https://maps.googleapis.com/maps/api/geocode/xml?address=Address", GoogleSearchResponse.class)
    ).willReturn(ResponseEntity.ok(new GoogleSearchResponse()));

    GoogleSearchResponse result = this.geoCodingOperations.lookup("Address");
    assertThat(result).isNotNull();
    verify(this.restTemplate).getForEntity("https://maps.googleapis.com/maps/api/geocode/xml?address=Address",
      GoogleSearchResponse.class);
  }

  @Test
  public void shouldReturnNullIfNoContentAvailable() {
    given(
      this.restTemplate.getForEntity("https://maps.googleapis.com/maps/api/geocode/xml?address=Address", GoogleSearchResponse.class)
    ).willReturn(ResponseEntity.ok().build());

    GoogleSearchResponse result = this.geoCodingOperations.lookup("Address");

    assertThat(result).isNull();
    verify(this.restTemplate).getForEntity("https://maps.googleapis.com/maps/api/geocode/xml?address=Address",
      GoogleSearchResponse.class);

  }

}