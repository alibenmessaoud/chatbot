package io.b.domain.ports.driven;

import io.b.domain.entities.Temperature;

public interface SendTemperatureInNotification {
  void send(Temperature temperature);
}
