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
 * A list of the supported methods for issuing credentials. * `electronic`: electronically issued, traceable * `permit`: physical identifier, typically visibly mounted within vehicle * `ticket`: typically single use, paper based
 */


public enum IssueMethodEnum {
  
  ELECTRONIC("electronic"),
  
  TICKET("ticket"),
  
  PERMIT("permit");

  private String value;

  IssueMethodEnum(String value) {
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
  public static IssueMethodEnum fromValue(String value) {
    for (IssueMethodEnum b : IssueMethodEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

