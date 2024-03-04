package org.npp.model.time.enums;
  
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
 * Specifies the time period with non-precise characteristics * `autumn`: Beginning of autumn/fall (Source: ISO 20524-1) * `dawn`: Starts at dawn (Source: ISO 20524-1) * `day`: Start of day (Source: ISO 20524-1) * `drySeason`: Beginning of dry season (Source: ISO 20524-1) * `dusk`: Starts at dusk (Source: ISO 20524-1) * `external`: Starting period controlled by external device (Source: ISO 20524-1) * `highTide`: Beginning of high tide (Source: ISO 20524-1) * `highWater`: Beginning of high water (Source: ISO 20524-1) * `holiday`: Starts at any holiday (Source: ISO 20524-1) * `lowTide`: Beginning of low tide (Source: ISO 20524-1) * `lowWater`: Beginning of low water (Source: ISO 20524-1) * `night`: Start of night (Source: ISO 20524-1) * `offpeakHours`: Start of off-peak hours (Source: ISO 20524-1) * `peakHours`: Start of peak hours, peak hours include rush hour and activity/scheduled event based times. These would vary by location and by season (Source: ISO 20524-1) * `school`: Starts at any school period (date and hour) (Source: ISO 20524-1) * `spring`: Beginning of spring (Source: ISO 20524-1) * `summer`: Beginning of summer (Source: ISO 20524-1) * `wetSeason`: Beginning of wet season (Source: ISO 20524-1) * `winter`: Beginning of winter (Source: ISO 20524-1)
 */


public enum FuzzyTimeTypeEnum {
  
  AUTUMN("autumn"),
  
  DAWN("dawn"),
  
  DAY("day"),
  
  DRYSEASON("drySeason"),
  
  DUSK("dusk"),
  
  EXTERNAL("external"),
  
  HIGHTIDE("highTide"),
  
  HIGHWATER("highWater"),
  
  HOLIDAY("holiday"),
  
  LOWTIDE("lowTide"),
  
  LOWWATER("lowWater"),
  
  NIGHT("night"),
  
  OFFPEAKHOURS("offpeakHours"),
  
  PEAKHOURS("peakHours"),
  
  SCHOOL("school"),
  
  SPRING("spring"),
  
  SUMMER("summer"),
  
  WETSEASON("wetSeason"),
  
  WINTER("winter");

  private String value;

  FuzzyTimeTypeEnum(String value) {
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
  public static FuzzyTimeTypeEnum fromValue(String value) {
    for (FuzzyTimeTypeEnum b : FuzzyTimeTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

