package org.npp.model.rate;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.rate.enums.RateAvailabilityTypeEnum;
import org.npp.model.rate.RateLineCollection;
import org.npp.model.rate.enums.RateTypeEnum;
import org.npp.model.common.SpecificLanguageString;
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
 * A specific set of rate charges relating to one or more locations and optionally one set of eligibility criteria. rateTableId refers to the internal identifier for the rate table provided by the data supplier,  and not the resource&#39;s unique identifier itself
 */

@Schema(name = "RateTable", description = "A specific set of rate charges relating to one or more locations and optionally one set of eligibility criteria. rateTableId refers to the internal identifier for the rate table provided by the data supplier,  and not the resource's unique identifier itself")

public class RateTable {

  private String id;

  private Integer version;

  @Valid
  private List<@Valid SpecificLanguageString> rateTableName = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validityStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime validityEnd;

  private Boolean validation;

  private RateTypeEnum rateType;

  @Valid
  private List<@Valid SpecificLanguageString> rateTableID;

  @Valid
  private List<@Valid String> activeTimes = new ArrayList<>();

  private RateAvailabilityTypeEnum availability;

  private VersionedReference rateResponsibleParty;

  private String rateSupersedeLink;

  @Valid
  private List<@Valid RateLineCollection> rateLineCollections = new ArrayList<>();

  private String additionalInformation;

  public RateTable() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateTable(String id, Integer version, List<@Valid SpecificLanguageString> rateTableName, OffsetDateTime validityStart, List<@Valid String> activeTimes, RateAvailabilityTypeEnum availability, List<@Valid RateLineCollection> rateLineCollections) {
    this.id = id;
    this.version = version;
    this.rateTableName = rateTableName;
    this.validityStart = validityStart;
    this.activeTimes = activeTimes;
    this.availability = availability;
    this.rateLineCollections = rateLineCollections;
  }

  public RateTable id(String id) {
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

  public RateTable version(Integer version) {
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

  public RateTable rateTableName(List<@Valid SpecificLanguageString> rateTableName) {
    this.rateTableName = rateTableName;
    return this;
  }

  public RateTable addRateTableNameItem(SpecificLanguageString rateTableNameItem) {
    if (this.rateTableName == null) {
      this.rateTableName = new ArrayList<>();
    }
    this.rateTableName.add(rateTableNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return rateTableName
  */
  @NotNull @Valid 
  @Schema(name = "rateTableName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rateTableName")
  public List<@Valid SpecificLanguageString> getRateTableName() {
    return rateTableName;
  }

  public void setRateTableName(List<@Valid SpecificLanguageString> rateTableName) {
    this.rateTableName = rateTableName;
  }

  public RateTable validityStart(OffsetDateTime validityStart) {
    this.validityStart = validityStart;
    return this;
  }

  /**
   * Valid start date/time of rate table. This is when the rate table and pricing becomes active.
   * @return validityStart
  */
  @NotNull @Valid 
  @Schema(name = "validityStart", description = "Valid start date/time of rate table. This is when the rate table and pricing becomes active.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validityStart")
  public OffsetDateTime getValidityStart() {
    return validityStart;
  }

  public void setValidityStart(OffsetDateTime validityStart) {
    this.validityStart = validityStart;
  }

  public RateTable validityEnd(OffsetDateTime validityEnd) {
    this.validityEnd = validityEnd;
    return this;
  }

  /**
   * Expiration of rate table in date/time. This is when the rate table and pricing expires and is no longer used.
   * @return validityEnd
  */
  @Valid 
  @Schema(name = "validityEnd", description = "Expiration of rate table in date/time. This is when the rate table and pricing expires and is no longer used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validityEnd")
  public OffsetDateTime getValidityEnd() {
    return validityEnd;
  }

  public void setValidityEnd(OffsetDateTime validityEnd) {
    this.validityEnd = validityEnd;
  }

  public RateTable validation(Boolean validation) {
    this.validation = validation;
    return this;
  }

  /**
   * Are validations accepted when using this rate table ?  [TRUE] = validations can be applied to transactions using this rate table. [FALSE] = validations cannot be applied to transactions using this rate table.
   * @return validation
  */
  
  @Schema(name = "validation", description = "Are validations accepted when using this rate table ?  [TRUE] = validations can be applied to transactions using this rate table. [FALSE] = validations cannot be applied to transactions using this rate table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validation")
  public Boolean getValidation() {
    return validation;
  }

  public void setValidation(Boolean validation) {
    this.validation = validation;
  }

  public RateTable rateType(RateTypeEnum rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Get rateType
   * @return rateType
  */
  @Valid 
  @Schema(name = "rateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateType")
  public RateTypeEnum getRateType() {
    return rateType;
  }

  public void setRateType(RateTypeEnum rateType) {
    this.rateType = rateType;
  }

  public RateTable rateTableID(List<@Valid SpecificLanguageString> rateTableID) {
    this.rateTableID = rateTableID;
    return this;
  }

  public RateTable addRateTableIDItem(SpecificLanguageString rateTableIDItem) {
    if (this.rateTableID == null) {
      this.rateTableID = new ArrayList<>();
    }
    this.rateTableID.add(rateTableIDItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return rateTableID
  */
  @Valid 
  @Schema(name = "rateTableID", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateTableID")
  public List<@Valid SpecificLanguageString> getRateTableID() {
    return rateTableID;
  }

  public void setRateTableID(List<@Valid SpecificLanguageString> rateTableID) {
    this.rateTableID = rateTableID;
  }

  public RateTable activeTimes(List<@Valid String> activeTimes) {
    this.activeTimes = activeTimes;
    return this;
  }

  public RateTable addActiveTimesItem(String activeTimesItem) {
    if (this.activeTimes == null) {
      this.activeTimes = new ArrayList<>();
    }
    this.activeTimes.add(activeTimesItem);
    return this;
  }

  /**
   * Periods when the rate table is to be applied.
   * @return activeTimes
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "activeTimes", description = "Periods when the rate table is to be applied.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activeTimes")
  public List<@Valid String> getActiveTimes() {
    return activeTimes;
  }

  public void setActiveTimes(List<@Valid String> activeTimes) {
    this.activeTimes = activeTimes;
  }

  public RateTable availability(RateAvailabilityTypeEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @NotNull @Valid 
  @Schema(name = "availability", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availability")
  public RateAvailabilityTypeEnum getAvailability() {
    return availability;
  }

  public void setAvailability(RateAvailabilityTypeEnum availability) {
    this.availability = availability;
  }

  public RateTable rateResponsibleParty(VersionedReference rateResponsibleParty) {
    this.rateResponsibleParty = rateResponsibleParty;
    return this;
  }

  /**
   * Get rateResponsibleParty
   * @return rateResponsibleParty
  */
  @Valid 
  @Schema(name = "rateResponsibleParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateResponsibleParty")
  public VersionedReference getRateResponsibleParty() {
    return rateResponsibleParty;
  }

  public void setRateResponsibleParty(VersionedReference rateResponsibleParty) {
    this.rateResponsibleParty = rateResponsibleParty;
  }

  public RateTable rateSupersedeLink(String rateSupersedeLink) {
    this.rateSupersedeLink = rateSupersedeLink;
    return this;
  }

  /**
   * Identify the rate table that this rate table supersedes.  Temporarily supersedes the identified rate table.  Use the Rate expiration times to define duration.
   * @return rateSupersedeLink
  */
  
  @Schema(name = "rateSupersedeLink", description = "Identify the rate table that this rate table supersedes.  Temporarily supersedes the identified rate table.  Use the Rate expiration times to define duration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateSupersedeLink")
  public String getRateSupersedeLink() {
    return rateSupersedeLink;
  }

  public void setRateSupersedeLink(String rateSupersedeLink) {
    this.rateSupersedeLink = rateSupersedeLink;
  }

  public RateTable rateLineCollections(List<@Valid RateLineCollection> rateLineCollections) {
    this.rateLineCollections = rateLineCollections;
    return this;
  }

  public RateTable addRateLineCollectionsItem(RateLineCollection rateLineCollectionsItem) {
    if (this.rateLineCollections == null) {
      this.rateLineCollections = new ArrayList<>();
    }
    this.rateLineCollections.add(rateLineCollectionsItem);
    return this;
  }

  /**
   * List of line collection
   * @return rateLineCollections
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "rateLineCollections", description = "List of line collection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rateLineCollections")
  public List<@Valid RateLineCollection> getRateLineCollections() {
    return rateLineCollections;
  }

  public void setRateLineCollections(List<@Valid RateLineCollection> rateLineCollections) {
    this.rateLineCollections = rateLineCollections;
  }

  public RateTable additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return additionalInformation
  */
  
  @Schema(name = "additionalInformation", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInformation")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateTable rateTable = (RateTable) o;
    return Objects.equals(this.id, rateTable.id) &&
        Objects.equals(this.version, rateTable.version) &&
        Objects.equals(this.rateTableName, rateTable.rateTableName) &&
        Objects.equals(this.validityStart, rateTable.validityStart) &&
        Objects.equals(this.validityEnd, rateTable.validityEnd) &&
        Objects.equals(this.validation, rateTable.validation) &&
        Objects.equals(this.rateType, rateTable.rateType) &&
        Objects.equals(this.rateTableID, rateTable.rateTableID) &&
        Objects.equals(this.activeTimes, rateTable.activeTimes) &&
        Objects.equals(this.availability, rateTable.availability) &&
        Objects.equals(this.rateResponsibleParty, rateTable.rateResponsibleParty) &&
        Objects.equals(this.rateSupersedeLink, rateTable.rateSupersedeLink) &&
        Objects.equals(this.rateLineCollections, rateTable.rateLineCollections) &&
        Objects.equals(this.additionalInformation, rateTable.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, rateTableName, validityStart, validityEnd, validation, rateType, rateTableID, activeTimes, availability, rateResponsibleParty, rateSupersedeLink, rateLineCollections, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateTable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    rateTableName: ").append(toIndentedString(rateTableName)).append("\n");
    sb.append("    validityStart: ").append(toIndentedString(validityStart)).append("\n");
    sb.append("    validityEnd: ").append(toIndentedString(validityEnd)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    rateTableID: ").append(toIndentedString(rateTableID)).append("\n");
    sb.append("    activeTimes: ").append(toIndentedString(activeTimes)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    rateResponsibleParty: ").append(toIndentedString(rateResponsibleParty)).append("\n");
    sb.append("    rateSupersedeLink: ").append(toIndentedString(rateSupersedeLink)).append("\n");
    sb.append("    rateLineCollections: ").append(toIndentedString(rateLineCollections)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

