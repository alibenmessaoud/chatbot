package io.b.infrastructure.mail;

import io.b.domain.entities.Temperature;
import io.b.domain.ports.driven.SendTemperatureInNotification;

import java.util.List;
import java.util.logging.Logger;

import static java.lang.String.format;

public class SendEmailInMemory implements SendTemperatureInNotification {

  private static final Logger LOG = Logger.getLogger(SendEmailInMemory.class.getName());

  @Override
  public void send(Temperature temperature) {

    // use a service to get the list of the subscribers
    List<String> subscribers = List.of("world");

    subscribers.forEach(subscriber -> {
      Message messageToSend = new Message(temperature.toString(), subscriber);

      // send an email using an external service like twilio

      LOG.info(format("SUCCESS: SENT TO %s", subscriber));
    });

  }
}
