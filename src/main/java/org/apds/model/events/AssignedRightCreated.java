package org.apds.model.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.apds.model.rights.AssignedRight;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class AssignedRightCreated implements Event<AssignedRight>, Serializable {

    private String id;
    private Instant timestamp;
    private String eventType = "AssignedRightCreated";
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private AssignedRight payload = null;
    private String origin = "";


    public AssignedRightCreated() {
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

    public AssignedRight getPayload() {
        return payload;
    }
    public String getOrigin() { return origin;}

    public void setPayload( AssignedRight payload) {
        this.payload = payload;
    }
    public void setOrigin( String origin) { this.origin = origin;}


    public static AssignedRightCreated withPayload( AssignedRight payload) {
        AssignedRightCreated event = new AssignedRightCreated();
        event.setPayload( payload);
        return event;
    }

    public AssignedRightCreated from( String origin) {
        this.origin = origin;
        return this;
    }
}
