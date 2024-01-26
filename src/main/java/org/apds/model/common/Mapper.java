package org.apds.model.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;

public class Mapper {

    private static final Logger log = LoggerFactory.getLogger( Mapper.class);

    public static String mapToJson(Object obj)  {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        try {
            return objectMapper.writeValueAsString(obj);
        } catch ( JsonProcessingException ex) {
            log.debug( "serialisation exception: " + ex.getMessage());
        }
        return "";
    }
    public static  <T> T mapFromJson(String json, Class<T> clazz) {

        if ( json == null || json.isEmpty()) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        try {
            return objectMapper.readValue(json, clazz);
        } catch ( Exception ex) {
            log.debug( "cannot read value when mapping to class {} ({})", clazz.getSimpleName(), ex.getMessage());
        }
        return null;
    }

}
