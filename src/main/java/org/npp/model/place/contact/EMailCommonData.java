package org.npp.model.place.contact;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.place.contact.enums.EmailTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * A class defining information concerning an email point of contact.
 */

@Schema(name = "EMailCommonData", description = "A class defining information concerning an email point of contact.")

public class EMailCommonData {

  private Boolean primaryFlag;

  private EmailTypeEnum typeCode;

  public EMailCommonData primaryFlag(Boolean primaryFlag) {
    this.primaryFlag = primaryFlag;
    return this;
  }

  /**
   * If [TRUE], this indicates that this is the primary point of contact
   * @return primaryFlag
  */
  
  @Schema(name = "primaryFlag", description = "If [TRUE], this indicates that this is the primary point of contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryFlag")
  public Boolean getPrimaryFlag() {
    return primaryFlag;
  }

  public void setPrimaryFlag(Boolean primaryFlag) {
    this.primaryFlag = primaryFlag;
  }

  public EMailCommonData typeCode(EmailTypeEnum typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Get typeCode
   * @return typeCode
  */
  @Valid 
  @Schema(name = "typeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typeCode")
  public EmailTypeEnum getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(EmailTypeEnum typeCode) {
    this.typeCode = typeCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMailCommonData emailCommonData = (EMailCommonData) o;
    return Objects.equals(this.primaryFlag, emailCommonData.primaryFlag) &&
        Objects.equals(this.typeCode, emailCommonData.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryFlag, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMailCommonData {\n");
    sb.append("    primaryFlag: ").append(toIndentedString(primaryFlag)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

