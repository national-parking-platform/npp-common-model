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
import org.npp.model.place.enums.NutsCodeTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * The NUTS-Code representation for the named area (Nomenclature of territorial units for statistics) or  its LAU code representation (Local Administrative Unit).
 */

@Schema(name = "NutsNamedArea", description = "The NUTS-Code representation for the named area (Nomenclature of territorial units for statistics) or  its LAU code representation (Local Administrative Unit).")


public class NutsNamedArea extends NamedArea {

  @Valid
  private List<@Valid SpecificLanguageString> nutsCode = new ArrayList<>();

  private NutsCodeTypeEnum nutsCodeType;

  public NutsNamedArea() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NutsNamedArea(List<@Valid SpecificLanguageString> nutsCode, NutsCodeTypeEnum nutsCodeType, NamedAreaTypeEnum namedAreaType, List<@Valid SpecificLanguageString> areaName) {
    super(namedAreaType, areaName);
    this.nutsCode = nutsCode;
    this.nutsCodeType = nutsCodeType;
  }

  public NutsNamedArea nutsCode(List<@Valid SpecificLanguageString> nutsCode) {
    this.nutsCode = nutsCode;
    return this;
  }

  public NutsNamedArea addNutsCodeItem(SpecificLanguageString nutsCodeItem) {
    if (this.nutsCode == null) {
      this.nutsCode = new ArrayList<>();
    }
    this.nutsCode.add(nutsCodeItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return nutsCode
  */
  @NotNull @Valid 
  @Schema(name = "nutsCode", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nutsCode")
  public List<@Valid SpecificLanguageString> getNutsCode() {
    return nutsCode;
  }

  public void setNutsCode(List<@Valid SpecificLanguageString> nutsCode) {
    this.nutsCode = nutsCode;
  }

  public NutsNamedArea nutsCodeType(NutsCodeTypeEnum nutsCodeType) {
    this.nutsCodeType = nutsCodeType;
    return this;
  }

  /**
   * Get nutsCodeType
   * @return nutsCodeType
  */
  @NotNull @Valid 
  @Schema(name = "nutsCodeType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nutsCodeType")
  public NutsCodeTypeEnum getNutsCodeType() {
    return nutsCodeType;
  }

  public void setNutsCodeType(NutsCodeTypeEnum nutsCodeType) {
    this.nutsCodeType = nutsCodeType;
  }


  public NutsNamedArea namedAreaType(NamedAreaTypeEnum namedAreaType) {
    super.namedAreaType(namedAreaType);
    return this;
  }

  public NutsNamedArea areaName(List<@Valid SpecificLanguageString> areaName) {
    super.areaName(areaName);
    return this;
  }

  public NutsNamedArea addAreaNameItem(SpecificLanguageString areaNameItem) {
    super.addAreaNameItem(areaNameItem);
    return this;
  }

  public NutsNamedArea country(String country) {
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
    NutsNamedArea nutsNamedArea = (NutsNamedArea) o;
    return Objects.equals(this.nutsCode, nutsNamedArea.nutsCode) &&
        Objects.equals(this.nutsCodeType, nutsNamedArea.nutsCodeType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutsCode, nutsCodeType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NutsNamedArea {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nutsCode: ").append(toIndentedString(nutsCode)).append("\n");
    sb.append("    nutsCodeType: ").append(toIndentedString(nutsCodeType)).append("\n");
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

