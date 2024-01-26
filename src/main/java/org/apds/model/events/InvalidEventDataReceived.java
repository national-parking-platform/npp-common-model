package org.apds.model.events;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class InvalidEventDataReceived implements Event<String>, Serializable {

    private String id;
    private Instant timestamp;
    private String eventType = "InvalidEventDataReceived";
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String payload = null;
    private String origin = "";


    public InvalidEventDataReceived() {
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

    public String getPayload() {
        return payload;
    }
    public String getOrigin() { return origin;}

    public void setPayload( String payload) {
        this.payload = payload;
    }
    public void setOrigin( String origin) { this.origin = origin;}

    public static InvalidEventDataReceived withPayload(String payload) {
        InvalidEventDataReceived event = new InvalidEventDataReceived();
        event.setPayload( payload);
        return event;
    }
}