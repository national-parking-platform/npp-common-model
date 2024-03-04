package org.npp.model;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Interface for the update of an AssignedRight
 */

@Schema(name = "PutAssignedRight", description = "Interface for the update of an AssignedRight")


public class PutAssignedRight {

  /**
   * Gets or Sets metaType
   */
  public enum MetaTypeEnum {
    ASSIGNEDRIGHT("AssignedRight"),
    
    REFERENCETOQUOTE("ReferenceToQuote");

    private String value;

    MetaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MetaTypeEnum fromValue(String value) {
      for (MetaTypeEnum b : MetaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MetaTypeEnum metaType;

  public PutAssignedRight metaType(MetaTypeEnum metaType) {
    this.metaType = metaType;
    return this;
  }

  /**
   * Get metaType
   * @return metaType
  */
  
  @Schema(name = "metaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaType")
  public MetaTypeEnum getMetaType() {
    return metaType;
  }

  public void setMetaType(MetaTypeEnum metaType) {
    this.metaType = metaType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutAssignedRight putAssignedRight = (PutAssignedRight) o;
    return Objects.equals(this.metaType, putAssignedRight.metaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutAssignedRight {\n");
    sb.append("    metaType: ").append(toIndentedString(metaType)).append("\n");
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

