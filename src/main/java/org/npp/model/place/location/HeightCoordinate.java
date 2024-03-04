package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.place.enums.HeightTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Third coordinate for points defined geodesically
 */

@Schema(name = "HeightCoordinate", description = "Third coordinate for points defined geodesically")

public class HeightCoordinate {

  private HeightTypeEnum heightType;

  private String heightValue;

  public HeightCoordinate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HeightCoordinate(String heightValue) {
    this.heightValue = heightValue;
  }

  public HeightCoordinate heightType(HeightTypeEnum heightType) {
    this.heightType = heightType;
    return this;
  }

  /**
   * Get heightType
   * @return heightType
  */
  @Valid 
  @Schema(name = "heightType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightType")
  public HeightTypeEnum getHeightType() {
    return heightType;
  }

  public void setHeightType(HeightTypeEnum heightType) {
    this.heightType = heightType;
  }

  public HeightCoordinate heightValue(String heightValue) {
    this.heightValue = heightValue;
    return this;
  }

  /**
   * Value in defined unit (metres) for the height measured vertically at to the planar coordinates the point corresponding.  Note alteration from DATEXII definition.
   * @return heightValue
  */
  @NotNull 
  @Schema(name = "heightValue", description = "Value in defined unit (metres) for the height measured vertically at to the planar coordinates the point corresponding.  Note alteration from DATEXII definition.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("heightValue")
  public String getHeightValue() {
    return heightValue;
  }

  public void setHeightValue(String heightValue) {
    this.heightValue = heightValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeightCoordinate heightCoordinate = (HeightCoordinate) o;
    return Objects.equals(this.heightType, heightCoordinate.heightType) &&
        Objects.equals(this.heightValue, heightCoordinate.heightValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heightType, heightValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeightCoordinate {\n");
    sb.append("    heightType: ").append(toIndentedString(heightType)).append("\n");
    sb.append("    heightValue: ").append(toIndentedString(heightValue)).append("\n");
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

