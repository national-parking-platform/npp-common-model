package org.apds.model.common;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.*;

@JsonSerialize(using = MultilingualStringSerializer.class)
@JsonDeserialize(using = MultilingualStringDeserializer.class)
public class MultilingualString implements Serializable {

    private Map<String,String> localizedValues;

    public MultilingualString( String... valueList) {

        localizedValues = new HashMap<>();
        String[] values = valueList.clone();
        for ( int i=0; i < values.length;) {
            String key = values[i++];
            String value = values[i++];
            localizedValues.put( key, value);
        }
    }

    public MultilingualString( String value) {
        this( "en", value);
    }

    @JsonIgnore
    public String getValueForLocale( String locale) {
        if ( localizedValues != null) {
            return localizedValues.get( locale);
        }
        return null;
    }

    @JsonIgnore
    public List<String> getAvailableLocales() {
        List<String> locales = new ArrayList<>();
        if ( localizedValues != null) {
            locales.addAll(localizedValues.keySet());
        }
        return locales;
    }

    @Override
    public String toString() {
        if ( localizedValues != null) {
            String stringRepresentation = "{";
            int numberOfKeys = localizedValues.size();
            int recNo = 0;
            for ( String key : localizedValues.keySet()) {
                stringRepresentation += "\"" + key + "\":\"" + localizedValues.get(key) + "\"";
                recNo++;
                if ( recNo < numberOfKeys) {
                    stringRepresentation += ",";
                }
            }
            stringRepresentation += "}";
            return stringRepresentation;
        }
        return "{}";
    }

    @JsonIgnore
    public static MultilingualString fromString( String mlsAsString) {

        if ( mlsAsString == null ||mlsAsString.isEmpty()) {
            return null;
        }

        MultilingualString mlsRepresentation = new MultilingualString();
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode asJson = mapper.readTree(mlsAsString);
            for (Iterator<String> it = asJson.fieldNames(); it.hasNext(); ) {
                String key = it.next();
                String value = asJson.get( key).asText();
                mlsRepresentation.addValueForLocale( key, value);
            }

        } catch ( Exception ignored) {}
        return mlsRepresentation.getLocalizedValues().size() > 0 ? mlsRepresentation : null;
    }

    public Map<String,String> getLocalizedValues() { return localizedValues;}

    @JsonIgnore
    public MultilingualString addValueForLocale( String locale, String value) {
        localizedValues.put( locale, value);
        return this;
    }
}
