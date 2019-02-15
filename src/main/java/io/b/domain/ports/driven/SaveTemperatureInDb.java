package io.b.domain.ports.driven;

import io.b.domain.entities.Temperature;

public interface SaveTemperatureInDb {
  void store(Temperature temperature);
}
