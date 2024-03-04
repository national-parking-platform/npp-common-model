package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.common.ReferencedCodeListEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Use this class to classification type/level for security schemes for a place
 */

@Schema(name = "SafetyStandardClassification", description = "Use this class to classification type/level for security schemes for a place")

public class SafetyStandardClassification {

  private ReferencedCodeListEntry securityFeature;

  private ReferencedCodeListEntry securityLevel;

  public SafetyStandardClassification securityFeature(ReferencedCodeListEntry securityFeature) {
    this.securityFeature = securityFeature;
    return this;
  }

  /**
   * Get securityFeature
   * @return securityFeature
  */
  @Valid 
  @Schema(name = "securityFeature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityFeature")
  public ReferencedCodeListEntry getSecurityFeature() {
    return securityFeature;
  }

  public void setSecurityFeature(ReferencedCodeListEntry securityFeature) {
    this.securityFeature = securityFeature;
  }

  public SafetyStandardClassification securityLevel(ReferencedCodeListEntry securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

  /**
   * Get securityLevel
   * @return securityLevel
  */
  @Valid 
  @Schema(name = "securityLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityLevel")
  public ReferencedCodeListEntry getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(ReferencedCodeListEntry securityLevel) {
    this.securityLevel = securityLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SafetyStandardClassification safetyStandardClassification = (SafetyStandardClassification) o;
    return Objects.equals(this.securityFeature, safetyStandardClassification.securityFeature) &&
        Objects.equals(this.securityLevel, safetyStandardClassification.securityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityFeature, securityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SafetyStandardClassification {\n");
    sb.append("    securityFeature: ").append(toIndentedString(securityFeature)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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

