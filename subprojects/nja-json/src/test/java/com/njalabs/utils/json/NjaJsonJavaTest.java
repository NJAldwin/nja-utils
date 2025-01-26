package com.njalabs.utils.json;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NjaJsonJavaTest {
  @Test
  public void itInstantiatesAMapper() throws JsonProcessingException {
    ObjectMapper mapper = NjaJson.getMapper();

    String val = mapper.readValue("\"hello\"", String.class);
    assertEquals("hello", val);
  }

  @Test
  @SuppressWarnings("AccessStaticViaInstance")
  public void itInstantiatesAMapperViaInstance () throws JsonProcessingException {
    ObjectMapper mapper = NjaJson.INSTANCE.getMapper();

    String val = mapper.readValue("\"hello\"", String.class);
    assertEquals("hello", val);
  }
}
