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
 * Table with different units in which the delivery is measured. * `gasGallonEquivalent`: The amount of alternative fuel it takes to equal the energy content of one liquid gallon of gasoline. Used mostly in the US. * `imperialGallon`: Imperial Gallon (4.54609 litres) * `kg`: kilogram * `kWh`: kilowatt hour * `litre`: Litre * `m3`: cubic meter * `usGallon`: US-Gallon (3.785411784 litres)
 */


public enum DeliveryUnitEnum {
  
  GASGALLONEQUIVALENT("gasGallonEquivalent"),
  
  IMPERIALGALLON("imperialGallon"),
  
  KG("kg"),
  
  KWH("kWh"),
  
  LITRE("litre"),
  
  M3("m3"),
  
  USGALLON("usGallon");

  private String value;

  DeliveryUnitEnum(String value) {
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
  public static DeliveryUnitEnum fromValue(String value) {
    for (DeliveryUnitEnum b : DeliveryUnitEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

