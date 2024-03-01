package org.npp.model.time;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.time.AccessAndEgress;
import org.npp.model.time.EntranceOpenTime;
import org.npp.model.time.ExitOpenTime;
import org.npp.model.time.Period;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Supporting model. &#x60;AccessAndEgress&#x60; variant with &#x60;Periods&#x60;
 */

@Schema(name = "AccessAndEgressPeriods", description = "Supporting model. `AccessAndEgress` variant with `Periods`")


public class AccessAndEgressPeriods extends AccessAndEgress {

  @Valid
  private List<@Valid Period> periods;

  public AccessAndEgressPeriods periods(List<@Valid Period> periods) {
    this.periods = periods;
    return this;
  }

  public AccessAndEgressPeriods addPeriodsItem(Period periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * List of periods.
   * @return periods
  */
  @Valid @Size(min = 1) 
  @Schema(name = "periods", description = "List of periods.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periods")
  public List<@Valid Period> getPeriods() {
    return periods;
  }

  public void setPeriods(List<@Valid Period> periods) {
    this.periods = periods;
  }


  public AccessAndEgressPeriods metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public AccessAndEgressPeriods exitPossibleAtAnyTime(Boolean exitPossibleAtAnyTime) {
    super.exitPossibleAtAnyTime(exitPossibleAtAnyTime);
    return this;
  }

  public AccessAndEgressPeriods entranceOpenTimeArea(List<@Valid EntranceOpenTime> entranceOpenTimeArea) {
    super.entranceOpenTimeArea(entranceOpenTimeArea);
    return this;
  }

  public AccessAndEgressPeriods addEntranceOpenTimeAreaItem(EntranceOpenTime entranceOpenTimeAreaItem) {
    super.addEntranceOpenTimeAreaItem(entranceOpenTimeAreaItem);
    return this;
  }

  public AccessAndEgressPeriods exitOpenTimeArea(List<@Valid ExitOpenTime> exitOpenTimeArea) {
    super.exitOpenTimeArea(exitOpenTimeArea);
    return this;
  }

  public AccessAndEgressPeriods addExitOpenTimeAreaItem(ExitOpenTime exitOpenTimeAreaItem) {
    super.addExitOpenTimeAreaItem(exitOpenTimeAreaItem);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessAndEgressPeriods accessAndEgressPeriods = (AccessAndEgressPeriods) o;
    return Objects.equals(this.periods, accessAndEgressPeriods.periods) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periods, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessAndEgressPeriods {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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

