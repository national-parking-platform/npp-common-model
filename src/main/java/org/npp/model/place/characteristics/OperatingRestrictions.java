package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.enums.OperatingRestrictionsEnum;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining operating restrictions.
 */

@Schema(name = "OperatingRestrictions", description = "A class defining operating restrictions.")

public class OperatingRestrictions {

  private OperatingRestrictionsEnum operatingRestriction;

  @Valid
  private List<@Valid SpecificLanguageString> operatingRestrictionContext;

  public OperatingRestrictions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OperatingRestrictions(OperatingRestrictionsEnum operatingRestriction) {
    this.operatingRestriction = operatingRestriction;
  }

  public OperatingRestrictions operatingRestriction(OperatingRestrictionsEnum operatingRestriction) {
    this.operatingRestriction = operatingRestriction;
    return this;
  }

  /**
   * Get operatingRestriction
   * @return operatingRestriction
  */
  @NotNull @Valid 
  @Schema(name = "operatingRestriction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operatingRestriction")
  public OperatingRestrictionsEnum getOperatingRestriction() {
    return operatingRestriction;
  }

  public void setOperatingRestriction(OperatingRestrictionsEnum operatingRestriction) {
    this.operatingRestriction = operatingRestriction;
  }

  public OperatingRestrictions operatingRestrictionContext(List<@Valid SpecificLanguageString> operatingRestrictionContext) {
    this.operatingRestrictionContext = operatingRestrictionContext;
    return this;
  }

  public OperatingRestrictions addOperatingRestrictionContextItem(SpecificLanguageString operatingRestrictionContextItem) {
    if (this.operatingRestrictionContext == null) {
      this.operatingRestrictionContext = new ArrayList<>();
    }
    this.operatingRestrictionContext.add(operatingRestrictionContextItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return operatingRestrictionContext
  */
  @Valid 
  @Schema(name = "operatingRestrictionContext", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingRestrictionContext")
  public List<@Valid SpecificLanguageString> getOperatingRestrictionContext() {
    return operatingRestrictionContext;
  }

  public void setOperatingRestrictionContext(List<@Valid SpecificLanguageString> operatingRestrictionContext) {
    this.operatingRestrictionContext = operatingRestrictionContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingRestrictions operatingRestrictions = (OperatingRestrictions) o;
    return Objects.equals(this.operatingRestriction, operatingRestrictions.operatingRestriction) &&
        Objects.equals(this.operatingRestrictionContext, operatingRestrictions.operatingRestrictionContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingRestriction, operatingRestrictionContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingRestrictions {\n");
    sb.append("    operatingRestriction: ").append(toIndentedString(operatingRestriction)).append("\n");
    sb.append("    operatingRestrictionContext: ").append(toIndentedString(operatingRestrictionContext)).append("\n");
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

