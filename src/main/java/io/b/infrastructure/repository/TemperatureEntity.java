package io.b.infrastructure.repository;

public class TemperatureEntity {

  private final String location;
  private final Integer value;

  public TemperatureEntity(String location, Integer value) {
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
