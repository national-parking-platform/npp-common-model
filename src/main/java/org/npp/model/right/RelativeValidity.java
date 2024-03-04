package org.npp.model.right;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.npp.model.time.Period;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A specific calendar can be defined to represent the number of &#x60;AssignedRights&#x60; available for distribution in  a specific recurring time period via &#x60;RelativeValidity&#x60;.
 */

@Schema(name = "RelativeValidity", description = "A specific calendar can be defined to represent the number of `AssignedRights` available for distribution in  a specific recurring time period via `RelativeValidity`.")

public class RelativeValidity {

  private Period period;

  public RelativeValidity period(Period period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @Valid 
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeValidity relativeValidity = (RelativeValidity) o;
    return Objects.equals(this.period, relativeValidity.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeValidity {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

