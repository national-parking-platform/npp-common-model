package org.apds.model.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.apds.model.internal.EventSubscription;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class SubscriptionDeleted implements Event<EventSubscription>, Serializable {

    private String id;
    private Instant timestamp;
    private final String eventType = getClass().getSimpleName();
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private EventSubscription payload = null;
    private String origin = "";

    public SubscriptionDeleted() {
        this.id = UUID.randomUUID().toString();
        this.timestamp = Instant.now();
    }

    public static SubscriptionDeleted withPayload( EventSubscription payload) {
        SubscriptionDeleted event = new SubscriptionDeleted();
        event.setPayload( payload);
        return event;
    }

    public SubscriptionDeleted from( String origin) {
        this.origin = origin;
        return this;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public String getId() { return id;}
    public Instant getTimestamp() { return timestamp;}
    public String getEventType() { return eventType;}
    public EventSubscription getPayload() { return payload;}
    public String getOrigin() { return origin;}

    public void setId( String id) { this.id = id;}
    public void setTimestamp( Instant timestamp) { this.timestamp = timestamp;}
    public void setPayload( EventSubscription payload) { this.payload = payload;}
}
