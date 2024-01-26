package org.apds.model.common;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.util.Iterator;

public class MultilingualStringDeserializer extends StdDeserializer<MultilingualString> {

    public MultilingualStringDeserializer() {
        this(null);
    }

    public MultilingualStringDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public MultilingualString deserialize(JsonParser jp, DeserializationContext dsContext)
            throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);

        if ( node.isNull()) {
            return null;
        }

        MultilingualString mlString = new MultilingualString();
        for (Iterator<String> it = node.fieldNames(); it.hasNext(); ) {
            String key = it.next();
            String value = node.get( key).asText();
            mlString.addValueForLocale( key, value);
        }
        return mlString;
    }
}
