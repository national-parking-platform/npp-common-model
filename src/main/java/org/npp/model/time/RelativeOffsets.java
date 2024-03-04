package org.npp.model.time;
  
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
 * Relative offsets definition used in a time-based constrained
 */

@Schema(name = "RelativeOffsets", description = "Relative offsets definition used in a time-based constrained")

public class RelativeOffsets {

  private String earliestStartRelative;

  private String earliestEndRelative;

  private String latestStartRelative;

  private String latestEndRelative;

  public RelativeOffsets earliestStartRelative(String earliestStartRelative) {
    this.earliestStartRelative = earliestStartRelative;
    return this;
  }

  /**
   * ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].
   * @return earliestStartRelative
  */
  @Pattern(regexp = "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?(T(?=\\d)(\\d+H)?(\\d+M)?(\\d+S)?)?$") 
  @Schema(name = "earliestStartRelative", example = "P1Y2M3DT4H5M6S", description = "ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestStartRelative")
  public String getEarliestStartRelative() {
    return earliestStartRelative;
  }

  public void setEarliestStartRelative(String earliestStartRelative) {
    this.earliestStartRelative = earliestStartRelative;
  }

  public RelativeOffsets earliestEndRelative(String earliestEndRelative) {
    this.earliestEndRelative = earliestEndRelative;
    return this;
  }

  /**
   * ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].
   * @return earliestEndRelative
  */
  @Pattern(regexp = "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?(T(?=\\d)(\\d+H)?(\\d+M)?(\\d+S)?)?$") 
  @Schema(name = "earliestEndRelative", example = "P1Y2M3DT4H5M6S", description = "ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earliestEndRelative")
  public String getEarliestEndRelative() {
    return earliestEndRelative;
  }

  public void setEarliestEndRelative(String earliestEndRelative) {
    this.earliestEndRelative = earliestEndRelative;
  }

  public RelativeOffsets latestStartRelative(String latestStartRelative) {
    this.latestStartRelative = latestStartRelative;
    return this;
  }

  /**
   * ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].
   * @return latestStartRelative
  */
  @Pattern(regexp = "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?(T(?=\\d)(\\d+H)?(\\d+M)?(\\d+S)?)?$") 
  @Schema(name = "latestStartRelative", example = "P1Y2M3DT4H5M6S", description = "ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestStartRelative")
  public String getLatestStartRelative() {
    return latestStartRelative;
  }

  public void setLatestStartRelative(String latestStartRelative) {
    this.latestStartRelative = latestStartRelative;
  }

  public RelativeOffsets latestEndRelative(String latestEndRelative) {
    this.latestEndRelative = latestEndRelative;
    return this;
  }

  /**
   * ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].
   * @return latestEndRelative
  */
  @Pattern(regexp = "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?(T(?=\\d)(\\d+H)?(\\d+M)?(\\d+S)?)?$") 
  @Schema(name = "latestEndRelative", example = "P1Y2M3DT4H5M6S", description = "ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latestEndRelative")
  public String getLatestEndRelative() {
    return latestEndRelative;
  }

  public void setLatestEndRelative(String latestEndRelative) {
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
    RelativeOffsets relativeOffsets = (RelativeOffsets) o;
    return Objects.equals(this.earliestStartRelative, relativeOffsets.earliestStartRelative) &&
        Objects.equals(this.earliestEndRelative, relativeOffsets.earliestEndRelative) &&
        Objects.equals(this.latestStartRelative, relativeOffsets.latestStartRelative) &&
        Objects.equals(this.latestEndRelative, relativeOffsets.latestEndRelative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestStartRelative, earliestEndRelative, latestStartRelative, latestEndRelative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeOffsets {\n");
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

