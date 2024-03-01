package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.enums.ChargingModeEnum;
import org.npp.model.place.enums.ConnectorFormatTypeEnum;
import org.npp.model.place.enums.ConnectorTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Parameters and description of an interface that is available at the given electric charging point to connect vehicles
 */

@Schema(name = "Connector", description = "Parameters and description of an interface that is available at the given electric charging point to connect vehicles")

public class Connector {

  private ChargingModeEnum chargingMode;

  private ConnectorFormatTypeEnum connectorFormat;

  private ConnectorTypeEnum connectorType;

  @Valid
  private List<@Valid String> countryOfDomesticSocket;

  private BigDecimal maximumCurrent;

  private BigDecimal voltage;

  private BigDecimal maxPowerAtSocket;

  private String otherConnector;

  public Connector() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Connector(ConnectorTypeEnum connectorType, BigDecimal maxPowerAtSocket) {
    this.connectorType = connectorType;
    this.maxPowerAtSocket = maxPowerAtSocket;
  }

  public Connector chargingMode(ChargingModeEnum chargingMode) {
    this.chargingMode = chargingMode;
    return this;
  }

  /**
   * Get chargingMode
   * @return chargingMode
  */
  @Valid 
  @Schema(name = "chargingMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chargingMode")
  public ChargingModeEnum getChargingMode() {
    return chargingMode;
  }

  public void setChargingMode(ChargingModeEnum chargingMode) {
    this.chargingMode = chargingMode;
  }

  public Connector connectorFormat(ConnectorFormatTypeEnum connectorFormat) {
    this.connectorFormat = connectorFormat;
    return this;
  }

  /**
   * Get connectorFormat
   * @return connectorFormat
  */
  @Valid 
  @Schema(name = "connectorFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectorFormat")
  public ConnectorFormatTypeEnum getConnectorFormat() {
    return connectorFormat;
  }

  public void setConnectorFormat(ConnectorFormatTypeEnum connectorFormat) {
    this.connectorFormat = connectorFormat;
  }

  public Connector connectorType(ConnectorTypeEnum connectorType) {
    this.connectorType = connectorType;
    return this;
  }

  /**
   * Get connectorType
   * @return connectorType
  */
  @NotNull @Valid 
  @Schema(name = "connectorType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("connectorType")
  public ConnectorTypeEnum getConnectorType() {
    return connectorType;
  }

  public void setConnectorType(ConnectorTypeEnum connectorType) {
    this.connectorType = connectorType;
  }

  public Connector countryOfDomesticSocket(List<@Valid String> countryOfDomesticSocket) {
    this.countryOfDomesticSocket = countryOfDomesticSocket;
    return this;
  }

  public Connector addCountryOfDomesticSocketItem(String countryOfDomesticSocketItem) {
    if (this.countryOfDomesticSocket == null) {
      this.countryOfDomesticSocket = new ArrayList<>();
    }
    this.countryOfDomesticSocket.add(countryOfDomesticSocketItem);
    return this;
  }

  /**
   * Countries for which the domestic socket is applicable. Only needed if explicit type of a domestic socket is not specified.
   * @return countryOfDomesticSocket
  */
  
  @Schema(name = "countryOfDomesticSocket", description = "Countries for which the domestic socket is applicable. Only needed if explicit type of a domestic socket is not specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryOfDomesticSocket")
  public List<@Valid String> getCountryOfDomesticSocket() {
    return countryOfDomesticSocket;
  }

  public void setCountryOfDomesticSocket(List<@Valid String> countryOfDomesticSocket) {
    this.countryOfDomesticSocket = countryOfDomesticSocket;
  }

  public Connector maximumCurrent(BigDecimal maximumCurrent) {
    this.maximumCurrent = maximumCurrent;
    return this;
  }

  /**
   * Unit for electric current.
   * @return maximumCurrent
  */
  @Valid 
  @Schema(name = "maximumCurrent", description = "Unit for electric current.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumCurrent")
  public BigDecimal getMaximumCurrent() {
    return maximumCurrent;
  }

  public void setMaximumCurrent(BigDecimal maximumCurrent) {
    this.maximumCurrent = maximumCurrent;
  }

  public Connector voltage(BigDecimal voltage) {
    this.voltage = voltage;
    return this;
  }

  /**
   * Unit of measure of electric potential.
   * @return voltage
  */
  @Valid 
  @Schema(name = "voltage", description = "Unit of measure of electric potential.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voltage")
  public BigDecimal getVoltage() {
    return voltage;
  }

  public void setVoltage(BigDecimal voltage) {
    this.voltage = voltage;
  }

  public Connector maxPowerAtSocket(BigDecimal maxPowerAtSocket) {
    this.maxPowerAtSocket = maxPowerAtSocket;
    return this;
  }

  /**
   * Unit of measure of electric power.
   * @return maxPowerAtSocket
  */
  @NotNull @Valid 
  @Schema(name = "maxPowerAtSocket", description = "Unit of measure of electric power.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maxPowerAtSocket")
  public BigDecimal getMaxPowerAtSocket() {
    return maxPowerAtSocket;
  }

  public void setMaxPowerAtSocket(BigDecimal maxPowerAtSocket) {
    this.maxPowerAtSocket = maxPowerAtSocket;
  }

  public Connector otherConnector(String otherConnector) {
    this.otherConnector = otherConnector;
    return this;
  }

  /**
   * Some other connector / charging interface
   * @return otherConnector
  */
  
  @Schema(name = "otherConnector", description = "Some other connector / charging interface", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherConnector")
  public String getOtherConnector() {
    return otherConnector;
  }

  public void setOtherConnector(String otherConnector) {
    this.otherConnector = otherConnector;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connector connector = (Connector) o;
    return Objects.equals(this.chargingMode, connector.chargingMode) &&
        Objects.equals(this.connectorFormat, connector.connectorFormat) &&
        Objects.equals(this.connectorType, connector.connectorType) &&
        Objects.equals(this.countryOfDomesticSocket, connector.countryOfDomesticSocket) &&
        Objects.equals(this.maximumCurrent, connector.maximumCurrent) &&
        Objects.equals(this.voltage, connector.voltage) &&
        Objects.equals(this.maxPowerAtSocket, connector.maxPowerAtSocket) &&
        Objects.equals(this.otherConnector, connector.otherConnector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingMode, connectorFormat, connectorType, countryOfDomesticSocket, maximumCurrent, voltage, maxPowerAtSocket, otherConnector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connector {\n");
    sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
    sb.append("    connectorFormat: ").append(toIndentedString(connectorFormat)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    countryOfDomesticSocket: ").append(toIndentedString(countryOfDomesticSocket)).append("\n");
    sb.append("    maximumCurrent: ").append(toIndentedString(maximumCurrent)).append("\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
    sb.append("    maxPowerAtSocket: ").append(toIndentedString(maxPowerAtSocket)).append("\n");
    sb.append("    otherConnector: ").append(toIndentedString(otherConnector)).append("\n");
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

