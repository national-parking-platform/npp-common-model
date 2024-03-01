package org.npp.model.rate;
  
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
 * Class containing details of tax to be applied to a RateLine.
 */

@Schema(name = "RateLineTax", description = "Class containing details of tax to be applied to a RateLine.")

public class RateLineTax {

  @Valid
  private List<@Valid SpecificLanguageString> labelForDisplay;

  private Boolean taxIncluded;

  private Float taxRate;

  private Float taxValue;

  @Valid
  private List<@Valid SpecificLanguageString> trigger;

  public RateLineTax() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateLineTax(Boolean taxIncluded) {
    this.taxIncluded = taxIncluded;
  }

  public RateLineTax labelForDisplay(List<@Valid SpecificLanguageString> labelForDisplay) {
    this.labelForDisplay = labelForDisplay;
    return this;
  }

  public RateLineTax addLabelForDisplayItem(SpecificLanguageString labelForDisplayItem) {
    if (this.labelForDisplay == null) {
      this.labelForDisplay = new ArrayList<>();
    }
    this.labelForDisplay.add(labelForDisplayItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return labelForDisplay
  */
  @Valid 
  @Schema(name = "labelForDisplay", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("labelForDisplay")
  public List<@Valid SpecificLanguageString> getLabelForDisplay() {
    return labelForDisplay;
  }

  public void setLabelForDisplay(List<@Valid SpecificLanguageString> labelForDisplay) {
    this.labelForDisplay = labelForDisplay;
  }

  public RateLineTax taxIncluded(Boolean taxIncluded) {
    this.taxIncluded = taxIncluded;
    return this;
  }

  /**
   * [TRUE] Indication that tax to be applied is included within the total rate associated with this rate line.  [FALSE] indicates that the tax is added additionally to the total.
   * @return taxIncluded
  */
  @NotNull 
  @Schema(name = "taxIncluded", description = "[TRUE] Indication that tax to be applied is included within the total rate associated with this rate line.  [FALSE] indicates that the tax is added additionally to the total.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxIncluded")
  public Boolean getTaxIncluded() {
    return taxIncluded;
  }

  public void setTaxIncluded(Boolean taxIncluded) {
    this.taxIncluded = taxIncluded;
  }

  public RateLineTax taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * The percentage rate of tax to be applied.
   * minimum: 0
   * maximum: 100
   * @return taxRate
  */
  @DecimalMin("0") @DecimalMax("100") 
  @Schema(name = "taxRate", description = "The percentage rate of tax to be applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxRate")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public RateLineTax taxValue(Float taxValue) {
    this.taxValue = taxValue;
    return this;
  }

  /**
   * The monetary amount of tax to be applied.
   * @return taxValue
  */
  
  @Schema(name = "taxValue", description = "The monetary amount of tax to be applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxValue")
  public Float getTaxValue() {
    return taxValue;
  }

  public void setTaxValue(Float taxValue) {
    this.taxValue = taxValue;
  }

  public RateLineTax trigger(List<@Valid SpecificLanguageString> trigger) {
    this.trigger = trigger;
    return this;
  }

  public RateLineTax addTriggerItem(SpecificLanguageString triggerItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLineTax rateLineTax = (RateLineTax) o;
    return Objects.equals(this.labelForDisplay, rateLineTax.labelForDisplay) &&
        Objects.equals(this.taxIncluded, rateLineTax.taxIncluded) &&
        Objects.equals(this.taxRate, rateLineTax.taxRate) &&
        Objects.equals(this.taxValue, rateLineTax.taxValue) &&
        Objects.equals(this.trigger, rateLineTax.trigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelForDisplay, taxIncluded, taxRate, taxValue, trigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLineTax {\n");
    sb.append("    labelForDisplay: ").append(toIndentedString(labelForDisplay)).append("\n");
    sb.append("    taxIncluded: ").append(toIndentedString(taxIncluded)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxValue: ").append(toIndentedString(taxValue)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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

