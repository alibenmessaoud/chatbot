package io.b.app.rest;

public class UpdateResponse {
  private String message;

  public UpdateResponse(String value) {
    this.message = String.format("Updated request for %s", value);
  }

  public String getMessage() {
    return message;
  }
}