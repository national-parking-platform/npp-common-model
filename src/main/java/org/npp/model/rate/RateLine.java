package org.npp.model.rate;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.rate.RateLineTax;
import org.npp.model.rate.enums.RateLineTypeEnum;
import org.npp.model.rate.enums.RateUsageConditionsTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A specific rate element of a rate line collection within a specific rate table. &#x60;incrementPeriod&#x60; is the time period for incrementing the rate line charge.  If set to the same as the duration of the period between the &#x60;durationStart&#x60; and &#x60;durationEnd&#x60; the increment  will occur once per period, i.e. a flat rate time-based tier charge rate.
 */

@Schema(name = "RateLine", description = "A specific rate element of a rate line collection within a specific rate table. `incrementPeriod` is the time period for incrementing the rate line charge.  If set to the same as the duration of the period between the `durationStart` and `durationEnd` the increment  will occur once per period, i.e. a flat rate time-based tier charge rate.")

public class RateLine {

  private String description;

  private String durationStart;

  private String durationEnd;

  private String incrementPeriod;

  private RateLineTypeEnum rateLineType;

  private Integer sequence;

  private Float value;

  private RateUsageConditionsTypeEnum usageCondition;

  private RateLineTax rateLineTax;

  private Float minValue;

  private Float maxValue;

  public RateLine() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateLine(RateLineTypeEnum rateLineType, Integer sequence, Float value) {
    this.rateLineType = rateLineType;
    this.sequence = sequence;
    this.value = value;
  }

  public RateLine description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-text description associated with this rate line.
   * @return description
  */
  
  @Schema(name = "description", description = "Free-text description associated with this rate line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RateLine durationStart(String durationStart) {
    this.durationStart = durationStart;
    return this;
  }

  /**
   * If used, indicates the start time for the applicability of the specific rate line,  generally with respect to the start of the parking or other mobility session,  e.g. the start of a time-based tier charge rate.
   * @return durationStart
  */
  
  @Schema(name = "durationStart", description = "If used, indicates the start time for the applicability of the specific rate line,  generally with respect to the start of the parking or other mobility session,  e.g. the start of a time-based tier charge rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationStart")
  public String getDurationStart() {
    return durationStart;
  }

  public void setDurationStart(String durationStart) {
    this.durationStart = durationStart;
  }

  public RateLine durationEnd(String durationEnd) {
    this.durationEnd = durationEnd;
    return this;
  }

  /**
   * If used, indicates the end time for the applicability of the specific rate line,  generally with respect to the end of the parking or other mobility session,  e.g. the end of a time-based tier charge rate.
   * @return durationEnd
  */
  
  @Schema(name = "durationEnd", description = "If used, indicates the end time for the applicability of the specific rate line,  generally with respect to the end of the parking or other mobility session,  e.g. the end of a time-based tier charge rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationEnd")
  public String getDurationEnd() {
    return durationEnd;
  }

  public void setDurationEnd(String durationEnd) {
    this.durationEnd = durationEnd;
  }

  public RateLine incrementPeriod(String incrementPeriod) {
    this.incrementPeriod = incrementPeriod;
    return this;
  }

  /**
   * ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].
   * @return incrementPeriod
  */
  @Pattern(regexp = "^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?(T(?=\\d)(\\d+H)?(\\d+M)?(\\d+S)?)?$") 
  @Schema(name = "incrementPeriod", example = "P1Y2M3DT4H5M6S", description = "ISO8601 format definition of an interval of time in format [PnnYnnMnnDTnnHnnMnnS].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("incrementPeriod")
  public String getIncrementPeriod() {
    return incrementPeriod;
  }

  public void setIncrementPeriod(String incrementPeriod) {
    this.incrementPeriod = incrementPeriod;
  }

  public RateLine rateLineType(RateLineTypeEnum rateLineType) {
    this.rateLineType = rateLineType;
    return this;
  }

  /**
   * Get rateLineType
   * @return rateLineType
  */
  @NotNull @Valid 
  @Schema(name = "rateLineType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rateLineType")
  public RateLineTypeEnum getRateLineType() {
    return rateLineType;
  }

  public void setRateLineType(RateLineTypeEnum rateLineType) {
    this.rateLineType = rateLineType;
  }

  public RateLine sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * The position of this rate line within a RateLine collection
   * minimum: 1
   * @return sequence
  */
  @NotNull @Min(1) 
  @Schema(name = "sequence", description = "The position of this rate line within a RateLine collection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sequence")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public RateLine value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * the value of the fee to be charged in respect of this rate line
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "the value of the fee to be charged in respect of this rate line", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public RateLine usageCondition(RateUsageConditionsTypeEnum usageCondition) {
    this.usageCondition = usageCondition;
    return this;
  }

  /**
   * Get usageCondition
   * @return usageCondition
  */
  @Valid 
  @Schema(name = "usageCondition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageCondition")
  public RateUsageConditionsTypeEnum getUsageCondition() {
    return usageCondition;
  }

  public void setUsageCondition(RateUsageConditionsTypeEnum usageCondition) {
    this.usageCondition = usageCondition;
  }

  public RateLine rateLineTax(RateLineTax rateLineTax) {
    this.rateLineTax = rateLineTax;
    return this;
  }

  /**
   * Get rateLineTax
   * @return rateLineTax
  */
  @Valid 
  @Schema(name = "rateLineTax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateLineTax")
  public RateLineTax getRateLineTax() {
    return rateLineTax;
  }

  public void setRateLineTax(RateLineTax rateLineTax) {
    this.rateLineTax = rateLineTax;
  }

  public RateLine minValue(Float minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * The minimum monetary amount to be applied in conjunction with use of this rate line collection.
   * @return minValue
  */
  
  @Schema(name = "minValue", description = "The minimum monetary amount to be applied in conjunction with use of this rate line collection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minValue")
  public Float getMinValue() {
    return minValue;
  }

  public void setMinValue(Float minValue) {
    this.minValue = minValue;
  }

  public RateLine maxValue(Float maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * The maximum monetary amount to be applied in conjunction with use of this rate line collection.
   * @return maxValue
  */
  
  @Schema(name = "maxValue", description = "The maximum monetary amount to be applied in conjunction with use of this rate line collection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxValue")
  public Float getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Float maxValue) {
    this.maxValue = maxValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLine rateLine = (RateLine) o;
    return Objects.equals(this.description, rateLine.description) &&
        Objects.equals(this.durationStart, rateLine.durationStart) &&
        Objects.equals(this.durationEnd, rateLine.durationEnd) &&
        Objects.equals(this.incrementPeriod, rateLine.incrementPeriod) &&
        Objects.equals(this.rateLineType, rateLine.rateLineType) &&
        Objects.equals(this.sequence, rateLine.sequence) &&
        Objects.equals(this.value, rateLine.value) &&
        Objects.equals(this.usageCondition, rateLine.usageCondition) &&
        Objects.equals(this.rateLineTax, rateLine.rateLineTax) &&
        Objects.equals(this.minValue, rateLine.minValue) &&
        Objects.equals(this.maxValue, rateLine.maxValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, durationStart, durationEnd, incrementPeriod, rateLineType, sequence, value, usageCondition, rateLineTax, minValue, maxValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLine {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    durationStart: ").append(toIndentedString(durationStart)).append("\n");
    sb.append("    durationEnd: ").append(toIndentedString(durationEnd)).append("\n");
    sb.append("    incrementPeriod: ").append(toIndentedString(incrementPeriod)).append("\n");
    sb.append("    rateLineType: ").append(toIndentedString(rateLineType)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    usageCondition: ").append(toIndentedString(usageCondition)).append("\n");
    sb.append("    rateLineTax: ").append(toIndentedString(rateLineTax)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
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

