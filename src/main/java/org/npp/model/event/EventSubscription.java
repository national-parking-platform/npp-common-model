package org.npp.model.event;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.npp.model.event.enums.EventTypeEnum;
import org.npp.model.common.Reference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * Describes a subscription, which is composed of: * A list of event &#x60;topics&#x60; to subscribe (see list below for meaning) * A destination &#x60;endpoint&#x60; to be notified when that event occurs in the source system * A list of hierarchyElements where those events might occur.  * An option to choose to receive events occurring only directly at the given hierarchyElements or if those  occurring at any children elements as well should be included as well. Default is not to include children events
 */

@Schema(name = "EventSubscription", description = "Describes a subscription, which is composed of: * A list of event `topics` to subscribe (see list below for meaning) * A destination `endpoint` to be notified when that event occurs in the source system * A list of hierarchyElements where those events might occur.  * An option to choose to receive events occurring only directly at the given hierarchyElements or if those  occurring at any children elements as well should be included as well. Default is not to include children events")

public class EventSubscription {

  private Boolean includeChildrenEvents = false;

  @Valid
  private Set<@Valid Reference> hierarchyElements;

  private String endpoint;

  @Valid
  private Set<@Valid EventTypeEnum> topics = new LinkedHashSet<>();

  public EventSubscription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventSubscription(String endpoint, Set<@Valid EventTypeEnum> topics) {
    this.endpoint = endpoint;
    this.topics = topics;
  }

  public EventSubscription includeChildrenEvents(Boolean includeChildrenEvents) {
    this.includeChildrenEvents = includeChildrenEvents;
    return this;
  }

  /**
   * An option to choose to receive events occurring only directly at the given hierarchyElements (FALSE) or  if those occurring at any children elements as well should be included as well (TRUE).  FALSE is the default, if the field is left blank
   * @return includeChildrenEvents
  */
  
  @Schema(name = "includeChildrenEvents", description = "An option to choose to receive events occurring only directly at the given hierarchyElements (FALSE) or  if those occurring at any children elements as well should be included as well (TRUE).  FALSE is the default, if the field is left blank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeChildrenEvents")
  public Boolean getIncludeChildrenEvents() {
    return includeChildrenEvents;
  }

  public void setIncludeChildrenEvents(Boolean includeChildrenEvents) {
    this.includeChildrenEvents = includeChildrenEvents;
  }

  public EventSubscription hierarchyElements(Set<@Valid Reference> hierarchyElements) {
    this.hierarchyElements = hierarchyElements;
    return this;
  }

  public EventSubscription addHierarchyElementsItem(Reference hierarchyElementsItem) {
    if (this.hierarchyElements == null) {
      this.hierarchyElements = new LinkedHashSet<>();
    }
    this.hierarchyElements.add(hierarchyElementsItem);
    return this;
  }

  /**
   * A list of hierarchyElements where events might occur.
   * @return hierarchyElements
  */
  @Valid @Size(min = 1) 
  @Schema(name = "hierarchyElements", description = "A list of hierarchyElements where events might occur.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchyElements")
  public Set<@Valid Reference> getHierarchyElements() {
    return hierarchyElements;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setHierarchyElements(Set<@Valid Reference> hierarchyElements) {
    this.hierarchyElements = hierarchyElements;
  }

  public EventSubscription endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * API endpoint expecting JSON POST messages with payloads corresponding to the type of event
   * @return endpoint
  */
  @NotNull 
  @Schema(name = "endpoint", example = "https://myapi.com/apds-events", description = "API endpoint expecting JSON POST messages with payloads corresponding to the type of event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public EventSubscription topics(Set<@Valid EventTypeEnum> topics) {
    this.topics = topics;
    return this;
  }

  public EventSubscription addTopicsItem(EventTypeEnum topicsItem) {
    if (this.topics == null) {
      this.topics = new LinkedHashSet<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * The event topic (must be one of the supported enumeration options)
   * @return topics
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "topics", description = "The event topic (must be one of the supported enumeration options)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("topics")
  public Set<@Valid EventTypeEnum> getTopics() {
    return topics;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setTopics(Set<@Valid EventTypeEnum> topics) {
    this.topics = topics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSubscription eventSubscription = (EventSubscription) o;
    return Objects.equals(this.includeChildrenEvents, eventSubscription.includeChildrenEvents) &&
        Objects.equals(this.hierarchyElements, eventSubscription.hierarchyElements) &&
        Objects.equals(this.endpoint, eventSubscription.endpoint) &&
        Objects.equals(this.topics, eventSubscription.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeChildrenEvents, hierarchyElements, endpoint, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSubscription {\n");
    sb.append("    includeChildrenEvents: ").append(toIndentedString(includeChildrenEvents)).append("\n");
    sb.append("    hierarchyElements: ").append(toIndentedString(hierarchyElements)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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

