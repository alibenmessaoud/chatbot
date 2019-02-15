package io.b.infrastructure.mail;

public class Message {

  private String text;
  private String to;

  public Message(String text, String to) {
    this.text = text;
    this.to = to;
  }

  public String getText() {
    return text;
  }

  public String getTo() {
    return to;
  }
}
