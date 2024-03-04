package org.npp.model.vehicle;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.common.enums.ComparisonOperatorEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Width characteristic of a vehicle
 */

@Schema(name = "WidthCharacteristic", description = "Width characteristic of a vehicle")

public class WidthCharacteristic {

  private ComparisonOperatorEnum comparisonOperator;

  private Float vehicleWidth;

  public WidthCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WidthCharacteristic(ComparisonOperatorEnum comparisonOperator, Float vehicleWidth) {
    this.comparisonOperator = comparisonOperator;
    this.vehicleWidth = vehicleWidth;
  }

  public WidthCharacteristic comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  /**
   * Get comparisonOperator
   * @return comparisonOperator
  */
  @NotNull @Valid 
  @Schema(name = "comparisonOperator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comparisonOperator")
  public ComparisonOperatorEnum getComparisonOperator() {
    return comparisonOperator;
  }

  public void setComparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }

  public WidthCharacteristic vehicleWidth(Float vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
    return this;
  }

  /**
   * The maximum width of an individual vehicle, including any features embedded or fixed on it, in metres
   * minimum: 0
   * @return vehicleWidth
  */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "vehicleWidth", description = "The maximum width of an individual vehicle, including any features embedded or fixed on it, in metres", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleWidth")
  public Float getVehicleWidth() {
    return vehicleWidth;
  }

  public void setVehicleWidth(Float vehicleWidth) {
    this.vehicleWidth = vehicleWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidthCharacteristic widthCharacteristic = (WidthCharacteristic) o;
    return Objects.equals(this.comparisonOperator, widthCharacteristic.comparisonOperator) &&
        Objects.equals(this.vehicleWidth, widthCharacteristic.vehicleWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, vehicleWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidthCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    vehicleWidth: ").append(toIndentedString(vehicleWidth)).append("\n");
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

