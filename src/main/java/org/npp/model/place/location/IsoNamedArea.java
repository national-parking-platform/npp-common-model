package org.npp.model.place.location;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.location.NamedArea;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.place.enums.SubdivisionTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * The ISO 3166-2 representation for the named area.
 */

@Schema(name = "IsoNamedArea", description = "The ISO 3166-2 representation for the named area.")


public class IsoNamedArea extends NamedArea {

  private String subdivisionCode;

  private SubdivisionTypeEnum subdivisionType;

  public IsoNamedArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IsoNamedArea(String subdivisionCode, SubdivisionTypeEnum subdivisionType, NamedAreaTypeEnum namedAreaType, List<@Valid SpecificLanguageString> areaName) {
    super(namedAreaType, areaName);
    this.subdivisionCode = subdivisionCode;
    this.subdivisionType = subdivisionType;
  }

  public IsoNamedArea subdivisionCode(String subdivisionCode) {
    this.subdivisionCode = subdivisionCode;
    return this;
  }

  /**
   * ISO 3166-2 country sub-division code (up to 3 characters).
   * @return subdivisionCode
  */
  @NotNull @Size(min = 0, max = 3) 
  @Schema(name = "subdivisionCode", description = "ISO 3166-2 country sub-division code (up to 3 characters).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subdivisionCode")
  public String getSubdivisionCode() {
    return subdivisionCode;
  }

  public void setSubdivisionCode(String subdivisionCode) {
    this.subdivisionCode = subdivisionCode;
  }

  public IsoNamedArea subdivisionType(SubdivisionTypeEnum subdivisionType) {
    this.subdivisionType = subdivisionType;
    return this;
  }

  /**
   * Get subdivisionType
   * @return subdivisionType
  */
  @NotNull @Valid 
  @Schema(name = "subdivisionType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subdivisionType")
  public SubdivisionTypeEnum getSubdivisionType() {
    return subdivisionType;
  }

  public void setSubdivisionType(SubdivisionTypeEnum subdivisionType) {
    this.subdivisionType = subdivisionType;
  }


  public IsoNamedArea namedAreaType(NamedAreaTypeEnum namedAreaType) {
    super.namedAreaType(namedAreaType);
    return this;
  }

  public IsoNamedArea areaName(List<@Valid SpecificLanguageString> areaName) {
    super.areaName(areaName);
    return this;
  }

  public IsoNamedArea addAreaNameItem(SpecificLanguageString areaNameItem) {
    super.addAreaNameItem(areaNameItem);
    return this;
  }

  public IsoNamedArea country(String country) {
    super.country(country);
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
    IsoNamedArea isoNamedArea = (IsoNamedArea) o;
    return Objects.equals(this.subdivisionCode, isoNamedArea.subdivisionCode) &&
        Objects.equals(this.subdivisionType, isoNamedArea.subdivisionType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subdivisionCode, subdivisionType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsoNamedArea {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subdivisionCode: ").append(toIndentedString(subdivisionCode)).append("\n");
    sb.append("    subdivisionType: ").append(toIndentedString(subdivisionType)).append("\n");
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

