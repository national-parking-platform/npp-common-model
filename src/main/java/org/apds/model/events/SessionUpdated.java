package org.apds.model.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.apds.model.sessions.Session;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class SessionUpdated implements Event<Session>, Serializable {

    private String id;
    private Instant timestamp;
    private String eventType = "SessionUpdated";
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Session payload = null;
    private String origin = "";


    public SessionUpdated() {
        this.id = UUID.randomUUID().toString();
        this.timestamp = Instant.now();
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public String getId() {
        return id;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public Session getPayload() {
        return payload;
    }
    public String getOrigin() { return origin;}

    public void setPayload( Session payload) {
        this.payload = payload;
    }
    public void setOrigin( String origin) { this.origin = origin;}


    public static SessionUpdated withPayload( Session payload) {
        SessionUpdated event = new SessionUpdated();
        event.setPayload( payload);
        return event;
    }

    public SessionUpdated from( String origin) {
        this.origin = origin;
        return this;
    }
}