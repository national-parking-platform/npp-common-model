package org.apds.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.apds.model.common.Reference;
import lombok.Data;

import java.net.URI;
import java.util.List;

@Data
public class EventSubscription {

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String id;

    private String accessToken;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Boolean includeChildrenEvents;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private List<Reference> hierarchyElements;
    private URI endpoint;
    private List<String> topics;

    @JsonIgnore
    public boolean isValid() {
        return endpoint != null && topics != null && topics.size() > 0;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }
}
