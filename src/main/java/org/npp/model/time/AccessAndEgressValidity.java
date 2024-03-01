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
import org.npp.model.time.Validity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Supporting model. &#x60;AccessAndEgress&#x60; variant with &#x60;Validity&#x60;
 */

@Schema(name = "AccessAndEgressValidity", description = "Supporting model. `AccessAndEgress` variant with `Validity`")


public class AccessAndEgressValidity extends AccessAndEgress {

  private Validity validity;

  public AccessAndEgressValidity validity(Validity validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
  */
  @Valid 
  @Schema(name = "validity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validity")
  public Validity getValidity() {
    return validity;
  }

  public void setValidity(Validity validity) {
    this.validity = validity;
  }


  public AccessAndEgressValidity metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public AccessAndEgressValidity exitPossibleAtAnyTime(Boolean exitPossibleAtAnyTime) {
    super.exitPossibleAtAnyTime(exitPossibleAtAnyTime);
    return this;
  }

  public AccessAndEgressValidity entranceOpenTimeArea(List<@Valid EntranceOpenTime> entranceOpenTimeArea) {
    super.entranceOpenTimeArea(entranceOpenTimeArea);
    return this;
  }

  public AccessAndEgressValidity addEntranceOpenTimeAreaItem(EntranceOpenTime entranceOpenTimeAreaItem) {
    super.addEntranceOpenTimeAreaItem(entranceOpenTimeAreaItem);
    return this;
  }

  public AccessAndEgressValidity exitOpenTimeArea(List<@Valid ExitOpenTime> exitOpenTimeArea) {
    super.exitOpenTimeArea(exitOpenTimeArea);
    return this;
  }

  public AccessAndEgressValidity addExitOpenTimeAreaItem(ExitOpenTime exitOpenTimeAreaItem) {
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
    AccessAndEgressValidity accessAndEgressValidity = (AccessAndEgressValidity) o;
    return Objects.equals(this.validity, accessAndEgressValidity.validity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessAndEgressValidity {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

