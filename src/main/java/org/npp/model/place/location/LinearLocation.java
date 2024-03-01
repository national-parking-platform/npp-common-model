package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.place.geojson.GeoJsonLineString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Describes linear locations (eg. stretches of road). Only GeoJSON supported in this document,  but should be extended to support OpenLr and GML, as per the APDS documentation.
 */

@Schema(name = "LinearLocation", description = "Describes linear locations (eg. stretches of road). Only GeoJSON supported in this document,  but should be extended to support OpenLr and GML, as per the APDS documentation.")

public class LinearLocation {

  private GeoJsonLineString geoJson;

  public LinearLocation geoJson(GeoJsonLineString geoJson) {
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
  public GeoJsonLineString getGeoJson() {
    return geoJson;
  }

  public void setGeoJson(GeoJsonLineString geoJson) {
    this.geoJson = geoJson;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearLocation linearLocation = (LinearLocation) o;
    return Objects.equals(this.geoJson, linearLocation.geoJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoJson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearLocation {\n");
    sb.append("    geoJson: ").append(toIndentedString(geoJson)).append("\n");
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

