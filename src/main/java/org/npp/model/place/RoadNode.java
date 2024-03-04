package org.npp.model.place;
  
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
import org.npp.model.place.characteristics.LinearDimension;
import org.npp.model.place.Road;
import org.npp.model.place.enums.RoadTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A road node as part of the specialised road identified by the name of a junction on this road.
 */

@Schema(name = "RoadNode", description = "A road node as part of the specialised road identified by the name of a junction on this road.")


public class RoadNode extends Road {

  @Valid
  private List<@Valid SpecificLanguageString> junctionName = new ArrayList<>();

  public RoadNode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RoadNode(List<@Valid SpecificLanguageString> junctionName) {
    super();
    this.junctionName = junctionName;
  }

  public RoadNode junctionName(List<@Valid SpecificLanguageString> junctionName) {
    this.junctionName = junctionName;
    return this;
  }

  public RoadNode addJunctionNameItem(SpecificLanguageString junctionNameItem) {
    if (this.junctionName == null) {
      this.junctionName = new ArrayList<>();
    }
    this.junctionName.add(junctionNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return junctionName
  */
  @NotNull @Valid 
  @Schema(name = "junctionName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("junctionName")
  public List<@Valid SpecificLanguageString> getJunctionName() {
    return junctionName;
  }

  public void setJunctionName(List<@Valid SpecificLanguageString> junctionName) {
    this.junctionName = junctionName;
  }


  public RoadNode roadType(RoadTypeEnum roadType) {
    super.roadType(roadType);
    return this;
  }

  public RoadNode distanceToThisRoad(LinearDimension distanceToThisRoad) {
    super.distanceToThisRoad(distanceToThisRoad);
    return this;
  }

  public RoadNode nameOfRoad(List<@Valid SpecificLanguageString> nameOfRoad) {
    super.nameOfRoad(nameOfRoad);
    return this;
  }

  public RoadNode addNameOfRoadItem(SpecificLanguageString nameOfRoadItem) {
    super.addNameOfRoadItem(nameOfRoadItem);
    return this;
  }

  public RoadNode roadDestination(List<@Valid List<@Valid SpecificLanguageString>> roadDestination) {
    super.roadDestination(roadDestination);
    return this;
  }

  public RoadNode addRoadDestinationItem(List<@Valid SpecificLanguageString> roadDestinationItem) {
    super.addRoadDestinationItem(roadDestinationItem);
    return this;
  }

  public RoadNode roadIdentifier(List<@Valid SpecificLanguageString> roadIdentifier) {
    super.roadIdentifier(roadIdentifier);
    return this;
  }

  public RoadNode addRoadIdentifierItem(SpecificLanguageString roadIdentifierItem) {
    super.addRoadIdentifierItem(roadIdentifierItem);
    return this;
  }

  public RoadNode roadOrigination(List<@Valid List<@Valid SpecificLanguageString>> roadOrigination) {
    super.roadOrigination(roadOrigination);
    return this;
  }

  public RoadNode addRoadOriginationItem(List<@Valid SpecificLanguageString> roadOriginationItem) {
    super.addRoadOriginationItem(roadOriginationItem);
    return this;
  }

  public RoadNode typeOfRoad(RoadTypeEnum typeOfRoad) {
    super.typeOfRoad(typeOfRoad);
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
    RoadNode roadNode = (RoadNode) o;
    return Objects.equals(this.junctionName, roadNode.junctionName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junctionName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadNode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    junctionName: ").append(toIndentedString(junctionName)).append("\n");
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

