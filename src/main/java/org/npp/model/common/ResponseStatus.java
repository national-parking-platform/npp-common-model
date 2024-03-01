package org.npp.model.common;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.npp.model.common.enums.ResponseStatusEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Codifies responses following some creation, update or delete operation.
 */

@Schema(name = "ResponseStatus", description = "Codifies responses following some creation, update or delete operation.")

public class ResponseStatus {

  private ResponseStatusEnum status;

  private Integer code;

  private String message;

  public ResponseStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponseStatus(ResponseStatusEnum status) {
    this.status = status;
  }

  public ResponseStatus status(ResponseStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public ResponseStatusEnum getStatus() {
    return status;
  }

  public void setStatus(ResponseStatusEnum status) {
    this.status = status;
  }

  public ResponseStatus code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Same numbering and semantics as HTTP status codes.
   * @return code
  */
  
  @Schema(name = "code", description = "Same numbering and semantics as HTTP status codes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ResponseStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Descriptive message for error statuses.
   * @return message
  */
  
  @Schema(name = "message", description = "Descriptive message for error statuses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStatus responseStatus = (ResponseStatus) o;
    return Objects.equals(this.status, responseStatus.status) &&
        Objects.equals(this.code, responseStatus.code) &&
        Objects.equals(this.message, responseStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

