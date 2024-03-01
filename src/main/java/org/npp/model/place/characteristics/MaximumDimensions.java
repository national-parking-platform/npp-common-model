package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.place.characteristics.LinearDimension;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information relating to the maximum physical dimensions for the defined purpose
 */

@Schema(name = "MaximumDimensions", description = "A class defining information relating to the maximum physical dimensions for the defined purpose")

public class MaximumDimensions {

  private LinearDimension maximumHeight;

  private LinearDimension maximumLength;

  private LinearDimension maximumWidth;

  public MaximumDimensions maximumHeight(LinearDimension maximumHeight) {
    this.maximumHeight = maximumHeight;
    return this;
  }

  /**
   * Get maximumHeight
   * @return maximumHeight
  */
  @Valid 
  @Schema(name = "maximumHeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumHeight")
  public LinearDimension getMaximumHeight() {
    return maximumHeight;
  }

  public void setMaximumHeight(LinearDimension maximumHeight) {
    this.maximumHeight = maximumHeight;
  }

  public MaximumDimensions maximumLength(LinearDimension maximumLength) {
    this.maximumLength = maximumLength;
    return this;
  }

  /**
   * Get maximumLength
   * @return maximumLength
  */
  @Valid 
  @Schema(name = "maximumLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumLength")
  public LinearDimension getMaximumLength() {
    return maximumLength;
  }

  public void setMaximumLength(LinearDimension maximumLength) {
    this.maximumLength = maximumLength;
  }

  public MaximumDimensions maximumWidth(LinearDimension maximumWidth) {
    this.maximumWidth = maximumWidth;
    return this;
  }

  /**
   * Get maximumWidth
   * @return maximumWidth
  */
  @Valid 
  @Schema(name = "maximumWidth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumWidth")
  public LinearDimension getMaximumWidth() {
    return maximumWidth;
  }

  public void setMaximumWidth(LinearDimension maximumWidth) {
    this.maximumWidth = maximumWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaximumDimensions maximumDimensions = (MaximumDimensions) o;
    return Objects.equals(this.maximumHeight, maximumDimensions.maximumHeight) &&
        Objects.equals(this.maximumLength, maximumDimensions.maximumLength) &&
        Objects.equals(this.maximumWidth, maximumDimensions.maximumWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumHeight, maximumLength, maximumWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaximumDimensions {\n");
    sb.append("    maximumHeight: ").append(toIndentedString(maximumHeight)).append("\n");
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
    sb.append("    maximumWidth: ").append(toIndentedString(maximumWidth)).append("\n");
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

