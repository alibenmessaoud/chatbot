package io.b.app.rest;

import io.b.domain.entities.Temperature;

public class TemperatureRestMapper {

  public static Temperature toTemperature(UpdateRequest request) {
    return new Temperature(request.getLocation(), request.getValue());
  }
}
