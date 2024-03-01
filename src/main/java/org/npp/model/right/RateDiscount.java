package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.payment.AmountInCurrency;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Class defining discount rates to be applied to a RateTable
 */

@Schema(name = "RateDiscount", description = "Class defining discount rates to be applied to a RateTable")

public class RateDiscount {

  private AmountInCurrency fixedValue;

  private Float discountRate;

  public RateDiscount fixedValue(AmountInCurrency fixedValue) {
    this.fixedValue = fixedValue;
    return this;
  }

  /**
   * Get fixedValue
   * @return fixedValue
  */
  @Valid 
  @Schema(name = "fixedValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fixedValue")
  public AmountInCurrency getFixedValue() {
    return fixedValue;
  }

  public void setFixedValue(AmountInCurrency fixedValue) {
    this.fixedValue = fixedValue;
  }

  public RateDiscount discountRate(Float discountRate) {
    this.discountRate = discountRate;
    return this;
  }

  /**
   * Proportionate discount (-) or surcharge (+) to be applied to all values in the referenced RateTable.
   * minimum: 0
   * maximum: 100
   * @return discountRate
  */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "discountRate", description = "Proportionate discount (-) or surcharge (+) to be applied to all values in the referenced RateTable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountRate")
  public Float getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(Float discountRate) {
    this.discountRate = discountRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateDiscount rateDiscount = (RateDiscount) o;
    return Objects.equals(this.fixedValue, rateDiscount.fixedValue) &&
        Objects.equals(this.discountRate, rateDiscount.discountRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedValue, discountRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateDiscount {\n");
    sb.append("    fixedValue: ").append(toIndentedString(fixedValue)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
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

