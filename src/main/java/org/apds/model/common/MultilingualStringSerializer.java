package org.apds.model.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Map;

public class MultilingualStringSerializer extends StdSerializer<MultilingualString> {

    public MultilingualStringSerializer() {
        this(null);
    }

    public MultilingualStringSerializer(Class<MultilingualString> t) {
        super( t);
    }

    @Override
    public void serialize(MultilingualString multilingualString, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        if ( multilingualString != null && multilingualString.getLocalizedValues().size() > 0) {
            jsonGenerator.writeStartObject();
            Map<String, String> values = multilingualString.getLocalizedValues();
            for (String key : values.keySet()) {
                jsonGenerator.writeStringField(key, values.get(key));
            }
            jsonGenerator.writeEndObject();
        } else {
            jsonGenerator.writeNull();
        }
    }
}
