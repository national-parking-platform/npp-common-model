package org.apds.model.common;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeParseException;

public class CustomInstantDeserializer extends StdDeserializer<Instant> {

    private static final String DEFAULT_TIME = "00:00:00";
    private static final String DEFAULT_SECONDS = ":00";
    private static final String DEFAULT_TIMEZONE = "Z";
    private static final String DATE_TIME_SEPARATOR = "T";
    private static final int DATE_ONLY_LENGTH = 10;
    private static final int DEFAULT_TIME_LENGTH = 8;
    private static final int TIME_WITHOUT_SECONDS_LENGTH = 5;

    CustomInstantDeserializer() {
        this( null);
    }

    CustomInstantDeserializer( Class<?> vc) {
        super(vc);
    }

    @Override
    public Instant deserialize(JsonParser jp, DeserializationContext dsContext)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);

        if ( node.isNull()) {
            return null;
        }

        String value = node.textValue();
        if ( value == null) {
            return null;
        }

        try {
            return  Instant.parse( value);
        } catch ( DateTimeParseException ignore) {}

        return presumptiveInstant( value);
    }

    private Instant presumptiveInstant( String dateTimeString) {

        String completed = dateTimeString.replaceFirst( " ", DATE_TIME_SEPARATOR);
        try {
            return Instant.parse( completed);
        } catch ( DateTimeParseException ignore) {}

        if (dateOnly(completed)) {
            completed += DATE_TIME_SEPARATOR + DEFAULT_TIME + DEFAULT_TIMEZONE;
        } else {
            int timeLength = timePortionLength( completed);
            if (  timeLength < DEFAULT_TIME_LENGTH) {
                if ( completed.length() >= DATE_ONLY_LENGTH + 1 + TIME_WITHOUT_SECONDS_LENGTH) {
                    completed = completed.substring(0, DATE_ONLY_LENGTH + 1 + TIME_WITHOUT_SECONDS_LENGTH) + DEFAULT_SECONDS + DEFAULT_TIMEZONE;
                } else {
                    return null;
                }
            } else {
                completed = completed.substring( 0, DATE_ONLY_LENGTH + 1 + DEFAULT_TIME_LENGTH) + DEFAULT_TIMEZONE;
            }
        }
        try {
            return Instant.parse( completed);
        } catch ( DateTimeParseException ignore) {}

        return null;
    }

    private boolean dateOnly( String dateString) {
        return dateString.length() == DATE_ONLY_LENGTH;
    }

    private int timePortionLength( String dateTimeString) {
        if ( dateTimeString != null && dateTimeString.length() > DATE_ONLY_LENGTH) {
            return dateTimeString.length() - DATE_ONLY_LENGTH;
        }
        return 0;
    }
}
