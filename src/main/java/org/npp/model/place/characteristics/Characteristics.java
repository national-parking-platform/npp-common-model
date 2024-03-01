package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.enums.AccessibilityEnum;
import org.npp.model.place.enums.CoveredEnum;
import org.npp.model.place.enums.ParkingOperatingModeEnum;
import org.npp.model.place.enums.StaffEnum;
import org.npp.model.place.enums.StructureGradeEnum;
import org.npp.model.place.enums.StructureTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information concerning characteristics relating to a parking facility.
 */

@Schema(name = "Characteristics", description = "A class defining information concerning characteristics relating to a parking facility.")

public class Characteristics {

  private Boolean accessControlled;

  private CoveredEnum coveredType;

  private Boolean disabledAccess;

  @Valid
  private List<@Valid AccessibilityEnum> disabledAccessTypes;

  private Integer evChargingPoints;

  private Boolean openToPublic;

  @Valid
  private List<@Valid ParkingOperatingModeEnum> operatingModes;

  private Boolean robotic;

  private Integer spacesNonDedicated;

  private Integer spacesTotal;

  private StaffEnum staffed;

  private StructureGradeEnum structureGrade;

  private StructureTypeEnum structureType;

  public Characteristics accessControlled(Boolean accessControlled) {
    this.accessControlled = accessControlled;
    return this;
  }

  /**
   * Indicates facility has physical access control (e.g. barriers, gates) [TRUE] or no access control [FALSE]
   * @return accessControlled
  */
  
  @Schema(name = "accessControlled", description = "Indicates facility has physical access control (e.g. barriers, gates) [TRUE] or no access control [FALSE]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessControlled")
  public Boolean getAccessControlled() {
    return accessControlled;
  }

  public void setAccessControlled(Boolean accessControlled) {
    this.accessControlled = accessControlled;
  }

  public Characteristics coveredType(CoveredEnum coveredType) {
    this.coveredType = coveredType;
    return this;
  }

  /**
   * Get coveredType
   * @return coveredType
  */
  @Valid 
  @Schema(name = "coveredType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coveredType")
  public CoveredEnum getCoveredType() {
    return coveredType;
  }

  public void setCoveredType(CoveredEnum coveredType) {
    this.coveredType = coveredType;
  }

  public Characteristics disabledAccess(Boolean disabledAccess) {
    this.disabledAccess = disabledAccess;
    return this;
  }

  /**
   * If [TRUE], there is provision of facilities for disable access available.
   * @return disabledAccess
  */
  
  @Schema(name = "disabledAccess", description = "If [TRUE], there is provision of facilities for disable access available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabledAccess")
  public Boolean getDisabledAccess() {
    return disabledAccess;
  }

  public void setDisabledAccess(Boolean disabledAccess) {
    this.disabledAccess = disabledAccess;
  }

  public Characteristics disabledAccessTypes(List<@Valid AccessibilityEnum> disabledAccessTypes) {
    this.disabledAccessTypes = disabledAccessTypes;
    return this;
  }

  public Characteristics addDisabledAccessTypesItem(AccessibilityEnum disabledAccessTypesItem) {
    if (this.disabledAccessTypes == null) {
      this.disabledAccessTypes = new ArrayList<>();
    }
    this.disabledAccessTypes.add(disabledAccessTypesItem);
    return this;
  }

  /**
   * Defines the type of provision of facilities for disable access available.
   * @return disabledAccessTypes
  */
  @Valid 
  @Schema(name = "disabledAccessTypes", description = "Defines the type of provision of facilities for disable access available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabledAccessTypes")
  public List<@Valid AccessibilityEnum> getDisabledAccessTypes() {
    return disabledAccessTypes;
  }

  public void setDisabledAccessTypes(List<@Valid AccessibilityEnum> disabledAccessTypes) {
    this.disabledAccessTypes = disabledAccessTypes;
  }

  public Characteristics evChargingPoints(Integer evChargingPoints) {
    this.evChargingPoints = evChargingPoints;
    return this;
  }

  /**
   * Total number of electric vehicle charging points.
   * minimum: 0
   * @return evChargingPoints
  */
  @Min(0) 
  @Schema(name = "evChargingPoints", description = "Total number of electric vehicle charging points.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evChargingPoints")
  public Integer getEvChargingPoints() {
    return evChargingPoints;
  }

  public void setEvChargingPoints(Integer evChargingPoints) {
    this.evChargingPoints = evChargingPoints;
  }

  public Characteristics openToPublic(Boolean openToPublic) {
    this.openToPublic = openToPublic;
    return this;
  }

  /**
   * Identifies if this facility is accessible to public use [TRUE] or private use only [FALSE].
   * @return openToPublic
  */
  
  @Schema(name = "openToPublic", description = "Identifies if this facility is accessible to public use [TRUE] or private use only [FALSE].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openToPublic")
  public Boolean getOpenToPublic() {
    return openToPublic;
  }

  public void setOpenToPublic(Boolean openToPublic) {
    this.openToPublic = openToPublic;
  }

  public Characteristics operatingModes(List<@Valid ParkingOperatingModeEnum> operatingModes) {
    this.operatingModes = operatingModes;
    return this;
  }

  public Characteristics addOperatingModesItem(ParkingOperatingModeEnum operatingModesItem) {
    if (this.operatingModes == null) {
      this.operatingModes = new ArrayList<>();
    }
    this.operatingModes.add(operatingModesItem);
    return this;
  }

  /**
   * Defines the mode of parking operation in use.
   * @return operatingModes
  */
  @Valid 
  @Schema(name = "operatingModes", description = "Defines the mode of parking operation in use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingModes")
  public List<@Valid ParkingOperatingModeEnum> getOperatingModes() {
    return operatingModes;
  }

  public void setOperatingModes(List<@Valid ParkingOperatingModeEnum> operatingModes) {
    this.operatingModes = operatingModes;
  }

  public Characteristics robotic(Boolean robotic) {
    this.robotic = robotic;
    return this;
  }

  /**
   * Indicates existence of a robotic parking system - a parking structure where customer leaves vehicle at  drop off area and robots move the vehicle to parking location in structure.  Default or absence of value indicates [FALSE] = no robotic parking system.
   * @return robotic
  */
  
  @Schema(name = "robotic", description = "Indicates existence of a robotic parking system - a parking structure where customer leaves vehicle at  drop off area and robots move the vehicle to parking location in structure.  Default or absence of value indicates [FALSE] = no robotic parking system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("robotic")
  public Boolean getRobotic() {
    return robotic;
  }

  public void setRobotic(Boolean robotic) {
    this.robotic = robotic;
  }

  public Characteristics spacesNonDedicated(Integer spacesNonDedicated) {
    this.spacesNonDedicated = spacesNonDedicated;
    return this;
  }

  /**
   * Number of parking spaces that are not assigned for a particular purpose.
   * minimum: 0
   * @return spacesNonDedicated
  */
  @Min(0) 
  @Schema(name = "spacesNonDedicated", description = "Number of parking spaces that are not assigned for a particular purpose.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spacesNonDedicated")
  public Integer getSpacesNonDedicated() {
    return spacesNonDedicated;
  }

  public void setSpacesNonDedicated(Integer spacesNonDedicated) {
    this.spacesNonDedicated = spacesNonDedicated;
  }

  public Characteristics spacesTotal(Integer spacesTotal) {
    this.spacesTotal = spacesTotal;
    return this;
  }

  /**
   * Total number of parking spaces
   * minimum: 0
   * @return spacesTotal
  */
  @Min(0) 
  @Schema(name = "spacesTotal", description = "Total number of parking spaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spacesTotal")
  public Integer getSpacesTotal() {
    return spacesTotal;
  }

  public void setSpacesTotal(Integer spacesTotal) {
    this.spacesTotal = spacesTotal;
  }

  public Characteristics staffed(StaffEnum staffed) {
    this.staffed = staffed;
    return this;
  }

  /**
   * Get staffed
   * @return staffed
  */
  @Valid 
  @Schema(name = "staffed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("staffed")
  public StaffEnum getStaffed() {
    return staffed;
  }

  public void setStaffed(StaffEnum staffed) {
    this.staffed = staffed;
  }

  public Characteristics structureGrade(StructureGradeEnum structureGrade) {
    this.structureGrade = structureGrade;
    return this;
  }

  /**
   * Get structureGrade
   * @return structureGrade
  */
  @Valid 
  @Schema(name = "structureGrade", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structureGrade")
  public StructureGradeEnum getStructureGrade() {
    return structureGrade;
  }

  public void setStructureGrade(StructureGradeEnum structureGrade) {
    this.structureGrade = structureGrade;
  }

  public Characteristics structureType(StructureTypeEnum structureType) {
    this.structureType = structureType;
    return this;
  }

  /**
   * Get structureType
   * @return structureType
  */
  @Valid 
  @Schema(name = "structureType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structureType")
  public StructureTypeEnum getStructureType() {
    return structureType;
  }

  public void setStructureType(StructureTypeEnum structureType) {
    this.structureType = structureType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Characteristics characteristics = (Characteristics) o;
    return Objects.equals(this.accessControlled, characteristics.accessControlled) &&
        Objects.equals(this.coveredType, characteristics.coveredType) &&
        Objects.equals(this.disabledAccess, characteristics.disabledAccess) &&
        Objects.equals(this.disabledAccessTypes, characteristics.disabledAccessTypes) &&
        Objects.equals(this.evChargingPoints, characteristics.evChargingPoints) &&
        Objects.equals(this.openToPublic, characteristics.openToPublic) &&
        Objects.equals(this.operatingModes, characteristics.operatingModes) &&
        Objects.equals(this.robotic, characteristics.robotic) &&
        Objects.equals(this.spacesNonDedicated, characteristics.spacesNonDedicated) &&
        Objects.equals(this.spacesTotal, characteristics.spacesTotal) &&
        Objects.equals(this.staffed, characteristics.staffed) &&
        Objects.equals(this.structureGrade, characteristics.structureGrade) &&
        Objects.equals(this.structureType, characteristics.structureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlled, coveredType, disabledAccess, disabledAccessTypes, evChargingPoints, openToPublic, operatingModes, robotic, spacesNonDedicated, spacesTotal, staffed, structureGrade, structureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Characteristics {\n");
    sb.append("    accessControlled: ").append(toIndentedString(accessControlled)).append("\n");
    sb.append("    coveredType: ").append(toIndentedString(coveredType)).append("\n");
    sb.append("    disabledAccess: ").append(toIndentedString(disabledAccess)).append("\n");
    sb.append("    disabledAccessTypes: ").append(toIndentedString(disabledAccessTypes)).append("\n");
    sb.append("    evChargingPoints: ").append(toIndentedString(evChargingPoints)).append("\n");
    sb.append("    openToPublic: ").append(toIndentedString(openToPublic)).append("\n");
    sb.append("    operatingModes: ").append(toIndentedString(operatingModes)).append("\n");
    sb.append("    robotic: ").append(toIndentedString(robotic)).append("\n");
    sb.append("    spacesNonDedicated: ").append(toIndentedString(spacesNonDedicated)).append("\n");
    sb.append("    spacesTotal: ").append(toIndentedString(spacesTotal)).append("\n");
    sb.append("    staffed: ").append(toIndentedString(staffed)).append("\n");
    sb.append("    structureGrade: ").append(toIndentedString(structureGrade)).append("\n");
    sb.append("    structureType: ").append(toIndentedString(structureType)).append("\n");
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

