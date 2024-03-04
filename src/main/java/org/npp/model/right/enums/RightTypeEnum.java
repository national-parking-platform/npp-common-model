package org.npp.model.right.enums;
  
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
 * Defines the type of RightSpecification * `accessPermission`: intended grant access permission * `loadingUnloading`: intended granting permissions to load and unload vehicles. * `oneTimeUseParking`: intended for one time or limited parking usage * `permitParking`: intended for multi-use parking usage * `setdownPickup`: intended for passenger setdown and pickup * `waiting`: intended to grant permission for an accompanied vehicle to wait
 */


public enum RightTypeEnum {
  
  ACCESSPERMISSION("accessPermission"),
  
  LOADINGUNLOADING("loadingUnloading"),
  
  ONETIMEUSEPARKING("oneTimeUseParking"),
  
  PERMITPARKING("permitParking"),
  
  SETDOWNPICKUP("setdownPickup"),
  
  WAITING("waiting");

  private String value;

  RightTypeEnum(String value) {
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
  public static RightTypeEnum fromValue(String value) {
    for (RightTypeEnum b : RightTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

