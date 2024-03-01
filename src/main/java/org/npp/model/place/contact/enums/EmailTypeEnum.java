package org.npp.model.place.contact.enums;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the supported lists of different email contact types * `customerService`: The email contact is for customer service. * `general`: The email contact is general in nature. * `helpdesk`: The email contact is a helpdesk. * `individual`: The email contact is for a specified individual.
 */


public enum EmailTypeEnum {
  
  CUSTOMERSERVICE("customerService"),
  
  GENERAL("general"),
  
  HELPDESK("helpdesk"),
  
  INDIVIDUAL("individual");

  private String value;

  EmailTypeEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EmailTypeEnum fromValue(String value) {
    for (EmailTypeEnum b : EmailTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

