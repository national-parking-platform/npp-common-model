package org.npp.model.place.characteristics;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.place.characteristics.AddressLine;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A street oriented addressing structure supporting delivery
 */

@Schema(name = "Address", description = "A street oriented addressing structure supporting delivery")

public class Address {

  private String countryCode;

  @Valid
  private List<@Valid SpecificLanguageString> city;

  private String postCode;

  @Valid
  private List<@Valid AddressLine> addressLines;

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * EN ISO 3166-1 two-character country code.
   * @return countryCode
  */
  @Pattern(regexp = "^[a-z]{2}$") 
  @Schema(name = "countryCode", example = "es", description = "EN ISO 3166-1 two-character country code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address city(List<@Valid SpecificLanguageString> city) {
    this.city = city;
    return this;
  }

  public Address addCityItem(SpecificLanguageString cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return city
  */
  @Valid 
  @Schema(name = "city", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public List<@Valid SpecificLanguageString> getCity() {
    return city;
  }

  public void setCity(List<@Valid SpecificLanguageString> city) {
    this.city = city;
  }

  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Postcode or postal code for the address.
   * @return postCode
  */
  
  @Schema(name = "postCode", description = "Postcode or postal code for the address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Address addressLines(List<@Valid AddressLine> addressLines) {
    this.addressLines = addressLines;
    return this;
  }

  public Address addAddressLinesItem(AddressLine addressLinesItem) {
    if (this.addressLines == null) {
      this.addressLines = new ArrayList<>();
    }
    this.addressLines.add(addressLinesItem);
    return this;
  }

  /**
   * Address lines
   * @return addressLines
  */
  @Valid 
  @Schema(name = "addressLines", description = "Address lines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressLines")
  public List<@Valid AddressLine> getAddressLines() {
    return addressLines;
  }

  public void setAddressLines(List<@Valid AddressLine> addressLines) {
    this.addressLines = addressLines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.postCode, address.postCode) &&
        Objects.equals(this.addressLines, address.addressLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, city, postCode, addressLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
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

