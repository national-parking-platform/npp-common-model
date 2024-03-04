package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.place.geojson.GeoJsonPoint;
import org.npp.model.place.location.PointByCoordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Location representing a single geospatial point using GeoJSON or the standard APDS model.
 */

@Schema(name = "PointLocation", description = "Location representing a single geospatial point using GeoJSON or the standard APDS model.")

public class PointLocation {

  private GeoJsonPoint geoJson;

  private PointByCoordinates pointCoordinates;

  public PointLocation geoJson(GeoJsonPoint geoJson) {
    this.geoJson = geoJson;
    return this;
  }

  /**
   * Get geoJson
   * @return geoJson
  */
  @Valid 
  @Schema(name = "geoJson", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geoJson")
  public GeoJsonPoint getGeoJson() {
    return geoJson;
  }

  public void setGeoJson(GeoJsonPoint geoJson) {
    this.geoJson = geoJson;
  }

  public PointLocation pointCoordinates(PointByCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
    return this;
  }

  /**
   * Get pointCoordinates
   * @return pointCoordinates
  */
  @Valid 
  @Schema(name = "pointCoordinates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointCoordinates")
  public PointByCoordinates getPointCoordinates() {
    return pointCoordinates;
  }

  public void setPointCoordinates(PointByCoordinates pointCoordinates) {
    this.pointCoordinates = pointCoordinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointLocation pointLocation = (PointLocation) o;
    return Objects.equals(this.geoJson, pointLocation.geoJson) &&
        Objects.equals(this.pointCoordinates, pointLocation.pointCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoJson, pointCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointLocation {\n");
    sb.append("    geoJson: ").append(toIndentedString(geoJson)).append("\n");
    sb.append("    pointCoordinates: ").append(toIndentedString(pointCoordinates)).append("\n");
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

