package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.place.enums.UnitOfMeasureWeightEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information concerning a weight quantity with unit.
 */

@Schema(name = "WeightDimension", description = "A class defining information concerning a weight quantity with unit.")

public class WeightDimension {

  private Float measure;

  private UnitOfMeasureWeightEnum unitOfMeasure;

  public WeightDimension() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WeightDimension(Float measure, UnitOfMeasureWeightEnum unitOfMeasure) {
    this.measure = measure;
    this.unitOfMeasure = unitOfMeasure;
  }

  public WeightDimension measure(Float measure) {
    this.measure = measure;
    return this;
  }

  /**
   * Quantity in the defined unit of measure.
   * @return measure
  */
  @NotNull 
  @Schema(name = "measure", description = "Quantity in the defined unit of measure.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("measure")
  public Float getMeasure() {
    return measure;
  }

  public void setMeasure(Float measure) {
    this.measure = measure;
  }

  public WeightDimension unitOfMeasure(UnitOfMeasureWeightEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  */
  @NotNull @Valid 
  @Schema(name = "unitOfMeasure", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unitOfMeasure")
  public UnitOfMeasureWeightEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitOfMeasureWeightEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeightDimension weightDimension = (WeightDimension) o;
    return Objects.equals(this.measure, weightDimension.measure) &&
        Objects.equals(this.unitOfMeasure, weightDimension.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measure, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeightDimension {\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

