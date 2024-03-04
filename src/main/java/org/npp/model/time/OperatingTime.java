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
import org.npp.model.time.Period;
import org.npp.model.time.PeriodsOrValidity;
import org.npp.model.time.Validity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * The times of operation of a parking facility - this is the time that the facility operates, not times of accessibility.
 */

@Schema(name = "OperatingTime", description = "The times of operation of a parking facility - this is the time that the facility operates, not times of accessibility.")


public class OperatingTime extends PeriodsOrValidity {


  public OperatingTime metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public OperatingTime periods(List<@Valid Period> periods) {
    super.periods(periods);
    return this;
  }

  public OperatingTime addPeriodsItem(Period periodsItem) {
    super.addPeriodsItem(periodsItem);
    return this;
  }

  public OperatingTime validity(Validity validity) {
    super.validity(validity);
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingTime {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

