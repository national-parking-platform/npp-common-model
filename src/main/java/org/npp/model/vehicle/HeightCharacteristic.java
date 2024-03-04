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
 * Height characteristic of a vehicle.
 */

@Schema(name = "HeightCharacteristic", description = "Height characteristic of a vehicle.")

public class HeightCharacteristic {

  private ComparisonOperatorEnum comparisonOperator;

  private Float vehicleHeight;

  public HeightCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HeightCharacteristic(ComparisonOperatorEnum comparisonOperator, Float vehicleHeight) {
    this.comparisonOperator = comparisonOperator;
    this.vehicleHeight = vehicleHeight;
  }

  public HeightCharacteristic comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
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

  public HeightCharacteristic vehicleHeight(Float vehicleHeight) {
    this.vehicleHeight = vehicleHeight;
    return this;
  }

  /**
   * The height of the highest part, excluding antennae, of an individual vehicle above the road surface, in metres.
   * minimum: 0
   * @return vehicleHeight
  */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "vehicleHeight", description = "The height of the highest part, excluding antennae, of an individual vehicle above the road surface, in metres.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleHeight")
  public Float getVehicleHeight() {
    return vehicleHeight;
  }

  public void setVehicleHeight(Float vehicleHeight) {
    this.vehicleHeight = vehicleHeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeightCharacteristic heightCharacteristic = (HeightCharacteristic) o;
    return Objects.equals(this.comparisonOperator, heightCharacteristic.comparisonOperator) &&
        Objects.equals(this.vehicleHeight, heightCharacteristic.vehicleHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, vehicleHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeightCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    vehicleHeight: ").append(toIndentedString(vehicleHeight)).append("\n");
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

