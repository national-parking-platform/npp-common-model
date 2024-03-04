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
 * GeoJson MultiPolygon
 */

@Schema(name = "GeoJsonMultiPolygon", description = "GeoJson MultiPolygon")


public class GeoJsonMultiPolygon extends GeoJsonGeometry {

  @Valid
  private List<List<List<@Valid List<BigDecimal>>>> coordinates;

  public GeoJsonMultiPolygon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoJsonMultiPolygon(GeoJsonGeometryTypeEnum geoJsonGeometryType, GeoJsonGeometryTypeEnum type) {
    super(geoJsonGeometryType, type);
  }

  public GeoJsonMultiPolygon coordinates(List<List<List<@Valid List<BigDecimal>>>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public GeoJsonMultiPolygon addCoordinatesItem(List<List<@Valid List<BigDecimal>>> coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
  */
  @Valid 
  @Schema(name = "coordinates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coordinates")
  public List<List<List<@Valid List<BigDecimal>>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<List<@Valid List<BigDecimal>>>> coordinates) {
    this.coordinates = coordinates;
  }


  public GeoJsonMultiPolygon geoJsonGeometryType(GeoJsonGeometryTypeEnum geoJsonGeometryType) {
    super.geoJsonGeometryType(geoJsonGeometryType);
    return this;
  }

  public GeoJsonMultiPolygon type(GeoJsonGeometryTypeEnum type) {
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
    GeoJsonMultiPolygon geoJsonMultiPolygon = (GeoJsonMultiPolygon) o;
    return Objects.equals(this.coordinates, geoJsonMultiPolygon.coordinates) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonMultiPolygon {\n");
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

