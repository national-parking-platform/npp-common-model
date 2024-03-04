package org.npp.model.rate;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.rate.enums.RefundTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.rate.enums.SurchargeTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Free-text description of the condition that leads to a surcharge being applied
 */

@Schema(name = "Surcharge", description = "Free-text description of the condition that leads to a surcharge being applied")

public class Surcharge {

  private Float rate;

  private RefundTypeEnum refund;

  private SurchargeTypeEnum surchargeType;

  @Valid
  private List<@Valid SpecificLanguageString> trigger;

  private Float value;

  public Surcharge() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Surcharge(RefundTypeEnum refund, SurchargeTypeEnum surchargeType) {
    this.refund = refund;
    this.surchargeType = surchargeType;
  }

  public Surcharge rate(Float rate) {
    this.rate = rate;
    return this;
  }

  /**
   * the percentage rate surcharge to be applied
   * minimum: 0
   * maximum: 100
   * @return rate
  */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "rate", description = "the percentage rate surcharge to be applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rate")
  public Float getRate() {
    return rate;
  }

  public void setRate(Float rate) {
    this.rate = rate;
  }

  public Surcharge refund(RefundTypeEnum refund) {
    this.refund = refund;
    return this;
  }

  /**
   * Get refund
   * @return refund
  */
  @NotNull @Valid 
  @Schema(name = "refund", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refund")
  public RefundTypeEnum getRefund() {
    return refund;
  }

  public void setRefund(RefundTypeEnum refund) {
    this.refund = refund;
  }

  public Surcharge surchargeType(SurchargeTypeEnum surchargeType) {
    this.surchargeType = surchargeType;
    return this;
  }

  /**
   * Get surchargeType
   * @return surchargeType
  */
  @NotNull @Valid 
  @Schema(name = "surchargeType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("surchargeType")
  public SurchargeTypeEnum getSurchargeType() {
    return surchargeType;
  }

  public void setSurchargeType(SurchargeTypeEnum surchargeType) {
    this.surchargeType = surchargeType;
  }

  public Surcharge trigger(List<@Valid SpecificLanguageString> trigger) {
    this.trigger = trigger;
    return this;
  }

  public Surcharge addTriggerItem(SpecificLanguageString triggerItem) {
    if (this.trigger == null) {
      this.trigger = new ArrayList<>();
    }
    this.trigger.add(triggerItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return trigger
  */
  @Valid 
  @Schema(name = "trigger", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trigger")
  public List<@Valid SpecificLanguageString> getTrigger() {
    return trigger;
  }

  public void setTrigger(List<@Valid SpecificLanguageString> trigger) {
    this.trigger = trigger;
  }

  public Surcharge value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * the monetary amount of the surcharge
   * @return value
  */
  
  @Schema(name = "value", description = "the monetary amount of the surcharge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Surcharge surcharge = (Surcharge) o;
    return Objects.equals(this.rate, surcharge.rate) &&
        Objects.equals(this.refund, surcharge.refund) &&
        Objects.equals(this.surchargeType, surcharge.surchargeType) &&
        Objects.equals(this.trigger, surcharge.trigger) &&
        Objects.equals(this.value, surcharge.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, refund, surchargeType, trigger, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Surcharge {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    surchargeType: ").append(toIndentedString(surchargeType)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

