package io.b.infrastructure.repository;


import io.b.domain.entities.Temperature;
import io.b.domain.ports.driven.SaveTemperatureInDb;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import static io.b.infrastructure.repository.TemperatureDbMapper.toTemperatureEntity;
import static java.lang.String.format;

public class TemperatureDbInMemory implements SaveTemperatureInDb {

  private static final Logger LOG = Logger.getLogger(TemperatureDbInMemory.class.getName());

  private Map<String, TemperatureEntity> temperatureMap = new HashMap<>();
  // or use JpaRepository for eg. to to store the TemperatureEntity

  @Override
  public void store(Temperature temperature) {

    TemperatureEntity temperatureEntity = toTemperatureEntity(temperature);

    temperatureMap.put(temperature.getLocation(), temperatureEntity);

    LOG.info(format("STORED, %s", temperature.toString()));
  }
}
