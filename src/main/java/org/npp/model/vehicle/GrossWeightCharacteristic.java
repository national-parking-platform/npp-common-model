package org.npp.model.vehicle;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.common.enums.ComparisonOperatorEnum;
import org.npp.model.vehicle.enums.WeightTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Gross weight characteristic of a vehicle.
 */

@Schema(name = "GrossWeightCharacteristic", description = "Gross weight characteristic of a vehicle.")

public class GrossWeightCharacteristic {

  private ComparisonOperatorEnum comparisonOperator;

  private Float grossVehicleWeight;

  private WeightTypeEnum typeOfWeight;

  public GrossWeightCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GrossWeightCharacteristic(ComparisonOperatorEnum comparisonOperator, Float grossVehicleWeight, WeightTypeEnum typeOfWeight) {
    this.comparisonOperator = comparisonOperator;
    this.grossVehicleWeight = grossVehicleWeight;
    this.typeOfWeight = typeOfWeight;
  }

  public GrossWeightCharacteristic comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
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

  public GrossWeightCharacteristic grossVehicleWeight(Float grossVehicleWeight) {
    this.grossVehicleWeight = grossVehicleWeight;
    return this;
  }

  /**
   * The gross weight of the vehicle and its load, including any trailers (in Tonnes).
   * minimum: 0
   * @return grossVehicleWeight
  */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "grossVehicleWeight", description = "The gross weight of the vehicle and its load, including any trailers (in Tonnes).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grossVehicleWeight")
  public Float getGrossVehicleWeight() {
    return grossVehicleWeight;
  }

  public void setGrossVehicleWeight(Float grossVehicleWeight) {
    this.grossVehicleWeight = grossVehicleWeight;
  }

  public GrossWeightCharacteristic typeOfWeight(WeightTypeEnum typeOfWeight) {
    this.typeOfWeight = typeOfWeight;
    return this;
  }

  /**
   * Get typeOfWeight
   * @return typeOfWeight
  */
  @NotNull @Valid 
  @Schema(name = "typeOfWeight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeOfWeight")
  public WeightTypeEnum getTypeOfWeight() {
    return typeOfWeight;
  }

  public void setTypeOfWeight(WeightTypeEnum typeOfWeight) {
    this.typeOfWeight = typeOfWeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrossWeightCharacteristic grossWeightCharacteristic = (GrossWeightCharacteristic) o;
    return Objects.equals(this.comparisonOperator, grossWeightCharacteristic.comparisonOperator) &&
        Objects.equals(this.grossVehicleWeight, grossWeightCharacteristic.grossVehicleWeight) &&
        Objects.equals(this.typeOfWeight, grossWeightCharacteristic.typeOfWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, grossVehicleWeight, typeOfWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrossWeightCharacteristic {\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    grossVehicleWeight: ").append(toIndentedString(grossVehicleWeight)).append("\n");
    sb.append("    typeOfWeight: ").append(toIndentedString(typeOfWeight)).append("\n");
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

