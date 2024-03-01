package org.npp.model.session;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.enums.CredentialTypeEnum;
import org.npp.model.common.Reference;
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
 * Segments enable a single Session to capture and report changes in Rate and AssignedRight during a Session. A Segment can only have one AssignedRight and Rate associated to it and is : * Is associated to a Session. * Is associated to an AssignedRight. * Is associated to a specific Rate via the AssignedRight. * Has a start and end time. * Has a credential via the AssignedRight. * Is associated to basic financial data. * Has version control on the AssignedRight (i.e. a segment starts with one AssignedRight and then is updated to a new AssignedRight at the end of the Segment, replacing the original). * Has a Place reference or Space ID.
 */

@Schema(name = "Segment", description = "Segments enable a single Session to capture and report changes in Rate and AssignedRight during a Session. A Segment can only have one AssignedRight and Rate associated to it and is : * Is associated to a Session. * Is associated to an AssignedRight. * Is associated to a specific Rate via the AssignedRight. * Has a start and end time. * Has a credential via the AssignedRight. * Is associated to basic financial data. * Has version control on the AssignedRight (i.e. a segment starts with one AssignedRight and then is updated to a new AssignedRight at the end of the Segment, replacing the original). * Has a Place reference or Space ID.")

public class Segment {

  private String id;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualEnd;

  private VersionedReference assignedRight;

  private Reference spaceId;

  @Valid
  private List<@Valid CredentialTypeEnum> validationType = new ArrayList<>();

  private String validationId;

  @Valid
  private List<@Valid SpecificLanguageString> notes;

  private Reference credentialId;

  public Segment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Segment(String id, Integer version, OffsetDateTime actualStart, VersionedReference assignedRight, List<@Valid CredentialTypeEnum> validationType) {
    this.id = id;
    this.version = version;
    this.actualStart = actualStart;
    this.assignedRight = assignedRight;
    this.validationType = validationType;
  }

  public Segment id(String id) {
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

  public Segment version(Integer version) {
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

  public Segment actualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
    return this;
  }

  /**
   * Get actualStart
   * @return actualStart
  */
  @NotNull @Valid 
  @Schema(name = "actualStart", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actualStart")
  public OffsetDateTime getActualStart() {
    return actualStart;
  }

  public void setActualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
  }

  public Segment actualEnd(OffsetDateTime actualEnd) {
    this.actualEnd = actualEnd;
    return this;
  }

  /**
   * Get actualEnd
   * @return actualEnd
  */
  @Valid 
  @Schema(name = "actualEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualEnd")
  public OffsetDateTime getActualEnd() {
    return actualEnd;
  }

  public void setActualEnd(OffsetDateTime actualEnd) {
    this.actualEnd = actualEnd;
  }

  public Segment assignedRight(VersionedReference assignedRight) {
    this.assignedRight = assignedRight;
    return this;
  }

  /**
   * Get assignedRight
   * @return assignedRight
  */
  @NotNull @Valid 
  @Schema(name = "assignedRight", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignedRight")
  public VersionedReference getAssignedRight() {
    return assignedRight;
  }

  public void setAssignedRight(VersionedReference assignedRight) {
    this.assignedRight = assignedRight;
  }

  public Segment spaceId(Reference spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
  */
  @Valid 
  @Schema(name = "spaceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spaceId")
  public Reference getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(Reference spaceId) {
    this.spaceId = spaceId;
  }

  public Segment validationType(List<@Valid CredentialTypeEnum> validationType) {
    this.validationType = validationType;
    return this;
  }

  public Segment addValidationTypeItem(CredentialTypeEnum validationTypeItem) {
    if (this.validationType == null) {
      this.validationType = new ArrayList<>();
    }
    this.validationType.add(validationTypeItem);
    return this;
  }

  /**
   * The form of validation (the nature of credential) that is used in conjunction with the specific segment.
   * @return validationType
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "validationType", description = "The form of validation (the nature of credential) that is used in conjunction with the specific segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validationType")
  public List<@Valid CredentialTypeEnum> getValidationType() {
    return validationType;
  }

  public void setValidationType(List<@Valid CredentialTypeEnum> validationType) {
    this.validationType = validationType;
  }

  public Segment validationId(String validationId) {
    this.validationId = validationId;
    return this;
  }

  /**
   * Specific validation identification associated to the segment.
   * @return validationId
  */
  
  @Schema(name = "validationId", description = "Specific validation identification associated to the segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validationId")
  public String getValidationId() {
    return validationId;
  }

  public void setValidationId(String validationId) {
    this.validationId = validationId;
  }

  public Segment notes(List<@Valid SpecificLanguageString> notes) {
    this.notes = notes;
    return this;
  }

  public Segment addNotesItem(SpecificLanguageString notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return notes
  */
  @Valid 
  @Schema(name = "notes", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public List<@Valid SpecificLanguageString> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid SpecificLanguageString> notes) {
    this.notes = notes;
  }

  public Segment credentialId(Reference credentialId) {
    this.credentialId = credentialId;
    return this;
  }

  /**
   * Get credentialId
   * @return credentialId
  */
  @Valid 
  @Schema(name = "credentialId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentialId")
  public Reference getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(Reference credentialId) {
    this.credentialId = credentialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(this.id, segment.id) &&
        Objects.equals(this.version, segment.version) &&
        Objects.equals(this.actualStart, segment.actualStart) &&
        Objects.equals(this.actualEnd, segment.actualEnd) &&
        Objects.equals(this.assignedRight, segment.assignedRight) &&
        Objects.equals(this.spaceId, segment.spaceId) &&
        Objects.equals(this.validationType, segment.validationType) &&
        Objects.equals(this.validationId, segment.validationId) &&
        Objects.equals(this.notes, segment.notes) &&
        Objects.equals(this.credentialId, segment.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, actualStart, actualEnd, assignedRight, spaceId, validationType, validationId, notes, credentialId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    actualStart: ").append(toIndentedString(actualStart)).append("\n");
    sb.append("    actualEnd: ").append(toIndentedString(actualEnd)).append("\n");
    sb.append("    assignedRight: ").append(toIndentedString(assignedRight)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
    sb.append("    validationId: ").append(toIndentedString(validationId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
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

