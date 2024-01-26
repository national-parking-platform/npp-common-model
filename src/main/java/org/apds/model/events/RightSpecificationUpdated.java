package org.apds.model.events;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;
import org.apds.model.common.Mapper;
import org.apds.model.rights.RightSpecification;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public class RightSpecificationUpdated implements Event<RightSpecification>, Serializable {

    private String id;
    private Instant timestamp;
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private String eventType = "RightSpecificationUpdated";
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private RightSpecification payload = null;
    private String origin = "";


    public RightSpecificationUpdated() {
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

    public RightSpecification getPayload() {
        return payload;
    }
    public String getOrigin() { return origin;}

    public void setPayload( RightSpecification payload) {
        this.payload = payload;
    }
    public void setOrigin( String origin) { this.origin = origin;}


    public static RightSpecificationUpdated withPayload( RightSpecification payload) {
        RightSpecificationUpdated event = new RightSpecificationUpdated();
        event.setPayload( payload);
        return event;
    }

    public RightSpecificationUpdated from( String origin) {
        this.origin = origin;
        return this;
    }
}