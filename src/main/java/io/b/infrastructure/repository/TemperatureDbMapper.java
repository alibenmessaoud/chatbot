package io.b.infrastructure.repository;

import io.b.domain.entities.Temperature;

public class TemperatureDbMapper {

  public static Temperature toTemperature(TemperatureEntity temperatureEntity) {
    return new Temperature(temperatureEntity.getLocation(), temperatureEntity.getValue());
  }

  public static TemperatureEntity toTemperatureEntity(Temperature temperature) {
    return new TemperatureEntity(temperature.getLocation(), temperature.getValue());
  }
}
