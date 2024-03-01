package org.npp.model.eligibility;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.npp.model.eligibility.AssignRightTime;
import org.npp.model.vehicle.Emissions;
import org.npp.model.eligibility.enums.FuelTypeEnum;
import org.npp.model.vehicle.GrossWeightCharacteristic;
import org.npp.model.vehicle.HeightCharacteristic;
import org.npp.model.vehicle.LengthCharacteristic;
import org.npp.model.eligibility.LinkedRightSpecification;
import org.npp.model.payment.PaymentMethod;
import org.npp.model.common.Reference;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.eligibility.UserQualification;
import org.npp.model.vehicle.VehicleLoad;
import org.npp.model.vehicle.VehicleType;
import org.npp.model.vehicle.WidthCharacteristic;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A singular set of criteria used to test eligibility for use of a rate table.
 */

@Schema(name = "Qualification", description = "A singular set of criteria used to test eligibility for use of a rate table.")

public class Qualification {

  private Reference activeAssignedRight;

  @Valid
  private List<@Valid FuelTypeEnum> propulsionEnergyType;

  private Boolean memberOfOtherRateTable;

  @Valid
  private List<@Valid List<@Valid SpecificLanguageString>> membershipNames;

  @Valid
  private List<String> rateTableMember;

  private Boolean withMembership;

  private Boolean withReservation;

  @Valid
  private List<@Valid PaymentMethod> paymentMethod;

  private Emissions emissions;

  @Valid
  private Set<@Valid AssignRightTime> assignRightTimes;

  @Valid
  private Set<@Valid GrossWeightCharacteristic> grossWeightCharacteristics;

  @Valid
  private Set<@Valid HeightCharacteristic> heightCharacteristics;

  @Valid
  private Set<@Valid LengthCharacteristic> lengthCharacteristics;

  @Valid
  private Set<@Valid WidthCharacteristic> widthCharacteristics;

  @Valid
  private List<@Valid VehicleLoad> vehicleLoads;

  @Valid
  private List<@Valid UserQualification> userQualifications;

  private Boolean freeToPark;

  @Valid
  private List<@Valid VehicleType> vehicleTypes;

  private LinkedRightSpecification linkedRightSpecification;

  public Qualification activeAssignedRight(Reference activeAssignedRight) {
    this.activeAssignedRight = activeAssignedRight;
    return this;
  }

  /**
   * Get activeAssignedRight
   * @return activeAssignedRight
  */
  @Valid 
  @Schema(name = "activeAssignedRight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeAssignedRight")
  public Reference getActiveAssignedRight() {
    return activeAssignedRight;
  }

  public void setActiveAssignedRight(Reference activeAssignedRight) {
    this.activeAssignedRight = activeAssignedRight;
  }

  public Qualification propulsionEnergyType(List<@Valid FuelTypeEnum> propulsionEnergyType) {
    this.propulsionEnergyType = propulsionEnergyType;
    return this;
  }

  public Qualification addPropulsionEnergyTypeItem(FuelTypeEnum propulsionEnergyTypeItem) {
    if (this.propulsionEnergyType == null) {
      this.propulsionEnergyType = new ArrayList<>();
    }
    this.propulsionEnergyType.add(propulsionEnergyTypeItem);
    return this;
  }

  /**
   * Indicates eligible fuel types for applicable  vehicles
   * @return propulsionEnergyType
  */
  @Valid 
  @Schema(name = "propulsionEnergyType", description = "Indicates eligible fuel types for applicable  vehicles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("propulsionEnergyType")
  public List<@Valid FuelTypeEnum> getPropulsionEnergyType() {
    return propulsionEnergyType;
  }

  public void setPropulsionEnergyType(List<@Valid FuelTypeEnum> propulsionEnergyType) {
    this.propulsionEnergyType = propulsionEnergyType;
  }

  public Qualification memberOfOtherRateTable(Boolean memberOfOtherRateTable) {
    this.memberOfOtherRateTable = memberOfOtherRateTable;
    return this;
  }

  /**
   * Indicates if this qualification can be used in  combination with the use of another rate table.  [TRUE] = member of (i.e., used) another rate table.
   * @return memberOfOtherRateTable
  */
  
  @Schema(name = "memberOfOtherRateTable", description = "Indicates if this qualification can be used in  combination with the use of another rate table.  [TRUE] = member of (i.e., used) another rate table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberOfOtherRateTable")
  public Boolean getMemberOfOtherRateTable() {
    return memberOfOtherRateTable;
  }

  public void setMemberOfOtherRateTable(Boolean memberOfOtherRateTable) {
    this.memberOfOtherRateTable = memberOfOtherRateTable;
  }

  public Qualification membershipNames(List<@Valid List<@Valid SpecificLanguageString>> membershipNames) {
    this.membershipNames = membershipNames;
    return this;
  }

  public Qualification addMembershipNamesItem(List<@Valid SpecificLanguageString> membershipNamesItem) {
    if (this.membershipNames == null) {
      this.membershipNames = new ArrayList<>();
    }
    this.membershipNames.add(membershipNamesItem);
    return this;
  }

  /**
   * Free-text description of the membership
   * @return membershipNames
  */
  @Valid 
  @Schema(name = "membershipNames", description = "Free-text description of the membership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("membershipNames")
  public List<@Valid List<@Valid SpecificLanguageString>> getMembershipNames() {
    return membershipNames;
  }

  public void setMembershipNames(List<@Valid List<@Valid SpecificLanguageString>> membershipNames) {
    this.membershipNames = membershipNames;
  }

  public Qualification rateTableMember(List<String> rateTableMember) {
    this.rateTableMember = rateTableMember;
    return this;
  }

  public Qualification addRateTableMemberItem(String rateTableMemberItem) {
    if (this.rateTableMember == null) {
      this.rateTableMember = new ArrayList<>();
    }
    this.rateTableMember.add(rateTableMemberItem);
    return this;
  }

  /**
   * Free-text description of other rate table membership
   * @return rateTableMember
  */
  
  @Schema(name = "rateTableMember", description = "Free-text description of other rate table membership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateTableMember")
  public List<String> getRateTableMember() {
    return rateTableMember;
  }

  public void setRateTableMember(List<String> rateTableMember) {
    this.rateTableMember = rateTableMember;
  }

  public Qualification withMembership(Boolean withMembership) {
    this.withMembership = withMembership;
    return this;
  }

  /**
   * Indicates that a membership is required. [TRUE] membership required
   * @return withMembership
  */
  
  @Schema(name = "withMembership", description = "Indicates that a membership is required. [TRUE] membership required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withMembership")
  public Boolean getWithMembership() {
    return withMembership;
  }

  public void setWithMembership(Boolean withMembership) {
    this.withMembership = withMembership;
  }

  public Qualification withReservation(Boolean withReservation) {
    this.withReservation = withReservation;
    return this;
  }

  /**
   * Indicates whether a reservation is required. [TRUE] reservation required
   * @return withReservation
  */
  
  @Schema(name = "withReservation", description = "Indicates whether a reservation is required. [TRUE] reservation required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withReservation")
  public Boolean getWithReservation() {
    return withReservation;
  }

  public void setWithReservation(Boolean withReservation) {
    this.withReservation = withReservation;
  }

  public Qualification paymentMethod(List<@Valid PaymentMethod> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public Qualification addPaymentMethodItem(PaymentMethod paymentMethodItem) {
    if (this.paymentMethod == null) {
      this.paymentMethod = new ArrayList<>();
    }
    this.paymentMethod.add(paymentMethodItem);
    return this;
  }

  /**
   * Qualifying payment methods
   * @return paymentMethod
  */
  @Valid 
  @Schema(name = "paymentMethod", description = "Qualifying payment methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethod")
  public List<@Valid PaymentMethod> getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(List<@Valid PaymentMethod> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Qualification emissions(Emissions emissions) {
    this.emissions = emissions;
    return this;
  }

  /**
   * Get emissions
   * @return emissions
  */
  @Valid 
  @Schema(name = "emissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emissions")
  public Emissions getEmissions() {
    return emissions;
  }

  public void setEmissions(Emissions emissions) {
    this.emissions = emissions;
  }

  public Qualification assignRightTimes(Set<@Valid AssignRightTime> assignRightTimes) {
    this.assignRightTimes = assignRightTimes;
    return this;
  }

  public Qualification addAssignRightTimesItem(AssignRightTime assignRightTimesItem) {
    if (this.assignRightTimes == null) {
      this.assignRightTimes = new LinkedHashSet<>();
    }
    this.assignRightTimes.add(assignRightTimesItem);
    return this;
  }

  /**
   * Qualify based on min/max time duration from a right being assigned
   * @return assignRightTimes
  */
  @Valid @Size(max = 2) 
  @Schema(name = "assignRightTimes", description = "Qualify based on min/max time duration from a right being assigned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignRightTimes")
  public Set<@Valid AssignRightTime> getAssignRightTimes() {
    return assignRightTimes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAssignRightTimes(Set<@Valid AssignRightTime> assignRightTimes) {
    this.assignRightTimes = assignRightTimes;
  }

  public Qualification grossWeightCharacteristics(Set<@Valid GrossWeightCharacteristic> grossWeightCharacteristics) {
    this.grossWeightCharacteristics = grossWeightCharacteristics;
    return this;
  }

  public Qualification addGrossWeightCharacteristicsItem(GrossWeightCharacteristic grossWeightCharacteristicsItem) {
    if (this.grossWeightCharacteristics == null) {
      this.grossWeightCharacteristics = new LinkedHashSet<>();
    }
    this.grossWeightCharacteristics.add(grossWeightCharacteristicsItem);
    return this;
  }

  /**
   * Qualify based on the vehicle's min/max gross weight characteristics
   * @return grossWeightCharacteristics
  */
  @Valid @Size(max = 2) 
  @Schema(name = "grossWeightCharacteristics", description = "Qualify based on the vehicle's min/max gross weight characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grossWeightCharacteristics")
  public Set<@Valid GrossWeightCharacteristic> getGrossWeightCharacteristics() {
    return grossWeightCharacteristics;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setGrossWeightCharacteristics(Set<@Valid GrossWeightCharacteristic> grossWeightCharacteristics) {
    this.grossWeightCharacteristics = grossWeightCharacteristics;
  }

  public Qualification heightCharacteristics(Set<@Valid HeightCharacteristic> heightCharacteristics) {
    this.heightCharacteristics = heightCharacteristics;
    return this;
  }

  public Qualification addHeightCharacteristicsItem(HeightCharacteristic heightCharacteristicsItem) {
    if (this.heightCharacteristics == null) {
      this.heightCharacteristics = new LinkedHashSet<>();
    }
    this.heightCharacteristics.add(heightCharacteristicsItem);
    return this;
  }

  /**
   * Qualify based on the vehicle's min/max height characteristics
   * @return heightCharacteristics
  */
  @Valid @Size(max = 2) 
  @Schema(name = "heightCharacteristics", description = "Qualify based on the vehicle's min/max height characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heightCharacteristics")
  public Set<@Valid HeightCharacteristic> getHeightCharacteristics() {
    return heightCharacteristics;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setHeightCharacteristics(Set<@Valid HeightCharacteristic> heightCharacteristics) {
    this.heightCharacteristics = heightCharacteristics;
  }

  public Qualification lengthCharacteristics(Set<@Valid LengthCharacteristic> lengthCharacteristics) {
    this.lengthCharacteristics = lengthCharacteristics;
    return this;
  }

  public Qualification addLengthCharacteristicsItem(LengthCharacteristic lengthCharacteristicsItem) {
    if (this.lengthCharacteristics == null) {
      this.lengthCharacteristics = new LinkedHashSet<>();
    }
    this.lengthCharacteristics.add(lengthCharacteristicsItem);
    return this;
  }

  /**
   * Qualify based on the vehicle's min/max gross length characteristics
   * @return lengthCharacteristics
  */
  @Valid @Size(max = 2) 
  @Schema(name = "lengthCharacteristics", description = "Qualify based on the vehicle's min/max gross length characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lengthCharacteristics")
  public Set<@Valid LengthCharacteristic> getLengthCharacteristics() {
    return lengthCharacteristics;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setLengthCharacteristics(Set<@Valid LengthCharacteristic> lengthCharacteristics) {
    this.lengthCharacteristics = lengthCharacteristics;
  }

  public Qualification widthCharacteristics(Set<@Valid WidthCharacteristic> widthCharacteristics) {
    this.widthCharacteristics = widthCharacteristics;
    return this;
  }

  public Qualification addWidthCharacteristicsItem(WidthCharacteristic widthCharacteristicsItem) {
    if (this.widthCharacteristics == null) {
      this.widthCharacteristics = new LinkedHashSet<>();
    }
    this.widthCharacteristics.add(widthCharacteristicsItem);
    return this;
  }

  /**
   * Qualify based on the vehicle's min/max gross width characteristics
   * @return widthCharacteristics
  */
  @Valid @Size(max = 2) 
  @Schema(name = "widthCharacteristics", description = "Qualify based on the vehicle's min/max gross width characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("widthCharacteristics")
  public Set<@Valid WidthCharacteristic> getWidthCharacteristics() {
    return widthCharacteristics;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setWidthCharacteristics(Set<@Valid WidthCharacteristic> widthCharacteristics) {
    this.widthCharacteristics = widthCharacteristics;
  }

  public Qualification vehicleLoads(List<@Valid VehicleLoad> vehicleLoads) {
    this.vehicleLoads = vehicleLoads;
    return this;
  }

  public Qualification addVehicleLoadsItem(VehicleLoad vehicleLoadsItem) {
    if (this.vehicleLoads == null) {
      this.vehicleLoads = new ArrayList<>();
    }
    this.vehicleLoads.add(vehicleLoadsItem);
    return this;
  }

  /**
   * The types of load carried by the vehicle
   * @return vehicleLoads
  */
  @Valid 
  @Schema(name = "vehicleLoads", description = "The types of load carried by the vehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleLoads")
  public List<@Valid VehicleLoad> getVehicleLoads() {
    return vehicleLoads;
  }

  public void setVehicleLoads(List<@Valid VehicleLoad> vehicleLoads) {
    this.vehicleLoads = vehicleLoads;
  }

  public Qualification userQualifications(List<@Valid UserQualification> userQualifications) {
    this.userQualifications = userQualifications;
    return this;
  }

  public Qualification addUserQualificationsItem(UserQualification userQualificationsItem) {
    if (this.userQualifications == null) {
      this.userQualifications = new ArrayList<>();
    }
    this.userQualifications.add(userQualificationsItem);
    return this;
  }

  /**
   * User-defined user groups qualification
   * @return userQualifications
  */
  @Valid 
  @Schema(name = "userQualifications", description = "User-defined user groups qualification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userQualifications")
  public List<@Valid UserQualification> getUserQualifications() {
    return userQualifications;
  }

  public void setUserQualifications(List<@Valid UserQualification> userQualifications) {
    this.userQualifications = userQualifications;
  }

  public Qualification freeToPark(Boolean freeToPark) {
    this.freeToPark = freeToPark;
    return this;
  }

  /**
   * specific parking is free or not. [TRUE] = free to park
   * @return freeToPark
  */
  
  @Schema(name = "freeToPark", description = "specific parking is free or not. [TRUE] = free to park", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freeToPark")
  public Boolean getFreeToPark() {
    return freeToPark;
  }

  public void setFreeToPark(Boolean freeToPark) {
    this.freeToPark = freeToPark;
  }

  public Qualification vehicleTypes(List<@Valid VehicleType> vehicleTypes) {
    this.vehicleTypes = vehicleTypes;
    return this;
  }

  public Qualification addVehicleTypesItem(VehicleType vehicleTypesItem) {
    if (this.vehicleTypes == null) {
      this.vehicleTypes = new ArrayList<>();
    }
    this.vehicleTypes.add(vehicleTypesItem);
    return this;
  }

  /**
   * The types of vehicles that qualify 
   * @return vehicleTypes
  */
  @Valid 
  @Schema(name = "vehicleTypes", description = "The types of vehicles that qualify ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleTypes")
  public List<@Valid VehicleType> getVehicleTypes() {
    return vehicleTypes;
  }

  public void setVehicleTypes(List<@Valid VehicleType> vehicleTypes) {
    this.vehicleTypes = vehicleTypes;
  }

  public Qualification linkedRightSpecification(LinkedRightSpecification linkedRightSpecification) {
    this.linkedRightSpecification = linkedRightSpecification;
    return this;
  }

  /**
   * Get linkedRightSpecification
   * @return linkedRightSpecification
  */
  @Valid 
  @Schema(name = "linkedRightSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkedRightSpecification")
  public LinkedRightSpecification getLinkedRightSpecification() {
    return linkedRightSpecification;
  }

  public void setLinkedRightSpecification(LinkedRightSpecification linkedRightSpecification) {
    this.linkedRightSpecification = linkedRightSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qualification qualification = (Qualification) o;
    return Objects.equals(this.activeAssignedRight, qualification.activeAssignedRight) &&
        Objects.equals(this.propulsionEnergyType, qualification.propulsionEnergyType) &&
        Objects.equals(this.memberOfOtherRateTable, qualification.memberOfOtherRateTable) &&
        Objects.equals(this.membershipNames, qualification.membershipNames) &&
        Objects.equals(this.rateTableMember, qualification.rateTableMember) &&
        Objects.equals(this.withMembership, qualification.withMembership) &&
        Objects.equals(this.withReservation, qualification.withReservation) &&
        Objects.equals(this.paymentMethod, qualification.paymentMethod) &&
        Objects.equals(this.emissions, qualification.emissions) &&
        Objects.equals(this.assignRightTimes, qualification.assignRightTimes) &&
        Objects.equals(this.grossWeightCharacteristics, qualification.grossWeightCharacteristics) &&
        Objects.equals(this.heightCharacteristics, qualification.heightCharacteristics) &&
        Objects.equals(this.lengthCharacteristics, qualification.lengthCharacteristics) &&
        Objects.equals(this.widthCharacteristics, qualification.widthCharacteristics) &&
        Objects.equals(this.vehicleLoads, qualification.vehicleLoads) &&
        Objects.equals(this.userQualifications, qualification.userQualifications) &&
        Objects.equals(this.freeToPark, qualification.freeToPark) &&
        Objects.equals(this.vehicleTypes, qualification.vehicleTypes) &&
        Objects.equals(this.linkedRightSpecification, qualification.linkedRightSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeAssignedRight, propulsionEnergyType, memberOfOtherRateTable, membershipNames, rateTableMember, withMembership, withReservation, paymentMethod, emissions, assignRightTimes, grossWeightCharacteristics, heightCharacteristics, lengthCharacteristics, widthCharacteristics, vehicleLoads, userQualifications, freeToPark, vehicleTypes, linkedRightSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualification {\n");
    sb.append("    activeAssignedRight: ").append(toIndentedString(activeAssignedRight)).append("\n");
    sb.append("    propulsionEnergyType: ").append(toIndentedString(propulsionEnergyType)).append("\n");
    sb.append("    memberOfOtherRateTable: ").append(toIndentedString(memberOfOtherRateTable)).append("\n");
    sb.append("    membershipNames: ").append(toIndentedString(membershipNames)).append("\n");
    sb.append("    rateTableMember: ").append(toIndentedString(rateTableMember)).append("\n");
    sb.append("    withMembership: ").append(toIndentedString(withMembership)).append("\n");
    sb.append("    withReservation: ").append(toIndentedString(withReservation)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    emissions: ").append(toIndentedString(emissions)).append("\n");
    sb.append("    assignRightTimes: ").append(toIndentedString(assignRightTimes)).append("\n");
    sb.append("    grossWeightCharacteristics: ").append(toIndentedString(grossWeightCharacteristics)).append("\n");
    sb.append("    heightCharacteristics: ").append(toIndentedString(heightCharacteristics)).append("\n");
    sb.append("    lengthCharacteristics: ").append(toIndentedString(lengthCharacteristics)).append("\n");
    sb.append("    widthCharacteristics: ").append(toIndentedString(widthCharacteristics)).append("\n");
    sb.append("    vehicleLoads: ").append(toIndentedString(vehicleLoads)).append("\n");
    sb.append("    userQualifications: ").append(toIndentedString(userQualifications)).append("\n");
    sb.append("    freeToPark: ").append(toIndentedString(freeToPark)).append("\n");
    sb.append("    vehicleTypes: ").append(toIndentedString(vehicleTypes)).append("\n");
    sb.append("    linkedRightSpecification: ").append(toIndentedString(linkedRightSpecification)).append("\n");
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

