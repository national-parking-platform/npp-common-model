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
 * Specification of periods of times when parking exit(s) are open for vehicle movements.
 */

@Schema(name = "ExitOpenTime", description = "Specification of periods of times when parking exit(s) are open for vehicle movements.")


public class ExitOpenTime extends PeriodsOrValidity {


  public ExitOpenTime metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public ExitOpenTime periods(List<@Valid Period> periods) {
    super.periods(periods);
    return this;
  }

  public ExitOpenTime addPeriodsItem(Period periodsItem) {
    super.addPeriodsItem(periodsItem);
    return this;
  }

  public ExitOpenTime validity(Validity validity) {
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
    sb.append("class ExitOpenTime {\n");
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

