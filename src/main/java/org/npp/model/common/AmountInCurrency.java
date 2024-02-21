package org.npp.model.common;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

/**
 * A class supporting the definition of a unit of currency in a defined currency.
 */

@Schema(name = "AmountInCurrency", description = "A class supporting the definition of a unit of currency in a defined currency.")

public class AmountInCurrency {

  private String currencyType;

  private Float currencyValue;

  public AmountInCurrency() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AmountInCurrency(String currencyType, Float currencyValue) {
    this.currencyType = currencyType;
    this.currencyValue = currencyValue;
  }

  public AmountInCurrency currencyType(String currencyType) {
    this.currencyType = currencyType;
    return this;
  }

  /**
   * Code for the specified currency as defined in ISO 4217.
   * @return currencyType
  */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currencyType", example = "EUR", description = "Code for the specified currency as defined in ISO 4217.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currencyType")
  public String getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(String currencyType) {
    this.currencyType = currencyType;
  }

  public AmountInCurrency currencyValue(Float currencyValue) {
    this.currencyValue = currencyValue;
    return this;
  }

  /**
   * The amount of currency specified in the given currency code type.
   * @return currencyValue
  */
  @NotNull 
  @Schema(name = "currencyValue", description = "The amount of currency specified in the given currency code type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currencyValue")
  public Float getCurrencyValue() {
    return currencyValue;
  }

  public void setCurrencyValue(Float currencyValue) {
    this.currencyValue = currencyValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountInCurrency amountInCurrency = (AmountInCurrency) o;
    return Objects.equals(this.currencyType, amountInCurrency.currencyType) &&
        Objects.equals(this.currencyValue, amountInCurrency.currencyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyType, currencyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountInCurrency {\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    currencyValue: ").append(toIndentedString(currencyValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

