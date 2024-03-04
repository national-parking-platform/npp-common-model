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
 * Type of usage for an electric charging point * `electricalDevices`: Provides a plug for electrical devices (e.g. shaver, mobile phones, hair dryer, ...) * `electricBike`: Charging of E-Bikes * `electricBoat`: Charging of electric boats * `electricMotorcycle`: Charging of E-Motorcycles * `electricVehicle`: Charging of electric vehicles * `lorryPowerCosumption`: Supply for lorries with power consumption, e.g. for refrigerated goods transports. * `motorhomeOrCaravanSupply`: Supply for motorhomes or caravans * `other`: Other usage for the electric charging stations. * `overheadLineDrivenVehicles`: The charging point supplies a overhead line, usually connected via pantographs
 */


public enum ChargingPointUsageTypeEnum {
  
  ELECTRICALDEVICES("electricalDevices"),
  
  ELECTRICBIKE("electricBike"),
  
  ELECTRICBOAT("electricBoat"),
  
  ELECTRICMOTORCYCLE("electricMotorcycle"),
  
  ELECTRICVEHICLE("electricVehicle"),
  
  LORRYPOWERCONSUMPTION("lorryPowerConsumption"),
  
  MOTORHOMEORCARAVANSUPPLY("motorhomeOrCaravanSupply"),
  
  OTHER("other"),
  
  OVERHEADLINEDRIVENVEHICLES("overheadLineDrivenVehicles");

  private String value;

  ChargingPointUsageTypeEnum(String value) {
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
  public static ChargingPointUsageTypeEnum fromValue(String value) {
    for (ChargingPointUsageTypeEnum b : ChargingPointUsageTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

