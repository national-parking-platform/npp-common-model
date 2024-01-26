package org.apds.model.place.road;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.apds.model.common.MultilingualString;

import java.io.Serializable;

public class RoadNode extends Road implements Serializable {

    @JsonInclude( JsonInclude.Include.ALWAYS)
    private MultilingualString junctionName;

    public RoadNode() {}

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }
}
