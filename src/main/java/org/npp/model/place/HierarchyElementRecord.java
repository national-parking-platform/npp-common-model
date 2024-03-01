package org.npp.model.place;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
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
 * A collection of information concerning the creation of a hierarchy element.
 */

@Schema(name = "HierarchyElementRecord", description = "A collection of information concerning the creation of a hierarchy element.")

public class HierarchyElementRecord {

  private VersionedReference creator;

  private String creatorEmail;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationTime;

  public HierarchyElementRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HierarchyElementRecord(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public HierarchyElementRecord creator(VersionedReference creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  @Valid 
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator")
  public VersionedReference getCreator() {
    return creator;
  }

  public void setCreator(VersionedReference creator) {
    this.creator = creator;
  }

  public HierarchyElementRecord creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

  /**
   * Get creatorEmail
   * @return creatorEmail
  */
  @jakarta.validation.constraints.Email 
  @Schema(name = "creatorEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creatorEmail")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  public HierarchyElementRecord creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Date/time that this version of the place facility record was created.
   * @return creationTime
  */
  @NotNull @Valid 
  @Schema(name = "creationTime", description = "Date/time that this version of the place facility record was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationTime")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyElementRecord hierarchyElementRecord = (HierarchyElementRecord) o;
    return Objects.equals(this.creator, hierarchyElementRecord.creator) &&
        Objects.equals(this.creatorEmail, hierarchyElementRecord.creatorEmail) &&
        Objects.equals(this.creationTime, hierarchyElementRecord.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, creatorEmail, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyElementRecord {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

