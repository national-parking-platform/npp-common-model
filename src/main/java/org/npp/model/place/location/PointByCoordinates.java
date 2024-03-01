package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.place.location.PointCoordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A single point defined only by a coordinate set with an optional bearing direction
 */

@Schema(name = "PointByCoordinates", description = "A single point defined only by a coordinate set with an optional bearing direction")

public class PointByCoordinates {

  private PointCoordinates pointCoordinates;

  private Integer bearing;

  public PointByCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PointByCoordinates(PointCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
  }

  public PointByCoordinates pointCoordinates(PointCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
    return this;
  }

  /**
   * Get pointCoordinates
   * @return pointCoordinates
  */
  @NotNull @Valid 
  @Schema(name = "pointCoordinates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pointCoordinates")
  public PointCoordinates getPointCoordinates() {
    return pointCoordinates;
  }

  public void setPointCoordinates(PointCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
  }

  public PointByCoordinates bearing(Integer bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * A bearing at the point measured in degrees (0 - 359). Unless otherwise specified the reference direction corresponding to 0 degrees is North.
   * minimum: 0
   * maximum: 359
   * @return bearing
  */
  @Min(0) @Max(359) 
  @Schema(name = "bearing", description = "A bearing at the point measured in degrees (0 - 359). Unless otherwise specified the reference direction corresponding to 0 degrees is North.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bearing")
  public Integer getBearing() {
    return bearing;
  }

  public void setBearing(Integer bearing) {
    this.bearing = bearing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointByCoordinates pointByCoordinates = (PointByCoordinates) o;
    return Objects.equals(this.pointCoordinates, pointByCoordinates.pointCoordinates) &&
        Objects.equals(this.bearing, pointByCoordinates.bearing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointCoordinates, bearing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointByCoordinates {\n");
    sb.append("    pointCoordinates: ").append(toIndentedString(pointCoordinates)).append("\n");
    sb.append("    bearing: ").append(toIndentedString(bearing)).append("\n");
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

