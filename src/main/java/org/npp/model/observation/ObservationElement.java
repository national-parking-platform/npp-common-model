package org.npp.model.observation;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.enums.CredentialTypeEnum;
import org.npp.model.observation.Image;
import org.npp.model.observation.Location;
import org.npp.model.observation.enums.ObservationTypeEnum;
import org.npp.model.common.SpecificLanguageString;
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
 * A specific collection of observation details intended to be used for one specific observation instance.
 */

@Schema(name = "ObservationElement", description = "A specific collection of observation details intended to be used for one specific observation instance.")

public class ObservationElement {

  private String id;

  private Integer version;

  private ObservationTypeEnum method;

  private String observer;

  private CredentialTypeEnum type;

  private String observedCredentialId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime observationStartTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime observationEndTime;

  @Valid
  private List<@Valid SpecificLanguageString> description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDateTime;

  private Location location;

  @Valid
  private List<@Valid Image> images;

  private VersionedReference elementIds;

  private VehicleAncillaryIdentification vehicleAncillaryIdentification;

  private VersionedReference observerOrganisation;

  public ObservationElement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObservationElement(String id, Integer version, ObservationTypeEnum method, OffsetDateTime observationStartTime, OffsetDateTime creationDateTime, Location location, VersionedReference observerOrganisation) {
    this.id = id;
    this.version = version;
    this.method = method;
    this.observationStartTime = observationStartTime;
    this.creationDateTime = creationDateTime;
    this.location = location;
    this.observerOrganisation = observerOrganisation;
  }

  public ObservationElement id(String id) {
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

  public ObservationElement version(Integer version) {
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

  public ObservationElement method(ObservationTypeEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull @Valid 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public ObservationTypeEnum getMethod() {
    return method;
  }

  public void setMethod(ObservationTypeEnum method) {
    this.method = method;
  }

  public ObservationElement observer(String observer) {
    this.observer = observer;
    return this;
  }

  /**
   * The individual person making the observation recorded in this observation element.
   * @return observer
  */
  
  @Schema(name = "observer", description = "The individual person making the observation recorded in this observation element.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observer")
  public String getObserver() {
    return observer;
  }

  public void setObserver(String observer) {
    this.observer = observer;
  }

  public ObservationElement type(CredentialTypeEnum type) {
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
  public CredentialTypeEnum getType() {
    return type;
  }

  public void setType(CredentialTypeEnum type) {
    this.type = type;
  }

  public ObservationElement observedCredentialId(String observedCredentialId) {
    this.observedCredentialId = observedCredentialId;
    return this;
  }

  /**
   * Specific identifier to the referenced observed credential.
   * @return observedCredentialId
  */
  
  @Schema(name = "observedCredentialId", description = "Specific identifier to the referenced observed credential.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedCredentialId")
  public String getObservedCredentialId() {
    return observedCredentialId;
  }

  public void setObservedCredentialId(String observedCredentialId) {
    this.observedCredentialId = observedCredentialId;
  }

  public ObservationElement observationStartTime(OffsetDateTime observationStartTime) {
    this.observationStartTime = observationStartTime;
    return this;
  }

  /**
   * The initial date and time of the observation.
   * @return observationStartTime
  */
  @NotNull @Valid 
  @Schema(name = "observationStartTime", description = "The initial date and time of the observation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("observationStartTime")
  public OffsetDateTime getObservationStartTime() {
    return observationStartTime;
  }

  public void setObservationStartTime(OffsetDateTime observationStartTime) {
    this.observationStartTime = observationStartTime;
  }

  public ObservationElement observationEndTime(OffsetDateTime observationEndTime) {
    this.observationEndTime = observationEndTime;
    return this;
  }

  /**
   * The ending date and time of the observation, when it was continuous since `observationStartTime`.
   * @return observationEndTime
  */
  @Valid 
  @Schema(name = "observationEndTime", description = "The ending date and time of the observation, when it was continuous since `observationStartTime`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observationEndTime")
  public OffsetDateTime getObservationEndTime() {
    return observationEndTime;
  }

  public void setObservationEndTime(OffsetDateTime observationEndTime) {
    this.observationEndTime = observationEndTime;
  }

  public ObservationElement description(List<@Valid SpecificLanguageString> description) {
    this.description = description;
    return this;
  }

  public ObservationElement addDescriptionItem(SpecificLanguageString descriptionItem) {
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

  public ObservationElement creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * The date and time stamp for the creation of the observation element.
   * @return creationDateTime
  */
  @NotNull @Valid 
  @Schema(name = "creationDateTime", description = "The date and time stamp for the creation of the observation element.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationDateTime")
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public ObservationElement location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @NotNull @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ObservationElement images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public ObservationElement addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * still or moving images observation evidence or a reference to such observation evidence
   * @return images
  */
  @Valid 
  @Schema(name = "images", description = "still or moving images observation evidence or a reference to such observation evidence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public List<@Valid Image> getImages() {
    return images;
  }

  public void setImages(List<@Valid Image> images) {
    this.images = images;
  }

  public ObservationElement elementIds(VersionedReference elementIds) {
    this.elementIds = elementIds;
    return this;
  }

  /**
   * Get elementIds
   * @return elementIds
  */
  @Valid 
  @Schema(name = "elementIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementIds")
  public VersionedReference getElementIds() {
    return elementIds;
  }

  public void setElementIds(VersionedReference elementIds) {
    this.elementIds = elementIds;
  }

  public ObservationElement vehicleAncillaryIdentification(VehicleAncillaryIdentification vehicleAncillaryIdentification) {
    this.vehicleAncillaryIdentification = vehicleAncillaryIdentification;
    return this;
  }

  /**
   * Get vehicleAncillaryIdentification
   * @return vehicleAncillaryIdentification
  */
  @Valid 
  @Schema(name = "vehicleAncillaryIdentification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleAncillaryIdentification")
  public VehicleAncillaryIdentification getVehicleAncillaryIdentification() {
    return vehicleAncillaryIdentification;
  }

  public void setVehicleAncillaryIdentification(VehicleAncillaryIdentification vehicleAncillaryIdentification) {
    this.vehicleAncillaryIdentification = vehicleAncillaryIdentification;
  }

  public ObservationElement observerOrganisation(VersionedReference observerOrganisation) {
    this.observerOrganisation = observerOrganisation;
    return this;
  }

  /**
   * Get observerOrganisation
   * @return observerOrganisation
  */
  @NotNull @Valid 
  @Schema(name = "observerOrganisation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("observerOrganisation")
  public VersionedReference getObserverOrganisation() {
    return observerOrganisation;
  }

  public void setObserverOrganisation(VersionedReference observerOrganisation) {
    this.observerOrganisation = observerOrganisation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationElement observationElement = (ObservationElement) o;
    return Objects.equals(this.id, observationElement.id) &&
        Objects.equals(this.version, observationElement.version) &&
        Objects.equals(this.method, observationElement.method) &&
        Objects.equals(this.observer, observationElement.observer) &&
        Objects.equals(this.type, observationElement.type) &&
        Objects.equals(this.observedCredentialId, observationElement.observedCredentialId) &&
        Objects.equals(this.observationStartTime, observationElement.observationStartTime) &&
        Objects.equals(this.observationEndTime, observationElement.observationEndTime) &&
        Objects.equals(this.description, observationElement.description) &&
        Objects.equals(this.creationDateTime, observationElement.creationDateTime) &&
        Objects.equals(this.location, observationElement.location) &&
        Objects.equals(this.images, observationElement.images) &&
        Objects.equals(this.elementIds, observationElement.elementIds) &&
        Objects.equals(this.vehicleAncillaryIdentification, observationElement.vehicleAncillaryIdentification) &&
        Objects.equals(this.observerOrganisation, observationElement.observerOrganisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, method, observer, type, observedCredentialId, observationStartTime, observationEndTime, description, creationDateTime, location, images, elementIds, vehicleAncillaryIdentification, observerOrganisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    observer: ").append(toIndentedString(observer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    observedCredentialId: ").append(toIndentedString(observedCredentialId)).append("\n");
    sb.append("    observationStartTime: ").append(toIndentedString(observationStartTime)).append("\n");
    sb.append("    observationEndTime: ").append(toIndentedString(observationEndTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    elementIds: ").append(toIndentedString(elementIds)).append("\n");
    sb.append("    vehicleAncillaryIdentification: ").append(toIndentedString(vehicleAncillaryIdentification)).append("\n");
    sb.append("    observerOrganisation: ").append(toIndentedString(observerOrganisation)).append("\n");
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

