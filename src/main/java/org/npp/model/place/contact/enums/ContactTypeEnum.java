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
 * Defines the supported lists of types of contact. * `customerService`: Contact details for parking customer support for a facility or specific entity * `emergencyContact`: Contact details for emergency assistance or support for a facility or specific entity specifically related to parking operations * `operator`: Contact details for the parking operator for a facility or specific entity * `owner`: Contact details for the owner of a facility or specific entity. * `propertyManager`: Contact details for the property manager of a facility or related facility. * `securityService`: Contact details for security services for a facility or specific entity
 */


public enum ContactTypeEnum {
  
  CUSTOMERSERVICE("customerService"),
  
  EMERGENCYCONTACT("emergencyContact"),
  
  OPERATOR("operator"),
  
  OWNER("owner"),
  
  PROPERTYMANAGER("propertyManager"),
  
  SECURITYSERVICE("securityService");

  private String value;

  ContactTypeEnum(String value) {
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
  public static ContactTypeEnum fromValue(String value) {
    for (ContactTypeEnum b : ContactTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

