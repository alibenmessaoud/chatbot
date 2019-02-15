package io.b.app.rest;

import io.b.domain.ports.driver.StoreAndNotifyTemperature;
import io.b.domain.usecase.WeatherService;
import io.b.infrastructure.mail.SendEmailInMemory;
import io.b.infrastructure.repository.TemperatureDbInMemory;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static io.b.app.rest.TemperatureRestMapper.toTemperature;

@Path("/weather")
public class UpdateTemperatureResource {

  private final StoreAndNotifyTemperature weatherService;

  public UpdateTemperatureResource() {
    weatherService = new WeatherService(new SendEmailInMemory(), new TemperatureDbInMemory());
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response update(UpdateRequest request) {
    weatherService.storeAndNotify(toTemperature(request));
    UpdateResponse response = new UpdateResponse(request.getLocation());
    return Response.ok(response).build();
  }

}