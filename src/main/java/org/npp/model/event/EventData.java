package org.npp.model.event;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.npp.model.event.enums.EventTypeEnum;
import org.npp.model.common.VersionedReference;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Describes the data payload that an event subscriber should expect to receive.  Event data can be grouped into a single event publication, if they share the same topic and instant of occurrence.  This allows both publishers and subscribers to improve their communication efficiency when mass-updates occur.
 */

@Schema(name = "EventData", description = "Describes the data payload that an event subscriber should expect to receive.  Event data can be grouped into a single event publication, if they share the same topic and instant of occurrence.  This allows both publishers and subscribers to improve their communication efficiency when mass-updates occur.")

public class EventData {

  private String eventSubscriptionId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  @Valid
  private List<@Valid VersionedReference> data = new ArrayList<>();

  private EventTypeEnum topic;

  public EventData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventData(String eventSubscriptionId, OffsetDateTime eventTime, List<@Valid VersionedReference> data, EventTypeEnum topic) {
    this.eventSubscriptionId = eventSubscriptionId;
    this.eventTime = eventTime;
    this.data = data;
    this.topic = topic;
  }

  public EventData eventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
    return this;
  }

  /**
   * The unique identifier for the event subscription that triggered this event.
   * @return eventSubscriptionId
  */
  @NotNull 
  @Schema(name = "eventSubscriptionId", description = "The unique identifier for the event subscription that triggered this event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventSubscriptionId")
  public String getEventSubscriptionId() {
    return eventSubscriptionId;
  }

  public void setEventSubscriptionId(String eventSubscriptionId) {
    this.eventSubscriptionId = eventSubscriptionId;
  }

  public EventData eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * When the event occurred in the source system.
   * @return eventTime
  */
  @NotNull @Valid 
  @Schema(name = "eventTime", description = "When the event occurred in the source system.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventTime")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public EventData data(List<@Valid VersionedReference> data) {
    this.data = data;
    return this;
  }

  public EventData addDataItem(VersionedReference dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * The versioned reference about which this event is referring to
   * @return data
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "data", description = "The versioned reference about which this event is referring to", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public List<@Valid VersionedReference> getData() {
    return data;
  }

  public void setData(List<@Valid VersionedReference> data) {
    this.data = data;
  }

  public EventData topic(EventTypeEnum topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
  */
  @NotNull @Valid 
  @Schema(name = "topic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("topic")
  public EventTypeEnum getTopic() {
    return topic;
  }

  public void setTopic(EventTypeEnum topic) {
    this.topic = topic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventData eventData = (EventData) o;
    return Objects.equals(this.eventSubscriptionId, eventData.eventSubscriptionId) &&
        Objects.equals(this.eventTime, eventData.eventTime) &&
        Objects.equals(this.data, eventData.data) &&
        Objects.equals(this.topic, eventData.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSubscriptionId, eventTime, data, topic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventData {\n");
    sb.append("    eventSubscriptionId: ").append(toIndentedString(eventSubscriptionId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

