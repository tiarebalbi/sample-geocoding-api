package com.tiarebalbi.sample.geocodingapi.router;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class GeoCodingRouterTest extends CamelTestSupport {

  @Produce(uri = "direct:lookup")
  protected ProducerTemplate template;

  @Test
  public void shouldRequestSearch() {

  }

}