package org.npp.model.vehicle;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.vehicle.enums.LowEmissionLevelEnum;
import org.npp.model.common.ReferencedCodeListEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Emission characteristics of vehicles.
 */

@Schema(name = "Emissions", description = "Emission characteristics of vehicles.")

public class Emissions {

  private ReferencedCodeListEntry emissionClassification;

  @Valid
  private List<String> emissionClassificationOthers;

  private LowEmissionLevelEnum emissionLevel;

  public Emissions emissionClassification(ReferencedCodeListEntry emissionClassification) {
    this.emissionClassification = emissionClassification;
    return this;
  }

  /**
   * Get emissionClassification
   * @return emissionClassification
  */
  @Valid 
  @Schema(name = "emissionClassification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionClassification")
  public ReferencedCodeListEntry getEmissionClassification() {
    return emissionClassification;
  }

  public void setEmissionClassification(ReferencedCodeListEntry emissionClassification) {
    this.emissionClassification = emissionClassification;
  }

  public Emissions emissionClassificationOthers(List<String> emissionClassificationOthers) {
    this.emissionClassificationOthers = emissionClassificationOthers;
    return this;
  }

  public Emissions addEmissionClassificationOthersItem(String emissionClassificationOthersItem) {
    if (this.emissionClassificationOthers == null) {
      this.emissionClassificationOthers = new ArrayList<>();
    }
    this.emissionClassificationOthers.add(emissionClassificationOthersItem);
    return this;
  }

  /**
   * Some other (probably locally defined) value(s) for emission classification.
   * @return emissionClassificationOthers
  */
  
  @Schema(name = "emissionClassificationOthers", description = "Some other (probably locally defined) value(s) for emission classification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionClassificationOthers")
  public List<String> getEmissionClassificationOthers() {
    return emissionClassificationOthers;
  }

  public void setEmissionClassificationOthers(List<String> emissionClassificationOthers) {
    this.emissionClassificationOthers = emissionClassificationOthers;
  }

  public Emissions emissionLevel(LowEmissionLevelEnum emissionLevel) {
    this.emissionLevel = emissionLevel;
    return this;
  }

  /**
   * Get emissionLevel
   * @return emissionLevel
  */
  @Valid 
  @Schema(name = "emissionLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissionLevel")
  public LowEmissionLevelEnum getEmissionLevel() {
    return emissionLevel;
  }

  public void setEmissionLevel(LowEmissionLevelEnum emissionLevel) {
    this.emissionLevel = emissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emissions emissions = (Emissions) o;
    return Objects.equals(this.emissionClassification, emissions.emissionClassification) &&
        Objects.equals(this.emissionClassificationOthers, emissions.emissionClassificationOthers) &&
        Objects.equals(this.emissionLevel, emissions.emissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emissionClassification, emissionClassificationOthers, emissionLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emissions {\n");
    sb.append("    emissionClassification: ").append(toIndentedString(emissionClassification)).append("\n");
    sb.append("    emissionClassificationOthers: ").append(toIndentedString(emissionClassificationOthers)).append("\n");
    sb.append("    emissionLevel: ").append(toIndentedString(emissionLevel)).append("\n");
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

