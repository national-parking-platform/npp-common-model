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

public class RightSpecificationDeleted implements Event<RightSpecification>, Serializable {

    private String id;

    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant timestamp;
    private String eventType = "RightSpecificationDeleted";
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private RightSpecification payload = null;
    private String origin = "";


    public RightSpecificationDeleted() {
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


    public static RightSpecificationDeleted withPayload( RightSpecification payload) {
        RightSpecificationDeleted event = new RightSpecificationDeleted();
        event.setPayload( payload);
        return event;
    }

    public RightSpecificationDeleted from( String origin) {
        this.origin = origin;
        return this;
    }
}