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
import org.npp.model.time.SpecialDay;
import org.npp.model.time.enums.SpecialDayTypeEnum;
import org.npp.model.common.SpecificLanguageString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Specification of a specific public holiday in case &#x60;specialDayType&#x60; is set to &#x60;publicHoliday&#x60;.
 */

@Schema(name = "PublicHoliday", description = "Specification of a specific public holiday in case `specialDayType` is set to `publicHoliday`.")


public class PublicHoliday extends SpecialDay {

  @Valid
  private List<@Valid SpecificLanguageString> publicHolidayName = new ArrayList<>();

  public PublicHoliday() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PublicHoliday(List<@Valid SpecificLanguageString> publicHolidayName, Boolean intersectWithApplicableDays, SpecialDayTypeEnum specialDayType) {
    super(intersectWithApplicableDays, specialDayType);
    this.publicHolidayName = publicHolidayName;
  }

  public PublicHoliday publicHolidayName(List<@Valid SpecificLanguageString> publicHolidayName) {
    this.publicHolidayName = publicHolidayName;
    return this;
  }

  public PublicHoliday addPublicHolidayNameItem(SpecificLanguageString publicHolidayNameItem) {
    if (this.publicHolidayName == null) {
      this.publicHolidayName = new ArrayList<>();
    }
    this.publicHolidayName.add(publicHolidayNameItem);
    return this;
  }

  /**
   * Multilingual string, represented as an array of SpecificLanguageString objects.
   * @return publicHolidayName
  */
  @NotNull @Valid 
  @Schema(name = "publicHolidayName", description = "Multilingual string, represented as an array of SpecificLanguageString objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publicHolidayName")
  public List<@Valid SpecificLanguageString> getPublicHolidayName() {
    return publicHolidayName;
  }

  public void setPublicHolidayName(List<@Valid SpecificLanguageString> publicHolidayName) {
    this.publicHolidayName = publicHolidayName;
  }


  public PublicHoliday metaType(MetaTypeEnum metaType) {
    super.metaType(metaType);
    return this;
  }

  public PublicHoliday intersectWithApplicableDays(Boolean intersectWithApplicableDays) {
    super.intersectWithApplicableDays(intersectWithApplicableDays);
    return this;
  }

  public PublicHoliday specialDayType(SpecialDayTypeEnum specialDayType) {
    super.specialDayType(specialDayType);
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
    PublicHoliday publicHoliday = (PublicHoliday) o;
    return Objects.equals(this.publicHolidayName, publicHoliday.publicHolidayName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicHolidayName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHoliday {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    publicHolidayName: ").append(toIndentedString(publicHolidayName)).append("\n");
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

