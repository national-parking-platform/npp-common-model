package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.enums.AuthenticationAndIdentificationEnum;
import org.npp.model.place.enums.ChargingPointUsageTypeEnum;
import org.npp.model.place.characteristics.Connector;
import org.npp.model.place.enums.DeliveryUnitEnum;
import org.npp.model.place.characteristics.RefillPoint;
import org.npp.model.place.enums.ReservationTypeEnum;
import org.npp.model.place.enums.ServiceTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.npp.model.place.enums.VehicleToGridCommunicationTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A charging point for electric vehicles (EV).
 */

@Schema(name = "ElectricChargingPoint", description = "A charging point for electric vehicles (EV).")


public class ElectricChargingPoint extends RefillPoint {

  @Valid
  private List<@Valid BigDecimal> availableChargingPower;

  private String externalIdentifier;

  @Valid
  private List<@Valid ChargingPointUsageTypeEnum> usageType;

  @Valid
  private List<@Valid VehicleToGridCommunicationTypeEnum> vehicleToGridCommunicationType;

  @Valid
  private List<@Valid BigDecimal> availableVoltage;

  @Valid
  private List<@Valid Connector> connectors = new ArrayList<>();

  public ElectricChargingPoint() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ElectricChargingPoint(List<@Valid Connector> connectors, Integer refillPointIndex) {
    super(refillPointIndex);
    this.connectors = connectors;
  }

  public ElectricChargingPoint availableChargingPower(List<@Valid BigDecimal> availableChargingPower) {
    this.availableChargingPower = availableChargingPower;
    return this;
  }

  public ElectricChargingPoint addAvailableChargingPowerItem(BigDecimal availableChargingPowerItem) {
    if (this.availableChargingPower == null) {
      this.availableChargingPower = new ArrayList<>();
    }
    this.availableChargingPower.add(availableChargingPowerItem);
    return this;
  }

  /**
   * Possible degrees of charging power in Watts.
   * @return availableChargingPower
  */
  @Valid 
  @Schema(name = "availableChargingPower", description = "Possible degrees of charging power in Watts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableChargingPower")
  public List<@Valid BigDecimal> getAvailableChargingPower() {
    return availableChargingPower;
  }

  public void setAvailableChargingPower(List<@Valid BigDecimal> availableChargingPower) {
    this.availableChargingPower = availableChargingPower;
  }

  public ElectricChargingPoint externalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  /**
   * A unique string to identify the charging point.
   * @return externalIdentifier
  */
  
  @Schema(name = "externalIdentifier", description = "A unique string to identify the charging point.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifier")
  public String getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(String externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public ElectricChargingPoint usageType(List<@Valid ChargingPointUsageTypeEnum> usageType) {
    this.usageType = usageType;
    return this;
  }

  public ElectricChargingPoint addUsageTypeItem(ChargingPointUsageTypeEnum usageTypeItem) {
    if (this.usageType == null) {
      this.usageType = new ArrayList<>();
    }
    this.usageType.add(usageTypeItem);
    return this;
  }

  /**
   * Usage type of the electric charging point.
   * @return usageType
  */
  @Valid 
  @Schema(name = "usageType", description = "Usage type of the electric charging point.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageType")
  public List<@Valid ChargingPointUsageTypeEnum> getUsageType() {
    return usageType;
  }

  public void setUsageType(List<@Valid ChargingPointUsageTypeEnum> usageType) {
    this.usageType = usageType;
  }

  public ElectricChargingPoint vehicleToGridCommunicationType(List<@Valid VehicleToGridCommunicationTypeEnum> vehicleToGridCommunicationType) {
    this.vehicleToGridCommunicationType = vehicleToGridCommunicationType;
    return this;
  }

  public ElectricChargingPoint addVehicleToGridCommunicationTypeItem(VehicleToGridCommunicationTypeEnum vehicleToGridCommunicationTypeItem) {
    if (this.vehicleToGridCommunicationType == null) {
      this.vehicleToGridCommunicationType = new ArrayList<>();
    }
    this.vehicleToGridCommunicationType.add(vehicleToGridCommunicationTypeItem);
    return this;
  }

  /**
   * Type of vehicle to grid communication used
   * @return vehicleToGridCommunicationType
  */
  @Valid 
  @Schema(name = "vehicleToGridCommunicationType", description = "Type of vehicle to grid communication used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleToGridCommunicationType")
  public List<@Valid VehicleToGridCommunicationTypeEnum> getVehicleToGridCommunicationType() {
    return vehicleToGridCommunicationType;
  }

  public void setVehicleToGridCommunicationType(List<@Valid VehicleToGridCommunicationTypeEnum> vehicleToGridCommunicationType) {
    this.vehicleToGridCommunicationType = vehicleToGridCommunicationType;
  }

  public ElectricChargingPoint availableVoltage(List<@Valid BigDecimal> availableVoltage) {
    this.availableVoltage = availableVoltage;
    return this;
  }

  public ElectricChargingPoint addAvailableVoltageItem(BigDecimal availableVoltageItem) {
    if (this.availableVoltage == null) {
      this.availableVoltage = new ArrayList<>();
    }
    this.availableVoltage.add(availableVoltageItem);
    return this;
  }

  /**
   * Possible degrees of voltage
   * @return availableVoltage
  */
  @Valid 
  @Schema(name = "availableVoltage", description = "Possible degrees of voltage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableVoltage")
  public List<@Valid BigDecimal> getAvailableVoltage() {
    return availableVoltage;
  }

  public void setAvailableVoltage(List<@Valid BigDecimal> availableVoltage) {
    this.availableVoltage = availableVoltage;
  }

  public ElectricChargingPoint connectors(List<@Valid Connector> connectors) {
    this.connectors = connectors;
    return this;
  }

  public ElectricChargingPoint addConnectorsItem(Connector connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

  /**
   * Specify the connector(s).
   * @return connectors
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "connectors", description = "Specify the connector(s).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("connectors")
  public List<@Valid Connector> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<@Valid Connector> connectors) {
    this.connectors = connectors;
  }


  public ElectricChargingPoint metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public ElectricChargingPoint authenticationAndIdentificationMethods(List<@Valid AuthenticationAndIdentificationEnum> authenticationAndIdentificationMethods) {
    super.authenticationAndIdentificationMethods(authenticationAndIdentificationMethods);
    return this;
  }

  public ElectricChargingPoint addAuthenticationAndIdentificationMethodsItem(AuthenticationAndIdentificationEnum authenticationAndIdentificationMethodsItem) {
    super.addAuthenticationAndIdentificationMethodsItem(authenticationAndIdentificationMethodsItem);
    return this;
  }

  public ElectricChargingPoint currencyOverride(List<@Valid String> currencyOverride) {
    super.currencyOverride(currencyOverride);
    return this;
  }

  public ElectricChargingPoint addCurrencyOverrideItem(String currencyOverrideItem) {
    super.addCurrencyOverrideItem(currencyOverrideItem);
    return this;
  }

  public ElectricChargingPoint deliveryUnit(DeliveryUnitEnum deliveryUnit) {
    super.deliveryUnit(deliveryUnit);
    return this;
  }

  public ElectricChargingPoint minimumDeliveryAmount(BigDecimal minimumDeliveryAmount) {
    super.minimumDeliveryAmount(minimumDeliveryAmount);
    return this;
  }

  public ElectricChargingPoint maximumDeliveryAmount(BigDecimal maximumDeliveryAmount) {
    super.maximumDeliveryAmount(maximumDeliveryAmount);
    return this;
  }

  public ElectricChargingPoint modelType(List<@Valid SpecificLanguageString> modelType) {
    super.modelType(modelType);
    return this;
  }

  public ElectricChargingPoint addModelTypeItem(SpecificLanguageString modelTypeItem) {
    super.addModelTypeItem(modelTypeItem);
    return this;
  }

  public ElectricChargingPoint refillPointIndex(Integer refillPointIndex) {
    super.refillPointIndex(refillPointIndex);
    return this;
  }

  public ElectricChargingPoint reservationType(ReservationTypeEnum reservationType) {
    super.reservationType(reservationType);
    return this;
  }

  public ElectricChargingPoint serviceType(List<@Valid ServiceTypeEnum> serviceType) {
    super.serviceType(serviceType);
    return this;
  }

  public ElectricChargingPoint addServiceTypeItem(ServiceTypeEnum serviceTypeItem) {
    super.addServiceTypeItem(serviceTypeItem);
    return this;
  }

  public ElectricChargingPoint userInterfaceLanguage(List<@Valid String> userInterfaceLanguage) {
    super.userInterfaceLanguage(userInterfaceLanguage);
    return this;
  }

  public ElectricChargingPoint addUserInterfaceLanguageItem(String userInterfaceLanguageItem) {
    super.addUserInterfaceLanguageItem(userInterfaceLanguageItem);
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
    ElectricChargingPoint electricChargingPoint = (ElectricChargingPoint) o;
    return Objects.equals(this.availableChargingPower, electricChargingPoint.availableChargingPower) &&
        Objects.equals(this.externalIdentifier, electricChargingPoint.externalIdentifier) &&
        Objects.equals(this.usageType, electricChargingPoint.usageType) &&
        Objects.equals(this.vehicleToGridCommunicationType, electricChargingPoint.vehicleToGridCommunicationType) &&
        Objects.equals(this.availableVoltage, electricChargingPoint.availableVoltage) &&
        Objects.equals(this.connectors, electricChargingPoint.connectors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableChargingPower, externalIdentifier, usageType, vehicleToGridCommunicationType, availableVoltage, connectors, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectricChargingPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availableChargingPower: ").append(toIndentedString(availableChargingPower)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    vehicleToGridCommunicationType: ").append(toIndentedString(vehicleToGridCommunicationType)).append("\n");
    sb.append("    availableVoltage: ").append(toIndentedString(availableVoltage)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
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

