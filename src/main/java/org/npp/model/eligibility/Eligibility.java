package org.npp.model.eligibility;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.eligibility.Qualification;
import org.npp.model.right.RightHolder;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining one or several qualifications indicating eligibility for use of a rate table or right specification.
 */

@Schema(name = "Eligibility", description = "A class defining one or several qualifications indicating eligibility for use of a rate table or right specification.")

public class Eligibility {

  private String id;

  private Integer version;

  @Valid
  private List<@Valid SpecificLanguageString> description;

  @Valid
  private List<@Valid SpecificLanguageString> eligibilityName;

  @Valid
  private List<@Valid Qualification> qualifications;

  @Valid
  private List<@Valid RightHolder> rightHolders;

  public Eligibility() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Eligibility(String id, Integer version) {
    this.id = id;
    this.version = version;
  }

  public Eligibility id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for object.
   * @return id
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Unique identifier for object.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Eligibility version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Positive integer representing the object version.
   * minimum: 1
   * @return version
  */
  @NotNull @Min(1) 
  @Schema(name = "version", description = "Positive integer representing the object version.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Eligibility description(List<@Valid SpecificLanguageString> description) {
    this.description = description;
    return this;
  }

  public Eligibility addDescriptionItem(SpecificLanguageString descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return description
  */
  @Valid 
  @Schema(name = "description", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public List<@Valid SpecificLanguageString> getDescription() {
    return description;
  }

  public void setDescription(List<@Valid SpecificLanguageString> description) {
    this.description = description;
  }

  public Eligibility eligibilityName(List<@Valid SpecificLanguageString> eligibilityName) {
    this.eligibilityName = eligibilityName;
    return this;
  }

  public Eligibility addEligibilityNameItem(SpecificLanguageString eligibilityNameItem) {
    if (this.eligibilityName == null) {
      this.eligibilityName = new ArrayList<>();
    }
    this.eligibilityName.add(eligibilityNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return eligibilityName
  */
  @Valid 
  @Schema(name = "eligibilityName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eligibilityName")
  public List<@Valid SpecificLanguageString> getEligibilityName() {
    return eligibilityName;
  }

  public void setEligibilityName(List<@Valid SpecificLanguageString> eligibilityName) {
    this.eligibilityName = eligibilityName;
  }

  public Eligibility qualifications(List<@Valid Qualification> qualifications) {
    this.qualifications = qualifications;
    return this;
  }

  public Eligibility addQualificationsItem(Qualification qualificationsItem) {
    if (this.qualifications == null) {
      this.qualifications = new ArrayList<>();
    }
    this.qualifications.add(qualificationsItem);
    return this;
  }

  /**
   * Criteria to be eligible
   * @return qualifications
  */
  @Valid 
  @Schema(name = "qualifications", description = "Criteria to be eligible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qualifications")
  public List<@Valid Qualification> getQualifications() {
    return qualifications;
  }

  public void setQualifications(List<@Valid Qualification> qualifications) {
    this.qualifications = qualifications;
  }

  public Eligibility rightHolders(List<@Valid RightHolder> rightHolders) {
    this.rightHolders = rightHolders;
    return this;
  }

  public Eligibility addRightHoldersItem(RightHolder rightHoldersItem) {
    if (this.rightHolders == null) {
      this.rightHolders = new ArrayList<>();
    }
    this.rightHolders.add(rightHoldersItem);
    return this;
  }

  /**
   * Get rightHolders
   * @return rightHolders
  */
  @Valid 
  @Schema(name = "rightHolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rightHolders")
  public List<@Valid RightHolder> getRightHolders() {
    return rightHolders;
  }

  public void setRightHolders(List<@Valid RightHolder> rightHolders) {
    this.rightHolders = rightHolders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eligibility eligibility = (Eligibility) o;
    return Objects.equals(this.id, eligibility.id) &&
        Objects.equals(this.version, eligibility.version) &&
        Objects.equals(this.description, eligibility.description) &&
        Objects.equals(this.eligibilityName, eligibility.eligibilityName) &&
        Objects.equals(this.qualifications, eligibility.qualifications) &&
        Objects.equals(this.rightHolders, eligibility.rightHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, description, eligibilityName, qualifications, rightHolders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eligibility {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eligibilityName: ").append(toIndentedString(eligibilityName)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
    sb.append("    rightHolders: ").append(toIndentedString(rightHolders)).append("\n");
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

