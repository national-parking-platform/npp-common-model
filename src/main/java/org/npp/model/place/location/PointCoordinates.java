package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.location.HeightCoordinate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A pair of planar coordinates defining the geodetic position of a single point using a defined Coordinate Reference System.
 */

@Schema(name = "PointCoordinates", description = "A pair of planar coordinates defining the geodetic position of a single point using a defined Coordinate Reference System.")

public class PointCoordinates {

  private String epsgCode;

  private Float x;

  private Float y;

  @Valid
  private List<@Valid HeightCoordinate> heightCoordinates;

  public PointCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PointCoordinates(String epsgCode, Float x, Float y) {
    this.epsgCode = epsgCode;
    this.x = x;
    this.y = y;
  }

  public PointCoordinates epsgCode(String epsgCode) {
    this.epsgCode = epsgCode;
    return this;
  }

  /**
   * Code referencing a specific Coordinate Reference System in the EPSG (European Petroleum Survey Group) register
   * @return epsgCode
  */
  @NotNull @Pattern(regexp = "^EPSG:\\d{4}$") 
  @Schema(name = "epsgCode", example = "EPSG:3857", description = "Code referencing a specific Coordinate Reference System in the EPSG (European Petroleum Survey Group) register", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("epsgCode")
  public String getEpsgCode() {
    return epsgCode;
  }

  public void setEpsgCode(String epsgCode) {
    this.epsgCode = epsgCode;
  }

  public PointCoordinates x(Float x) {
    this.x = x;
    return this;
  }

  /**
   * X coordinate in the defined Coordinate Referencing System indicated by the EPSG code
   * @return x
  */
  @NotNull 
  @Schema(name = "x", description = "X coordinate in the defined Coordinate Referencing System indicated by the EPSG code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("x")
  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public PointCoordinates y(Float y) {
    this.y = y;
    return this;
  }

  /**
   * Y coordinate in the defined Coordinate Referencing System indicated by the EPSG code
   * @return y
  */
  @NotNull 
  @Schema(name = "y", description = "Y coordinate in the defined Coordinate Referencing System indicated by the EPSG code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("y")
  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public PointCoordinates heightCoordinates(List<@Valid HeightCoordinate> heightCoordinates) {
    this.heightCoordinates = heightCoordinates;
    return this;
  }

  public PointCoordinates addHeightCoordinatesItem(HeightCoordinate heightCoordinatesItem) {
    if (this.heightCoordinates == null) {
      this.heightCoordinates = new ArrayList<>();
    }
    this.heightCoordinates.add(heightCoordinatesItem);
    return this;
  }

  /**
   * Height coordinate
   * @return heightCoordinates
  */
  @Valid @Size(max = 3) 
  @Schema(name = "heightCoordinates", description = "Height coordinate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightCoordinates")
  public List<@Valid HeightCoordinate> getHeightCoordinates() {
    return heightCoordinates;
  }

  public void setHeightCoordinates(List<@Valid HeightCoordinate> heightCoordinates) {
    this.heightCoordinates = heightCoordinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointCoordinates pointCoordinates = (PointCoordinates) o;
    return Objects.equals(this.epsgCode, pointCoordinates.epsgCode) &&
        Objects.equals(this.x, pointCoordinates.x) &&
        Objects.equals(this.y, pointCoordinates.y) &&
        Objects.equals(this.heightCoordinates, pointCoordinates.heightCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsgCode, x, y, heightCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointCoordinates {\n");
    sb.append("    epsgCode: ").append(toIndentedString(epsgCode)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    heightCoordinates: ").append(toIndentedString(heightCoordinates)).append("\n");
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

