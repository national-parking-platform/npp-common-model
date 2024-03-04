package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A RGB colour described by values for red, green and blue (0..255) as well as an optional name.
 */

@Schema(name = "RGBColour", description = "A RGB colour described by values for red, green and blue (0..255) as well as an optional name.")

public class RGBColour {

  @Valid
  private List<@Valid SpecificLanguageString> colourName;

  private Integer rgbBlueValue;

  private Integer rgbGreenValue;

  private Integer rgbRedValue;

  public RGBColour() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RGBColour(Integer rgbBlueValue, Integer rgbGreenValue, Integer rgbRedValue) {
    this.rgbBlueValue = rgbBlueValue;
    this.rgbGreenValue = rgbGreenValue;
    this.rgbRedValue = rgbRedValue;
  }

  public RGBColour colourName(List<@Valid SpecificLanguageString> colourName) {
    this.colourName = colourName;
    return this;
  }

  public RGBColour addColourNameItem(SpecificLanguageString colourNameItem) {
    if (this.colourName == null) {
      this.colourName = new ArrayList<>();
    }
    this.colourName.add(colourNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return colourName
  */
  @Valid 
  @Schema(name = "colourName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colourName")
  public List<@Valid SpecificLanguageString> getColourName() {
    return colourName;
  }

  public void setColourName(List<@Valid SpecificLanguageString> colourName) {
    this.colourName = colourName;
  }

  public RGBColour rgbBlueValue(Integer rgbBlueValue) {
    this.rgbBlueValue = rgbBlueValue;
    return this;
  }

  /**
   * The blue value of the RGB colour (0..255).
   * minimum: 0
   * maximum: 255
   * @return rgbBlueValue
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "rgbBlueValue", description = "The blue value of the RGB colour (0..255).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rgbBlueValue")
  public Integer getRgbBlueValue() {
    return rgbBlueValue;
  }

  public void setRgbBlueValue(Integer rgbBlueValue) {
    this.rgbBlueValue = rgbBlueValue;
  }

  public RGBColour rgbGreenValue(Integer rgbGreenValue) {
    this.rgbGreenValue = rgbGreenValue;
    return this;
  }

  /**
   * The green value of the RGB colour (0..255).
   * minimum: 0
   * maximum: 255
   * @return rgbGreenValue
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "rgbGreenValue", description = "The green value of the RGB colour (0..255).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rgbGreenValue")
  public Integer getRgbGreenValue() {
    return rgbGreenValue;
  }

  public void setRgbGreenValue(Integer rgbGreenValue) {
    this.rgbGreenValue = rgbGreenValue;
  }

  public RGBColour rgbRedValue(Integer rgbRedValue) {
    this.rgbRedValue = rgbRedValue;
    return this;
  }

  /**
   * The red value of the RGB colour (0..255).
   * minimum: 0
   * maximum: 255
   * @return rgbRedValue
  */
  @NotNull @Min(0) @Max(255) 
  @Schema(name = "rgbRedValue", description = "The red value of the RGB colour (0..255).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rgbRedValue")
  public Integer getRgbRedValue() {
    return rgbRedValue;
  }

  public void setRgbRedValue(Integer rgbRedValue) {
    this.rgbRedValue = rgbRedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RGBColour rgBColour = (RGBColour) o;
    return Objects.equals(this.colourName, rgBColour.colourName) &&
        Objects.equals(this.rgbBlueValue, rgBColour.rgbBlueValue) &&
        Objects.equals(this.rgbGreenValue, rgBColour.rgbGreenValue) &&
        Objects.equals(this.rgbRedValue, rgBColour.rgbRedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colourName, rgbBlueValue, rgbGreenValue, rgbRedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RGBColour {\n");
    sb.append("    colourName: ").append(toIndentedString(colourName)).append("\n");
    sb.append("    rgbBlueValue: ").append(toIndentedString(rgbBlueValue)).append("\n");
    sb.append("    rgbGreenValue: ").append(toIndentedString(rgbGreenValue)).append("\n");
    sb.append("    rgbRedValue: ").append(toIndentedString(rgbRedValue)).append("\n");
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

