package org.npp.model.observation;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.observation.ObservationElement;
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
 * Details of the collection of a set of related recorded observations.
 */

@Schema(name = "ObservationSet", description = "Details of the collection of a set of related recorded observations.")

public class ObservationSet {

  private String id;

  private Integer version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDateTime;

  private VersionedReference creator;

  @Valid
  private List<@Valid ObservationElement> observationElements;

  public ObservationSet() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObservationSet(String id, Integer version, OffsetDateTime creationDateTime, VersionedReference creator) {
    this.id = id;
    this.version = version;
    this.creationDateTime = creationDateTime;
    this.creator = creator;
  }

  public ObservationSet id(String id) {
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

  public ObservationSet version(Integer version) {
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

  public ObservationSet creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * The date and time of the creation of the observation set.
   * @return creationDateTime
  */
  @NotNull @Valid 
  @Schema(name = "creationDateTime", description = "The date and time of the creation of the observation set.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationDateTime")
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public ObservationSet creator(VersionedReference creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  @NotNull @Valid 
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creator")
  public VersionedReference getCreator() {
    return creator;
  }

  public void setCreator(VersionedReference creator) {
    this.creator = creator;
  }

  public ObservationSet observationElements(List<@Valid ObservationElement> observationElements) {
    this.observationElements = observationElements;
    return this;
  }

  public ObservationSet addObservationElementsItem(ObservationElement observationElementsItem) {
    if (this.observationElements == null) {
      this.observationElements = new ArrayList<>();
    }
    this.observationElements.add(observationElementsItem);
    return this;
  }

  /**
   * List of individual observations in the set.
   * @return observationElements
  */
  @Valid 
  @Schema(name = "observationElements", description = "List of individual observations in the set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observationElements")
  public List<@Valid ObservationElement> getObservationElements() {
    return observationElements;
  }

  public void setObservationElements(List<@Valid ObservationElement> observationElements) {
    this.observationElements = observationElements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationSet observationSet = (ObservationSet) o;
    return Objects.equals(this.id, observationSet.id) &&
        Objects.equals(this.version, observationSet.version) &&
        Objects.equals(this.creationDateTime, observationSet.creationDateTime) &&
        Objects.equals(this.creator, observationSet.creator) &&
        Objects.equals(this.observationElements, observationSet.observationElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, creationDateTime, creator, observationElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationSet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    observationElements: ").append(toIndentedString(observationElements)).append("\n");
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

