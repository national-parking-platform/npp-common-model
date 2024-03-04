package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.place.geojson.GeoJsonMultiPolygon;
import org.npp.model.place.location.NamedArea;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Location representing a geographic or geometric defined area (using GeoJSON)
 */

@Schema(name = "AreaLocation", description = "Location representing a geographic or geometric defined area (using GeoJSON)")

public class AreaLocation {

  private GeoJsonMultiPolygon geoJson;

  private NamedArea namedArea;

  public AreaLocation geoJson(GeoJsonMultiPolygon geoJson) {
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
  public GeoJsonMultiPolygon getGeoJson() {
    return geoJson;
  }

  public void setGeoJson(GeoJsonMultiPolygon geoJson) {
    this.geoJson = geoJson;
  }

  public AreaLocation namedArea(NamedArea namedArea) {
    this.namedArea = namedArea;
    return this;
  }

  /**
   * Get namedArea
   * @return namedArea
  */
  @Valid 
  @Schema(name = "namedArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("namedArea")
  public NamedArea getNamedArea() {
    return namedArea;
  }

  public void setNamedArea(NamedArea namedArea) {
    this.namedArea = namedArea;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaLocation areaLocation = (AreaLocation) o;
    return Objects.equals(this.geoJson, areaLocation.geoJson) &&
        Objects.equals(this.namedArea, areaLocation.namedArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoJson, namedArea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaLocation {\n");
    sb.append("    geoJson: ").append(toIndentedString(geoJson)).append("\n");
    sb.append("    namedArea: ").append(toIndentedString(namedArea)).append("\n");
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

