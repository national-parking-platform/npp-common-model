package org.npp.model.observation;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.location.PointLocation;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Positional information relating to an observation for both the observation target (&#39;observed&#39;) and the source (&#39;observer&#39;).
 */

@Schema(name = "Location", description = "Positional information relating to an observation for both the observation target ('observed') and the source ('observer').")

public class Location {

  private PointLocation observedLocation;

  @Valid
  private List<@Valid SpecificLanguageString> observedLocationTextual;

  private PointLocation observerLocation;

  public Location() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Location(PointLocation observerLocation) {
    this.observerLocation = observerLocation;
  }

  public Location observedLocation(PointLocation observedLocation) {
    this.observedLocation = observedLocation;
    return this;
  }

  /**
   * Get observedLocation
   * @return observedLocation
  */
  @Valid 
  @Schema(name = "observedLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedLocation")
  public PointLocation getObservedLocation() {
    return observedLocation;
  }

  public void setObservedLocation(PointLocation observedLocation) {
    this.observedLocation = observedLocation;
  }

  public Location observedLocationTextual(List<@Valid SpecificLanguageString> observedLocationTextual) {
    this.observedLocationTextual = observedLocationTextual;
    return this;
  }

  public Location addObservedLocationTextualItem(SpecificLanguageString observedLocationTextualItem) {
    if (this.observedLocationTextual == null) {
      this.observedLocationTextual = new ArrayList<>();
    }
    this.observedLocationTextual.add(observedLocationTextualItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return observedLocationTextual
  */
  @Valid 
  @Schema(name = "observedLocationTextual", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedLocationTextual")
  public List<@Valid SpecificLanguageString> getObservedLocationTextual() {
    return observedLocationTextual;
  }

  public void setObservedLocationTextual(List<@Valid SpecificLanguageString> observedLocationTextual) {
    this.observedLocationTextual = observedLocationTextual;
  }

  public Location observerLocation(PointLocation observerLocation) {
    this.observerLocation = observerLocation;
    return this;
  }

  /**
   * Get observerLocation
   * @return observerLocation
  */
  @NotNull @Valid 
  @Schema(name = "observerLocation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("observerLocation")
  public PointLocation getObserverLocation() {
    return observerLocation;
  }

  public void setObserverLocation(PointLocation observerLocation) {
    this.observerLocation = observerLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.observedLocation, location.observedLocation) &&
        Objects.equals(this.observedLocationTextual, location.observedLocationTextual) &&
        Objects.equals(this.observerLocation, location.observerLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedLocation, observedLocationTextual, observerLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    observedLocation: ").append(toIndentedString(observedLocation)).append("\n");
    sb.append("    observedLocationTextual: ").append(toIndentedString(observedLocationTextual)).append("\n");
    sb.append("    observerLocation: ").append(toIndentedString(observerLocation)).append("\n");
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

