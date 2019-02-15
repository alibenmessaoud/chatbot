package io.b.app.rest;

public class UpdateRequest {
  private String location;
  private Integer value;

  public UpdateRequest() {
    // intentionally left blank
  }

  public UpdateRequest(String location, Integer value) {
    this.location = location;
    this.value = value;
  }

  public String getLocation() {
    return location;
  }

  public Integer getValue() {
    return value;
  }
}