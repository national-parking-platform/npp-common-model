package org.npp.model.session;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.right.HolderCredential;
import org.npp.model.session.Segment;
import org.npp.model.common.VehicleAncillaryIdentification;
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
 * A Session captures the **actual** use of an &#x60;AssignedRight&#x60; and includes start time, end time, credential,  and other relevant data related to an operational transaction. A Session is not used for future activities.  A &#x60;Session&#x60; is broken into one or multiple &#x60;Segments&#x60;.  &#x60;Segments&#x60; enable a single &#x60;Session&#x60; to capture and report changes in &#x60;Rate&#x60; and &#x60;AssignedRight&#x60; during a &#x60;Session&#x60;.
 */

@Schema(name = "Session", description = "A Session captures the **actual** use of an `AssignedRight` and includes start time, end time, credential,  and other relevant data related to an operational transaction. A Session is not used for future activities.  A `Session` is broken into one or multiple `Segments`.  `Segments` enable a single `Session` to capture and report changes in `Rate` and `AssignedRight` during a `Session`.")

public class Session {

  private String id;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime actualEnd;

  private VersionedReference initiator;

  @Valid
  private List<@Valid HolderCredential> identifiedCredentials = new ArrayList<>();

  @Valid
  private List<@Valid Segment> segments = new ArrayList<>();

  private VersionedReference hierarchyElement;

  private VehicleAncillaryIdentification identifiedVehicle;

  public Session() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Session(String id, Integer version, OffsetDateTime actualStart, VersionedReference initiator, List<@Valid HolderCredential> identifiedCredentials, List<@Valid Segment> segments) {
    this.id = id;
    this.version = version;
    this.actualStart = actualStart;
    this.initiator = initiator;
    this.identifiedCredentials = identifiedCredentials;
    this.segments = segments;
  }

  public Session id(String id) {
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

  public Session version(Integer version) {
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

  public Session actualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
    return this;
  }

  /**
   * The date/time of the start of the session.
   * @return actualStart
  */
  @NotNull @Valid 
  @Schema(name = "actualStart", description = "The date/time of the start of the session.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actualStart")
  public OffsetDateTime getActualStart() {
    return actualStart;
  }

  public void setActualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
  }

  public Session actualEnd(OffsetDateTime actualEnd) {
    this.actualEnd = actualEnd;
    return this;
  }

  /**
   * The date/time of the end of the session.
   * @return actualEnd
  */
  @Valid 
  @Schema(name = "actualEnd", description = "The date/time of the end of the session.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualEnd")
  public OffsetDateTime getActualEnd() {
    return actualEnd;
  }

  public void setActualEnd(OffsetDateTime actualEnd) {
    this.actualEnd = actualEnd;
  }

  public Session initiator(VersionedReference initiator) {
    this.initiator = initiator;
    return this;
  }

  /**
   * Get initiator
   * @return initiator
  */
  @NotNull @Valid 
  @Schema(name = "initiator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("initiator")
  public VersionedReference getInitiator() {
    return initiator;
  }

  public void setInitiator(VersionedReference initiator) {
    this.initiator = initiator;
  }

  public Session identifiedCredentials(List<@Valid HolderCredential> identifiedCredentials) {
    this.identifiedCredentials = identifiedCredentials;
    return this;
  }

  public Session addIdentifiedCredentialsItem(HolderCredential identifiedCredentialsItem) {
    if (this.identifiedCredentials == null) {
      this.identifiedCredentials = new ArrayList<>();
    }
    this.identifiedCredentials.add(identifiedCredentialsItem);
    return this;
  }

  /**
   * Get identifiedCredentials
   * @return identifiedCredentials
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "identifiedCredentials", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifiedCredentials")
  public List<@Valid HolderCredential> getIdentifiedCredentials() {
    return identifiedCredentials;
  }

  public void setIdentifiedCredentials(List<@Valid HolderCredential> identifiedCredentials) {
    this.identifiedCredentials = identifiedCredentials;
  }

  public Session segments(List<@Valid Segment> segments) {
    this.segments = segments;
    return this;
  }

  public Session addSegmentsItem(Segment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Get segments
   * @return segments
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "segments", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("segments")
  public List<@Valid Segment> getSegments() {
    return segments;
  }

  public void setSegments(List<@Valid Segment> segments) {
    this.segments = segments;
  }

  public Session hierarchyElement(VersionedReference hierarchyElement) {
    this.hierarchyElement = hierarchyElement;
    return this;
  }

  /**
   * Get hierarchyElement
   * @return hierarchyElement
  */
  @Valid 
  @Schema(name = "hierarchyElement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchyElement")
  public VersionedReference getHierarchyElement() {
    return hierarchyElement;
  }

  public void setHierarchyElement(VersionedReference hierarchyElement) {
    this.hierarchyElement = hierarchyElement;
  }

  public Session identifiedVehicle(VehicleAncillaryIdentification identifiedVehicle) {
    this.identifiedVehicle = identifiedVehicle;
    return this;
  }

  /**
   * Get identifiedVehicle
   * @return identifiedVehicle
  */
  @Valid 
  @Schema(name = "identifiedVehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identifiedVehicle")
  public VehicleAncillaryIdentification getIdentifiedVehicle() {
    return identifiedVehicle;
  }

  public void setIdentifiedVehicle(VehicleAncillaryIdentification identifiedVehicle) {
    this.identifiedVehicle = identifiedVehicle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.version, session.version) &&
        Objects.equals(this.actualStart, session.actualStart) &&
        Objects.equals(this.actualEnd, session.actualEnd) &&
        Objects.equals(this.initiator, session.initiator) &&
        Objects.equals(this.identifiedCredentials, session.identifiedCredentials) &&
        Objects.equals(this.segments, session.segments) &&
        Objects.equals(this.hierarchyElement, session.hierarchyElement) &&
        Objects.equals(this.identifiedVehicle, session.identifiedVehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, actualStart, actualEnd, initiator, identifiedCredentials, segments, hierarchyElement, identifiedVehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    actualStart: ").append(toIndentedString(actualStart)).append("\n");
    sb.append("    actualEnd: ").append(toIndentedString(actualEnd)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    identifiedCredentials: ").append(toIndentedString(identifiedCredentials)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    hierarchyElement: ").append(toIndentedString(hierarchyElement)).append("\n");
    sb.append("    identifiedVehicle: ").append(toIndentedString(identifiedVehicle)).append("\n");
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

