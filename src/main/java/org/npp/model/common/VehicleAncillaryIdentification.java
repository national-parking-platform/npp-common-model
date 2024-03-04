package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information relating to a specific vehicle.
 */

@Schema(name = "VehicleAncillaryIdentification", description = "Information relating to a specific vehicle.")

public class VehicleAncillaryIdentification {

  private String country;

  private String color;

  private String description;

  private String make;

  private String model;

  private String stateProvince;

  public VehicleAncillaryIdentification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleAncillaryIdentification(String country) {
    this.country = country;
  }

  public VehicleAncillaryIdentification country(String country) {
    this.country = country;
    return this;
  }

  /**
   * EN ISO 3166-1 two-character country code.
   * @return country
  */
  @NotNull @Pattern(regexp = "^[a-z]{2}$") 
  @Schema(name = "country", example = "es", description = "EN ISO 3166-1 two-character country code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public VehicleAncillaryIdentification color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The predominant colour of the vehicle.
   * @return color
  */
  
  @Schema(name = "color", description = "The predominant colour of the vehicle.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public VehicleAncillaryIdentification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-text description of other distinguishing features of the vehicle.
   * @return description
  */
  
  @Schema(name = "description", description = "Free-text description of other distinguishing features of the vehicle.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VehicleAncillaryIdentification make(String make) {
    this.make = make;
    return this;
  }

  /**
   * The branded manufacturer's name for the vehicle (e.g. Ford, Audi, BMW, Mazda).
   * @return make
  */
  
  @Schema(name = "make", description = "The branded manufacturer's name for the vehicle (e.g. Ford, Audi, BMW, Mazda).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public VehicleAncillaryIdentification model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model name for the vehicle type (e.g. Ford \"Mondeo\", Citroen \"C-Zero\").
   * @return model
  */
  
  @Schema(name = "model", description = "The model name for the vehicle type (e.g. Ford \"Mondeo\", Citroen \"C-Zero\").", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleAncillaryIdentification stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * State, province or other administrative subdivision where a nation state permits registration of  vehicles on a lower administrative level basis.'
   * @return stateProvince
  */
  
  @Schema(name = "stateProvince", description = "State, province or other administrative subdivision where a nation state permits registration of  vehicles on a lower administrative level basis.'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateProvince")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleAncillaryIdentification vehicleAncillaryIdentification = (VehicleAncillaryIdentification) o;
    return Objects.equals(this.country, vehicleAncillaryIdentification.country) &&
        Objects.equals(this.color, vehicleAncillaryIdentification.color) &&
        Objects.equals(this.description, vehicleAncillaryIdentification.description) &&
        Objects.equals(this.make, vehicleAncillaryIdentification.make) &&
        Objects.equals(this.model, vehicleAncillaryIdentification.model) &&
        Objects.equals(this.stateProvince, vehicleAncillaryIdentification.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, color, description, make, model, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleAncillaryIdentification {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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

