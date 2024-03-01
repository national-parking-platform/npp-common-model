package org.npp.model.quote.enums;
  
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
 * A list of supported reasons if a requested session extension request is not provided * `existingSessionNotFound`: Error – the existing session referenced is not found * `incorrectCredentialsSupplied`: Error – credential details supplied are incorrect * `noExtensionPossible`: Error – the requested extension is not possible
 */


public enum QuoteRightResponseExtensionReasonEnum {
  
  EXISTINGSESSIONNOTFOUND("existingSessionNotFound"),
  
  INCORRECTCREDENTIALSSUPPLIED("incorrectCredentialsSupplied"),
  
  NOEXTENSIONPOSSIBLE("noExtensionPossible");

  private String value;

  QuoteRightResponseExtensionReasonEnum(String value) {
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
  public static QuoteRightResponseExtensionReasonEnum fromValue(String value) {
    for (QuoteRightResponseExtensionReasonEnum b : QuoteRightResponseExtensionReasonEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

