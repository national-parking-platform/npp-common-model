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
 * Logical comparison operations * `equalTo`: Logical comparison operator of \"equal to\". * `greaterThan`: Logical comparison operator of \"greater than\". * `greaterThanOrEqualTo`: Logical comparison operator of \"greater than or equal to\". * `lessThan`: Logical comparison operator of \"less than\". * `lessThanOrEqualTo`: Logical comparison operator of \"less than or equal to\".
 */


public enum ComparisonOperatorEnum {
  
  EQUALTO("equalTo"),
  
  GREATERTHAN("greaterThan"),
  
  GREATERTHANOREQUALTO("greaterThanOrEqualTo"),
  
  LESSTHAN("lessThan"),
  
  LESSTHANOREQUALTO("lessThanOrEqualTo");

  private String value;

  ComparisonOperatorEnum(String value) {
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
  public static ComparisonOperatorEnum fromValue(String value) {
    for (ComparisonOperatorEnum b : ComparisonOperatorEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

