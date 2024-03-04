package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.time.enums.FuzzyTimeTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Specifies the time period with non-precise characteristics.
 */

@Schema(name = "FuzzyTimePeriod", description = "Specifies the time period with non-precise characteristics.")

public class FuzzyTimePeriod {

  private FuzzyTimeTypeEnum beginOrDuration;

  private FuzzyTimeTypeEnum endOrDuration;

  public FuzzyTimePeriod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FuzzyTimePeriod(FuzzyTimeTypeEnum beginOrDuration, FuzzyTimeTypeEnum endOrDuration) {
    this.beginOrDuration = beginOrDuration;
    this.endOrDuration = endOrDuration;
  }

  public FuzzyTimePeriod beginOrDuration(FuzzyTimeTypeEnum beginOrDuration) {
    this.beginOrDuration = beginOrDuration;
    return this;
  }

  /**
   * Get beginOrDuration
   * @return beginOrDuration
  */
  @NotNull @Valid 
  @Schema(name = "beginOrDuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("beginOrDuration")
  public FuzzyTimeTypeEnum getBeginOrDuration() {
    return beginOrDuration;
  }

  public void setBeginOrDuration(FuzzyTimeTypeEnum beginOrDuration) {
    this.beginOrDuration = beginOrDuration;
  }

  public FuzzyTimePeriod endOrDuration(FuzzyTimeTypeEnum endOrDuration) {
    this.endOrDuration = endOrDuration;
    return this;
  }

  /**
   * Get endOrDuration
   * @return endOrDuration
  */
  @NotNull @Valid 
  @Schema(name = "endOrDuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endOrDuration")
  public FuzzyTimeTypeEnum getEndOrDuration() {
    return endOrDuration;
  }

  public void setEndOrDuration(FuzzyTimeTypeEnum endOrDuration) {
    this.endOrDuration = endOrDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FuzzyTimePeriod fuzzyTimePeriod = (FuzzyTimePeriod) o;
    return Objects.equals(this.beginOrDuration, fuzzyTimePeriod.beginOrDuration) &&
        Objects.equals(this.endOrDuration, fuzzyTimePeriod.endOrDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginOrDuration, endOrDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FuzzyTimePeriod {\n");
    sb.append("    beginOrDuration: ").append(toIndentedString(beginOrDuration)).append("\n");
    sb.append("    endOrDuration: ").append(toIndentedString(endOrDuration)).append("\n");
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

