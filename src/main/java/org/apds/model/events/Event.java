package org.apds.model.events;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;

import java.time.Instant;

public interface Event<T> {

    String getId();
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    Instant getTimestamp();
    String getEventType();
    T getPayload();
    String getOrigin();
    void setPayload( T payload);
}
