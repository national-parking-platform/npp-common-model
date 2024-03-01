package org.npp.model.place.geojson;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.geojson.GeoJsonGeometry;
import org.npp.model.place.geojson.enums.GeoJsonGeometryTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * GeoJson Point
 */

@Schema(name = "GeoJsonPoint", description = "GeoJson Point")


public class GeoJsonPoint extends GeoJsonGeometry {

  @Valid
  private List<BigDecimal> coordinates;

  public GeoJsonPoint() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoJsonPoint(GeoJsonGeometryTypeEnum geoJsonGeometryType, GeoJsonGeometryTypeEnum type) {
    super(geoJsonGeometryType, type);
  }

  public GeoJsonPoint coordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public GeoJsonPoint addCoordinatesItem(BigDecimal coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * GeoJson 2D Point
   * @return coordinates
  */
  @Valid @Size(min = 2, max = 2) 
  @Schema(name = "coordinates", description = "GeoJson 2D Point", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinates")
  public List<BigDecimal> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<BigDecimal> coordinates) {
    this.coordinates = coordinates;
  }


  public GeoJsonPoint geoJsonGeometryType(GeoJsonGeometryTypeEnum geoJsonGeometryType) {
    super.geoJsonGeometryType(geoJsonGeometryType);
    return this;
  }

  public GeoJsonPoint type(GeoJsonGeometryTypeEnum type) {
    super.type(type);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoJsonPoint geoJsonPoint = (GeoJsonPoint) o;
    return Objects.equals(this.coordinates, geoJsonPoint.coordinates) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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

