package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information relating to a specific telephone point of contact.
 */

@Schema(name = "TelephoneContact", description = "A class defining information relating to a specific telephone point of contact.")

public class TelephoneContact {

  private String areaCode;

  @Valid
  private List<String> extensionNumbers;

  private String ituCountryCode;

  @Valid
  private List<String> localNumbers;

  public TelephoneContact areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * The area code element of a telephone number.
   * @return areaCode
  */
  
  @Schema(name = "areaCode", description = "The area code element of a telephone number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("areaCode")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public TelephoneContact extensionNumbers(List<String> extensionNumbers) {
    this.extensionNumbers = extensionNumbers;
    return this;
  }

  public TelephoneContact addExtensionNumbersItem(String extensionNumbersItem) {
    if (this.extensionNumbers == null) {
      this.extensionNumbers = new ArrayList<>();
    }
    this.extensionNumbers.add(extensionNumbersItem);
    return this;
  }

  /**
   * Any extension number typically within a larger organisation's telephone exchange system.
   * @return extensionNumbers
  */
  
  @Schema(name = "extensionNumbers", description = "Any extension number typically within a larger organisation's telephone exchange system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extensionNumbers")
  public List<String> getExtensionNumbers() {
    return extensionNumbers;
  }

  public void setExtensionNumbers(List<String> extensionNumbers) {
    this.extensionNumbers = extensionNumbers;
  }

  public TelephoneContact ituCountryCode(String ituCountryCode) {
    this.ituCountryCode = ituCountryCode;
    return this;
  }

  /**
   * Country calling codes or country dial in codes are telephone dialing prefixes for the member countries or  regions of the International Telecommunication Union (ITU).  They are defined by the ITU-T in standards E.123 and E.164.
   * @return ituCountryCode
  */
  
  @Schema(name = "ituCountryCode", description = "Country calling codes or country dial in codes are telephone dialing prefixes for the member countries or  regions of the International Telecommunication Union (ITU).  They are defined by the ITU-T in standards E.123 and E.164.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ituCountryCode")
  public String getItuCountryCode() {
    return ituCountryCode;
  }

  public void setItuCountryCode(String ituCountryCode) {
    this.ituCountryCode = ituCountryCode;
  }

  public TelephoneContact localNumbers(List<String> localNumbers) {
    this.localNumbers = localNumbers;
    return this;
  }

  public TelephoneContact addLocalNumbersItem(String localNumbersItem) {
    if (this.localNumbers == null) {
      this.localNumbers = new ArrayList<>();
    }
    this.localNumbers.add(localNumbersItem);
    return this;
  }

  /**
   * The local code element of a telephone number.
   * @return localNumbers
  */
  
  @Schema(name = "localNumbers", description = "The local code element of a telephone number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localNumbers")
  public List<String> getLocalNumbers() {
    return localNumbers;
  }

  public void setLocalNumbers(List<String> localNumbers) {
    this.localNumbers = localNumbers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephoneContact telephoneContact = (TelephoneContact) o;
    return Objects.equals(this.areaCode, telephoneContact.areaCode) &&
        Objects.equals(this.extensionNumbers, telephoneContact.extensionNumbers) &&
        Objects.equals(this.ituCountryCode, telephoneContact.ituCountryCode) &&
        Objects.equals(this.localNumbers, telephoneContact.localNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, extensionNumbers, ituCountryCode, localNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephoneContact {\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    extensionNumbers: ").append(toIndentedString(extensionNumbers)).append("\n");
    sb.append("    ituCountryCode: ").append(toIndentedString(ituCountryCode)).append("\n");
    sb.append("    localNumbers: ").append(toIndentedString(localNumbers)).append("\n");
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

