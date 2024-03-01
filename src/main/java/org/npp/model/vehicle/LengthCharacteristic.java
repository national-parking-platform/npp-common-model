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
 * Length characteristic of a vehicle.
 */

@Schema(name = "LengthCharacteristic", description = "Length characteristic of a vehicle.")

public class LengthCharacteristic {

  private ComparisonOperatorEnum comparisonOperator;

  private Float vehicleLength;

  public LengthCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LengthCharacteristic(ComparisonOperatorEnum comparisonOperator, Float vehicleLength) {
    this.comparisonOperator = comparisonOperator;
    this.vehicleLength = vehicleLength;
  }

  public LengthCharacteristic comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
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

  public LengthCharacteristic vehicleLength(Float vehicleLength) {
    this.vehicleLength = vehicleLength;
    return this;
  }

  /**
   * The overall distance (in metres) between the front and back of an individual vehicle, including the length  of any trailers, couplings, embedded features.
   * minimum: 0
   * @return vehicleLength
  */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "vehicleLength", description = "The overall distance (in metres) between the front and back of an individual vehicle, including the length  of any trailers, couplings, embedded features.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleLength")
  public Float getVehicleLength() {
    return vehicleLength;
  }

  public void setVehicleLength(Float vehicleLength) {
    this.vehicleLength = vehicleLength;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LengthCharacteristic lengthCharacteristic = (LengthCharacteristic) o;
    return Objects.equals(this.comparisonOperator, lengthCharacteristic.comparisonOperator) &&
        Objects.equals(this.vehicleLength, lengthCharacteristic.vehicleLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, vehicleLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LengthCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    vehicleLength: ").append(toIndentedString(vehicleLength)).append("\n");
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

