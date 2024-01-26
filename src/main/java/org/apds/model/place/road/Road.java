package org.apds.model.place.road;

import org.apds.model.common.Mapper;
import org.apds.model.common.MultilingualString;
import org.apds.model.enums.RoadTypeEnum;

import java.io.Serializable;
import java.util.List;

public class Road implements Serializable {

    private MultilingualString nameOfRoad;
    private List<MultilingualString> roadDestination;
    private MultilingualString roadIdentifier;
    List<MultilingualString> roadOrigination;
    private RoadTypeEnum typeOfRoad;

    public Road() {}

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }
}
