package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.place.characteristics.AreaDimension;
import org.npp.model.place.characteristics.LinearDimension;
import org.npp.model.place.characteristics.WeightDimension;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A component that provides dimension information.  The product of width and height must not be necessarily be the square footage (e.g. in multi-storey buildings or when some zones are not part of the square footage).
 */

@Schema(name = "SpaceDimension", description = "A component that provides dimension information.  The product of width and height must not be necessarily be the square footage (e.g. in multi-storey buildings or when some zones are not part of the square footage).")

public class SpaceDimension {

  private LinearDimension dimensionHeight;

  private LinearDimension dimensionLength;

  private LinearDimension dimensionWidth;

  private AreaDimension dimensionUsableArea;

  private WeightDimension weightLimit;

  public SpaceDimension dimensionHeight(LinearDimension dimensionHeight) {
    this.dimensionHeight = dimensionHeight;
    return this;
  }

  /**
   * Get dimensionHeight
   * @return dimensionHeight
  */
  @Valid 
  @Schema(name = "dimensionHeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimensionHeight")
  public LinearDimension getDimensionHeight() {
    return dimensionHeight;
  }

  public void setDimensionHeight(LinearDimension dimensionHeight) {
    this.dimensionHeight = dimensionHeight;
  }

  public SpaceDimension dimensionLength(LinearDimension dimensionLength) {
    this.dimensionLength = dimensionLength;
    return this;
  }

  /**
   * Get dimensionLength
   * @return dimensionLength
  */
  @Valid 
  @Schema(name = "dimensionLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimensionLength")
  public LinearDimension getDimensionLength() {
    return dimensionLength;
  }

  public void setDimensionLength(LinearDimension dimensionLength) {
    this.dimensionLength = dimensionLength;
  }

  public SpaceDimension dimensionWidth(LinearDimension dimensionWidth) {
    this.dimensionWidth = dimensionWidth;
    return this;
  }

  /**
   * Get dimensionWidth
   * @return dimensionWidth
  */
  @Valid 
  @Schema(name = "dimensionWidth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimensionWidth")
  public LinearDimension getDimensionWidth() {
    return dimensionWidth;
  }

  public void setDimensionWidth(LinearDimension dimensionWidth) {
    this.dimensionWidth = dimensionWidth;
  }

  public SpaceDimension dimensionUsableArea(AreaDimension dimensionUsableArea) {
    this.dimensionUsableArea = dimensionUsableArea;
    return this;
  }

  /**
   * Get dimensionUsableArea
   * @return dimensionUsableArea
  */
  @Valid 
  @Schema(name = "dimensionUsableArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dimensionUsableArea")
  public AreaDimension getDimensionUsableArea() {
    return dimensionUsableArea;
  }

  public void setDimensionUsableArea(AreaDimension dimensionUsableArea) {
    this.dimensionUsableArea = dimensionUsableArea;
  }

  public SpaceDimension weightLimit(WeightDimension weightLimit) {
    this.weightLimit = weightLimit;
    return this;
  }

  /**
   * Get weightLimit
   * @return weightLimit
  */
  @Valid 
  @Schema(name = "weightLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weightLimit")
  public WeightDimension getWeightLimit() {
    return weightLimit;
  }

  public void setWeightLimit(WeightDimension weightLimit) {
    this.weightLimit = weightLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceDimension spaceDimension = (SpaceDimension) o;
    return Objects.equals(this.dimensionHeight, spaceDimension.dimensionHeight) &&
        Objects.equals(this.dimensionLength, spaceDimension.dimensionLength) &&
        Objects.equals(this.dimensionWidth, spaceDimension.dimensionWidth) &&
        Objects.equals(this.dimensionUsableArea, spaceDimension.dimensionUsableArea) &&
        Objects.equals(this.weightLimit, spaceDimension.weightLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionHeight, dimensionLength, dimensionWidth, dimensionUsableArea, weightLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceDimension {\n");
    sb.append("    dimensionHeight: ").append(toIndentedString(dimensionHeight)).append("\n");
    sb.append("    dimensionLength: ").append(toIndentedString(dimensionLength)).append("\n");
    sb.append("    dimensionWidth: ").append(toIndentedString(dimensionWidth)).append("\n");
    sb.append("    dimensionUsableArea: ").append(toIndentedString(dimensionUsableArea)).append("\n");
    sb.append("    weightLimit: ").append(toIndentedString(weightLimit)).append("\n");
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

