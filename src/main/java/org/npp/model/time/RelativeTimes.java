package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.time.enums.TimeUnitRelativeEnum;
import org.npp.model.time.enums.UnitOfTimeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Relative times definition used in a time-based constrained
 */

@Schema(name = "RelativeTimes", description = "Relative times definition used in a time-based constrained")

public class RelativeTimes {

  private UnitOfTimeEnum unit;

  private TimeUnitRelativeEnum earliestStartRelative;

  private TimeUnitRelativeEnum earliestEndRelative;

  private TimeUnitRelativeEnum latestStartRelative;

  private TimeUnitRelativeEnum latestEndRelative;

  public RelativeTimes unit(UnitOfTimeEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  */
  @Valid 
  @Schema(name = "unit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public UnitOfTimeEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitOfTimeEnum unit) {
    this.unit = unit;
  }

  public RelativeTimes earliestStartRelative(TimeUnitRelativeEnum earliestStartRelative) {
    this.earliestStartRelative = earliestStartRelative;
    return this;
  }

  /**
   * Get earliestStartRelative
   * @return earliestStartRelative
  */
  @Valid 
  @Schema(name = "earliestStartRelative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestStartRelative")
  public TimeUnitRelativeEnum getEarliestStartRelative() {
    return earliestStartRelative;
  }

  public void setEarliestStartRelative(TimeUnitRelativeEnum earliestStartRelative) {
    this.earliestStartRelative = earliestStartRelative;
  }

  public RelativeTimes earliestEndRelative(TimeUnitRelativeEnum earliestEndRelative) {
    this.earliestEndRelative = earliestEndRelative;
    return this;
  }

  /**
   * Get earliestEndRelative
   * @return earliestEndRelative
  */
  @Valid 
  @Schema(name = "earliestEndRelative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestEndRelative")
  public TimeUnitRelativeEnum getEarliestEndRelative() {
    return earliestEndRelative;
  }

  public void setEarliestEndRelative(TimeUnitRelativeEnum earliestEndRelative) {
    this.earliestEndRelative = earliestEndRelative;
  }

  public RelativeTimes latestStartRelative(TimeUnitRelativeEnum latestStartRelative) {
    this.latestStartRelative = latestStartRelative;
    return this;
  }

  /**
   * Get latestStartRelative
   * @return latestStartRelative
  */
  @Valid 
  @Schema(name = "latestStartRelative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestStartRelative")
  public TimeUnitRelativeEnum getLatestStartRelative() {
    return latestStartRelative;
  }

  public void setLatestStartRelative(TimeUnitRelativeEnum latestStartRelative) {
    this.latestStartRelative = latestStartRelative;
  }

  public RelativeTimes latestEndRelative(TimeUnitRelativeEnum latestEndRelative) {
    this.latestEndRelative = latestEndRelative;
    return this;
  }

  /**
   * Get latestEndRelative
   * @return latestEndRelative
  */
  @Valid 
  @Schema(name = "latestEndRelative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestEndRelative")
  public TimeUnitRelativeEnum getLatestEndRelative() {
    return latestEndRelative;
  }

  public void setLatestEndRelative(TimeUnitRelativeEnum latestEndRelative) {
    this.latestEndRelative = latestEndRelative;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeTimes relativeTimes = (RelativeTimes) o;
    return Objects.equals(this.unit, relativeTimes.unit) &&
        Objects.equals(this.earliestStartRelative, relativeTimes.earliestStartRelative) &&
        Objects.equals(this.earliestEndRelative, relativeTimes.earliestEndRelative) &&
        Objects.equals(this.latestStartRelative, relativeTimes.latestStartRelative) &&
        Objects.equals(this.latestEndRelative, relativeTimes.latestEndRelative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, earliestStartRelative, earliestEndRelative, latestStartRelative, latestEndRelative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeTimes {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    earliestStartRelative: ").append(toIndentedString(earliestStartRelative)).append("\n");
    sb.append("    earliestEndRelative: ").append(toIndentedString(earliestEndRelative)).append("\n");
    sb.append("    latestStartRelative: ").append(toIndentedString(latestStartRelative)).append("\n");
    sb.append("    latestEndRelative: ").append(toIndentedString(latestEndRelative)).append("\n");
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

