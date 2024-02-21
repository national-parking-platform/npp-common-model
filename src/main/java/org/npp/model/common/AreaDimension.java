package org.npp.model.common;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.enums.UnitOfMeasureAreaEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

/**
 * A class defining information concerning an area measurement with unit.
 */

@Schema(name = "AreaDimension", description = "A class defining information concerning an area measurement with unit.")

public class AreaDimension {

  private Float measure;

  private UnitOfMeasureAreaEnum unitOfMeasure;

  public AreaDimension() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AreaDimension(Float measure, UnitOfMeasureAreaEnum unitOfMeasure) {
    this.measure = measure;
    this.unitOfMeasure = unitOfMeasure;
  }

  public AreaDimension measure(Float measure) {
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

  public AreaDimension unitOfMeasure(UnitOfMeasureAreaEnum unitOfMeasure) {
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
  public UnitOfMeasureAreaEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitOfMeasureAreaEnum unitOfMeasure) {
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
    AreaDimension areaDimension = (AreaDimension) o;
    return Objects.equals(this.measure, areaDimension.measure) &&
        Objects.equals(this.unitOfMeasure, areaDimension.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measure, unitOfMeasure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaDimension {\n");
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

