package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A legally incorporated body (e.g. company, business, government entity)
 */

@Schema(name = "Organisation", description = "A legally incorporated body (e.g. company, business, government entity)")

public class Organisation {

  private String linkToGeneralInformation;

  private String linkToLogo;

  private String name;

  private String shortName;

  private String tradingName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validFromDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validToDate;

  public Organisation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Organisation(String name) {
    this.name = name;
  }

  public Organisation linkToGeneralInformation(String linkToGeneralInformation) {
    this.linkToGeneralInformation = linkToGeneralInformation;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return linkToGeneralInformation
  */
  
  @Schema(name = "linkToGeneralInformation", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkToGeneralInformation")
  public String getLinkToGeneralInformation() {
    return linkToGeneralInformation;
  }

  public void setLinkToGeneralInformation(String linkToGeneralInformation) {
    this.linkToGeneralInformation = linkToGeneralInformation;
  }

  public Organisation linkToLogo(String linkToLogo) {
    this.linkToLogo = linkToLogo;
    return this;
  }

  /**
   * Represents a Url for an internet accessible resource.
   * @return linkToLogo
  */
  
  @Schema(name = "linkToLogo", description = "Represents a Url for an internet accessible resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkToLogo")
  public String getLinkToLogo() {
    return linkToLogo;
  }

  public void setLinkToLogo(String linkToLogo) {
    this.linkToLogo = linkToLogo;
  }

  public Organisation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the organisation or service.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the organisation or service.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organisation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Supplier-defined short abbreviated name for the organisation or service.
   * @return shortName
  */
  
  @Schema(name = "shortName", description = "Supplier-defined short abbreviated name for the organisation or service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Organisation tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  /**
   * Trading or brand name for organisation or service
   * @return tradingName
  */
  
  @Schema(name = "tradingName", description = "Trading or brand name for organisation or service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tradingName")
  public String getTradingName() {
    return tradingName;
  }

  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }

  public Organisation validFromDate(LocalDate validFromDate) {
    this.validFromDate = validFromDate;
    return this;
  }

  /**
   * Date from which this organisation instance is considered to be valid
   * @return validFromDate
  */
  @Valid 
  @Schema(name = "validFromDate", description = "Date from which this organisation instance is considered to be valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFromDate")
  public LocalDate getValidFromDate() {
    return validFromDate;
  }

  public void setValidFromDate(LocalDate validFromDate) {
    this.validFromDate = validFromDate;
  }

  public Organisation validToDate(LocalDate validToDate) {
    this.validToDate = validToDate;
    return this;
  }

  /**
   * Date to which this organisation instance is considered to be valid
   * @return validToDate
  */
  @Valid 
  @Schema(name = "validToDate", description = "Date to which this organisation instance is considered to be valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validToDate")
  public LocalDate getValidToDate() {
    return validToDate;
  }

  public void setValidToDate(LocalDate validToDate) {
    this.validToDate = validToDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.linkToGeneralInformation, organisation.linkToGeneralInformation) &&
        Objects.equals(this.linkToLogo, organisation.linkToLogo) &&
        Objects.equals(this.name, organisation.name) &&
        Objects.equals(this.shortName, organisation.shortName) &&
        Objects.equals(this.tradingName, organisation.tradingName) &&
        Objects.equals(this.validFromDate, organisation.validFromDate) &&
        Objects.equals(this.validToDate, organisation.validToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkToGeneralInformation, linkToLogo, name, shortName, tradingName, validFromDate, validToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    sb.append("    linkToGeneralInformation: ").append(toIndentedString(linkToGeneralInformation)).append("\n");
    sb.append("    linkToLogo: ").append(toIndentedString(linkToLogo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
    sb.append("    validToDate: ").append(toIndentedString(validToDate)).append("\n");
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

