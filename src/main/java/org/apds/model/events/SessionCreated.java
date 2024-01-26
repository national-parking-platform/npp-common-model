package org.apds.model.events;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.apds.model.sessions.Session;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class SessionCreated implements Event<Session>, Serializable {

    private String id;
    private Instant timestamp;
    private String eventType = "SessionCreated";
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Session payload = null;
    private String origin = "";


    public SessionCreated() {
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


    public static SessionCreated withPayload( Session payload) {
        SessionCreated event = new SessionCreated();
        event.setPayload( payload);
        return event;
    }

    public SessionCreated from( String origin) {
        this.origin = origin;
        return this;
    }
}