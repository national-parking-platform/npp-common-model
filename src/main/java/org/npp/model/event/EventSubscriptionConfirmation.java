package org.npp.model.event;
  
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
 * Interface for the response to a event subscription
 */

@Schema(name = "EventSubscriptionConfirmation", description = "Interface for the response to a event subscription")

public class EventSubscriptionConfirmation {

  private ResponseStatusEnum status;

  private Integer code;

  private String message;

  private String id;

  public EventSubscriptionConfirmation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventSubscriptionConfirmation(ResponseStatusEnum status, String id) {
    this.status = status;
    this.id = id;
  }

  public EventSubscriptionConfirmation status(ResponseStatusEnum status) {
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

  public EventSubscriptionConfirmation code(Integer code) {
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

  public EventSubscriptionConfirmation message(String message) {
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

  public EventSubscriptionConfirmation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the event subscription
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the event subscription", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscriptionConfirmation eventSubscriptionConfirmation = (EventSubscriptionConfirmation) o;
    return Objects.equals(this.status, eventSubscriptionConfirmation.status) &&
        Objects.equals(this.code, eventSubscriptionConfirmation.code) &&
        Objects.equals(this.message, eventSubscriptionConfirmation.message) &&
        Objects.equals(this.id, eventSubscriptionConfirmation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscriptionConfirmation {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

