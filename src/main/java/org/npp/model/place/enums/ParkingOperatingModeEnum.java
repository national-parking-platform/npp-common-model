package org.npp.model.place.enums;
  
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
 * A list of supported parking operation modes * `app`: App – payment is collected via an app that may also control access to the facility. * `payAndDisplay`: PND – pay and display. Vehicle displays a credential to show it is paid. Typically prepaid and short term. * `payByPlate`: PBP - pay by plate - vehicle registration or license plate is used for recording and enforcement either on street or off street. Payment is collected on a prepaid basis or at the exit. * `payBySpace`: PBS – pay by space. Vehicle makes a payment based on occupying a specific space. Typically prepaid. * `permit`: Similar to PND but for long term parking (e.g. monthly pass, quarterly, semester). * `ticket`: Payment is done with a ticket (e.g. with magnetic strip, barcode). Payment is collected at the exit.
 */


public enum ParkingOperatingModeEnum {
  
  APP("app"),
  
  PAYANDDISPLAY("payAndDisplay"),
  
  PAYBYPLATE("payByPlate"),
  
  PAYBYSPACE("payBySpace"),
  
  PERMIT("permit"),
  
  TICKET("ticket");

  private String value;

  ParkingOperatingModeEnum(String value) {
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
  public static ParkingOperatingModeEnum fromValue(String value) {
    for (ParkingOperatingModeEnum b : ParkingOperatingModeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

