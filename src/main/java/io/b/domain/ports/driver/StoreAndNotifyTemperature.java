package io.b.domain.ports.driver;

import io.b.domain.entities.Temperature;

public interface StoreAndNotifyTemperature {
  void storeAndNotify(Temperature temperature);
}
