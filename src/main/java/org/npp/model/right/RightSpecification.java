package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.right.Credential;
import org.npp.model.right.RateEligibility;
import org.npp.model.right.RightPool;
import org.npp.model.right.enums.RightTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.time.Validity;
import org.npp.model.common.VersionedReference;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A Right Specification explicitly defines what the owner/manager of a Place is granting specific users or vehicles the ability to do (e.g. park, delivery, pick up).
 */

@Schema(name = "RightSpecification", description = "A Right Specification explicitly defines what the owner/manager of a Place is granting specific users or vehicles the ability to do (e.g. park, delivery, pick up).")

public class RightSpecification {

  private String id;

  private Integer version;

  @Valid
  private List<@Valid SpecificLanguageString> description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiry;

  private String financialReference;

  private VersionedReference issuer;

  private Boolean transferable;

  private Boolean transferableConditions;

  private RightTypeEnum type;

  @Valid
  private List<@Valid VersionedReference> hierarchyElements = new ArrayList<>();

  @Valid
  private List<@Valid Credential> credentials;

  @Valid
  private List<@Valid RateEligibility> rateEligibility;

  @Valid
  private List<@Valid RightPool> rightPools;

  private Validity validity;

  public RightSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RightSpecification(String id, Integer version, VersionedReference issuer, Boolean transferable, List<@Valid VersionedReference> hierarchyElements) {
    this.id = id;
    this.version = version;
    this.issuer = issuer;
    this.transferable = transferable;
    this.hierarchyElements = hierarchyElements;
  }

  public RightSpecification id(String id) {
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

  public RightSpecification version(Integer version) {
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

  public RightSpecification description(List<@Valid SpecificLanguageString> description) {
    this.description = description;
    return this;
  }

  public RightSpecification addDescriptionItem(SpecificLanguageString descriptionItem) {
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

  public RightSpecification expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Date/time showing the timestamp for when a RightSpecification ceases to be valid.
   * @return expiry
  */
  @Valid 
  @Schema(name = "expiry", description = "Date/time showing the timestamp for when a RightSpecification ceases to be valid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiry")
  public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public RightSpecification financialReference(String financialReference) {
    this.financialReference = financialReference;
    return this;
  }

  /**
   * Creator defined free-text reference to financial transactions associated to the specific Right Specification.
   * @return financialReference
  */
  
  @Schema(name = "financialReference", description = "Creator defined free-text reference to financial transactions associated to the specific Right Specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("financialReference")
  public String getFinancialReference() {
    return financialReference;
  }

  public void setFinancialReference(String financialReference) {
    this.financialReference = financialReference;
  }

  public RightSpecification issuer(VersionedReference issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
  */
  @NotNull @Valid 
  @Schema(name = "issuer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuer")
  public VersionedReference getIssuer() {
    return issuer;
  }

  public void setIssuer(VersionedReference issuer) {
    this.issuer = issuer;
  }

  public RightSpecification transferable(Boolean transferable) {
    this.transferable = transferable;
    return this;
  }

  /**
   * Get transferable
   * @return transferable
  */
  @NotNull 
  @Schema(name = "transferable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transferable")
  public Boolean getTransferable() {
    return transferable;
  }

  public void setTransferable(Boolean transferable) {
    this.transferable = transferable;
  }

  public RightSpecification transferableConditions(Boolean transferableConditions) {
    this.transferableConditions = transferableConditions;
    return this;
  }

  /**
   * Get transferableConditions
   * @return transferableConditions
  */
  
  @Schema(name = "transferableConditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transferableConditions")
  public Boolean getTransferableConditions() {
    return transferableConditions;
  }

  public void setTransferableConditions(Boolean transferableConditions) {
    this.transferableConditions = transferableConditions;
  }

  public RightSpecification type(RightTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public RightTypeEnum getType() {
    return type;
  }

  public void setType(RightTypeEnum type) {
    this.type = type;
  }

  public RightSpecification hierarchyElements(List<@Valid VersionedReference> hierarchyElements) {
    this.hierarchyElements = hierarchyElements;
    return this;
  }

  public RightSpecification addHierarchyElementsItem(VersionedReference hierarchyElementsItem) {
    if (this.hierarchyElements == null) {
      this.hierarchyElements = new ArrayList<>();
    }
    this.hierarchyElements.add(hierarchyElementsItem);
    return this;
  }

  /**
   * Versioned references to `Places` in the hierarchy where this `RightSpecification` is available.
   * @return hierarchyElements
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "hierarchyElements", description = "Versioned references to `Places` in the hierarchy where this `RightSpecification` is available.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hierarchyElements")
  public List<@Valid VersionedReference> getHierarchyElements() {
    return hierarchyElements;
  }

  public void setHierarchyElements(List<@Valid VersionedReference> hierarchyElements) {
    this.hierarchyElements = hierarchyElements;
  }

  public RightSpecification credentials(List<@Valid Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public RightSpecification addCredentialsItem(Credential credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

  /**
   * The allowed credential types for this `RightSpecification`
   * @return credentials
  */
  @Valid 
  @Schema(name = "credentials", description = "The allowed credential types for this `RightSpecification`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentials")
  public List<@Valid Credential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<@Valid Credential> credentials) {
    this.credentials = credentials;
  }

  public RightSpecification rateEligibility(List<@Valid RateEligibility> rateEligibility) {
    this.rateEligibility = rateEligibility;
    return this;
  }

  public RightSpecification addRateEligibilityItem(RateEligibility rateEligibilityItem) {
    if (this.rateEligibility == null) {
      this.rateEligibility = new ArrayList<>();
    }
    this.rateEligibility.add(rateEligibilityItem);
    return this;
  }

  /**
   * Defines the combination of `Eligibility` requirements with `RateTables` and associates this combination to a `RightSpecification`.  RateEligibility enables a `RightSpecification` to have association to multiple `RateTable(s)` for a specific `Eligibility` ( or set of `Qualifications`).  `RateEligibility` also defines if `RateTables` are `Combinable`.  This is a Yes / No (Boolean) definition.  Either all `RateTables` associated to a `RightSpecification` with a common `Eligibility` can be combined or they cannot.
   * @return rateEligibility
  */
  @Valid 
  @Schema(name = "rateEligibility", description = "Defines the combination of `Eligibility` requirements with `RateTables` and associates this combination to a `RightSpecification`.  RateEligibility enables a `RightSpecification` to have association to multiple `RateTable(s)` for a specific `Eligibility` ( or set of `Qualifications`).  `RateEligibility` also defines if `RateTables` are `Combinable`.  This is a Yes / No (Boolean) definition.  Either all `RateTables` associated to a `RightSpecification` with a common `Eligibility` can be combined or they cannot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateEligibility")
  public List<@Valid RateEligibility> getRateEligibility() {
    return rateEligibility;
  }

  public void setRateEligibility(List<@Valid RateEligibility> rateEligibility) {
    this.rateEligibility = rateEligibility;
  }

  public RightSpecification rightPools(List<@Valid RightPool> rightPools) {
    this.rightPools = rightPools;
    return this;
  }

  public RightSpecification addRightPoolsItem(RightPool rightPoolsItem) {
    if (this.rightPools == null) {
      this.rightPools = new ArrayList<>();
    }
    this.rightPools.add(rightPoolsItem);
    return this;
  }

  /**
   * Shares the number of AssignedRights that are available for use, are currently in use, or intended for use within a specific RightSpecification in specific date/time periods by a specific AssignedRightIssuer'
   * @return rightPools
  */
  @Valid 
  @Schema(name = "rightPools", description = "Shares the number of AssignedRights that are available for use, are currently in use, or intended for use within a specific RightSpecification in specific date/time periods by a specific AssignedRightIssuer'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rightPools")
  public List<@Valid RightPool> getRightPools() {
    return rightPools;
  }

  public void setRightPools(List<@Valid RightPool> rightPools) {
    this.rightPools = rightPools;
  }

  public RightSpecification validity(Validity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
  */
  @Valid 
  @Schema(name = "validity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validity")
  public Validity getValidity() {
    return validity;
  }

  public void setValidity(Validity validity) {
    this.validity = validity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RightSpecification rightSpecification = (RightSpecification) o;
    return Objects.equals(this.id, rightSpecification.id) &&
        Objects.equals(this.version, rightSpecification.version) &&
        Objects.equals(this.description, rightSpecification.description) &&
        Objects.equals(this.expiry, rightSpecification.expiry) &&
        Objects.equals(this.financialReference, rightSpecification.financialReference) &&
        Objects.equals(this.issuer, rightSpecification.issuer) &&
        Objects.equals(this.transferable, rightSpecification.transferable) &&
        Objects.equals(this.transferableConditions, rightSpecification.transferableConditions) &&
        Objects.equals(this.type, rightSpecification.type) &&
        Objects.equals(this.hierarchyElements, rightSpecification.hierarchyElements) &&
        Objects.equals(this.credentials, rightSpecification.credentials) &&
        Objects.equals(this.rateEligibility, rightSpecification.rateEligibility) &&
        Objects.equals(this.rightPools, rightSpecification.rightPools) &&
        Objects.equals(this.validity, rightSpecification.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, description, expiry, financialReference, issuer, transferable, transferableConditions, type, hierarchyElements, credentials, rateEligibility, rightPools, validity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightSpecification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    financialReference: ").append(toIndentedString(financialReference)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    transferable: ").append(toIndentedString(transferable)).append("\n");
    sb.append("    transferableConditions: ").append(toIndentedString(transferableConditions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hierarchyElements: ").append(toIndentedString(hierarchyElements)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    rateEligibility: ").append(toIndentedString(rateEligibility)).append("\n");
    sb.append("    rightPools: ").append(toIndentedString(rightPools)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

