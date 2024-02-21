package org.npp.model.enums;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of fuel used by a vehicle :  * `all`: All sort of fuel is accepted * `battery`: Battery * `biodiesel`: Biodiesel * `diesel`: Fuel used for compression - ignition (CI) engines * `dieselBatteryHybrid`: Diesel and battery hybrid * `ethanol`: Ethanol\\n* `hydrogen`: Hydrogen * `liquidGas`: Liquid gas of any type including LPG * `lpg`: Liquid petroleum gas\\n* `methane`: Methane gas * `other`: Other\\n* `petrol`: Fuel used for positive-ignition (PI) engines * `petrol95Octane`: Petrol with 95 octane\\n* `petrol98Octane`: Petrol with 98 octane * `petrolBatteryHybrid`: Petrol and battery hybrid * `petrolLeaded`: Leaded petrol * `petrolUnleaded`: Unleaded petrol * `unknown`: The sort of fuel is not known\"
 */


public enum FuelTypeEnum {
  
  ALL("all"),
  
  BATTERY("battery"),
  
  BIODIESEL("biodiesel"),
  
  DIESEL("diesel"),
  
  DIESELBATTERYHYBRID("dieselBatteryHybrid"),
  
  ETHANOL("ethanol"),
  
  HYDROGEN("hydrogen"),
  
  LIQUIDGAS("liquidGas"),
  
  LPG("lpg"),
  
  METHANE("methane"),
  
  OTHER("other"),
  
  PETROL("petrol"),
  
  PETROL95OCTANE("petrol95Octane"),
  
  PETROL98OCTANE("petrol98Octane"),
  
  PETROLBATTERYHYBRID("petrolBatteryHybrid"),
  
  PETROLLEADED("petrolLeaded"),
  
  PETROLUNLEADED("petrolUnleaded"),
  
  UNKNOWN("unknown");

  private String value;

  FuelTypeEnum(String value) {
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
  public static FuelTypeEnum fromValue(String value) {
    for (FuelTypeEnum b : FuelTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

