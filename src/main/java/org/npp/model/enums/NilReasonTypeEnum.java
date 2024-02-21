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
 * * `inapplicable`: there is no value * `missing`: the correct value is not readily available to the sender of this data. Furthermore, a correct value may not exist * `template`: the value will be available later * `unknown`: the correct value is not known to, and not computable by, the sender of this data. However, a correct value probably exists * `withheld`: the value is not divulged
 */


public enum NilReasonTypeEnum {
  
  INAPPLICABLE("inapplicable"),
  
  MISSING("missing"),
  
  TEMPLATE("template"),
  
  UNKNOWN("unknown"),
  
  WITHHELD("withheld");

  private String value;

  NilReasonTypeEnum(String value) {
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
  public static NilReasonTypeEnum fromValue(String value) {
    for (NilReasonTypeEnum b : NilReasonTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

