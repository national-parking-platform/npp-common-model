package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.place.enums.UnitOfMeasureDistanceEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information concerning a linear measure (distance) with unit.
 */

@Schema(name = "LinearDimension", description = "A class defining information concerning a linear measure (distance) with unit.")

public class LinearDimension {

  private Float measure;

  private UnitOfMeasureDistanceEnum unitOfMeasure;

  public LinearDimension() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LinearDimension(Float measure, UnitOfMeasureDistanceEnum unitOfMeasure) {
    this.measure = measure;
    this.unitOfMeasure = unitOfMeasure;
  }

  public LinearDimension measure(Float measure) {
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

  public LinearDimension unitOfMeasure(UnitOfMeasureDistanceEnum unitOfMeasure) {
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
  public UnitOfMeasureDistanceEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitOfMeasureDistanceEnum unitOfMeasure) {
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
    LinearDimension linearDimension = (LinearDimension) o;
    return Objects.equals(this.measure, linearDimension.measure) &&
        Objects.equals(this.unitOfMeasure, linearDimension.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measure, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearDimension {\n");
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

