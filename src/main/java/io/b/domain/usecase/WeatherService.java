package io.b.domain.usecase;

import io.b.domain.entities.Temperature;
import io.b.domain.ports.driven.SaveTemperatureInDb;
import io.b.domain.ports.driven.SendTemperatureInNotification;
import io.b.domain.ports.driver.StoreAndNotifyTemperature;

public class WeatherService implements StoreAndNotifyTemperature {

  private SendTemperatureInNotification sendTemperatureInNotification;
  private SaveTemperatureInDb saveTemperatureInDb;

  public WeatherService(SendTemperatureInNotification sendTemperatureInNotification,
                        SaveTemperatureInDb saveTemperatureInDb) {
    this.sendTemperatureInNotification = sendTemperatureInNotification;
    this.saveTemperatureInDb = saveTemperatureInDb;
  }

  @Override
  public void storeAndNotify(Temperature temperature) {
    saveTemperatureInDb.store(temperature);
    sendTemperatureInNotification.send(temperature);
  }
}
