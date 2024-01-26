package org.apds.model.sessions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.*;
import org.apds.model.rights.HolderCredential;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Session extends VersionedIdentity {

    // VersionedIdentity.id
    // VersionedIdentity.version

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant actualStart;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant actualEnd;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String initiator;
    private List<HolderCredential> credentials;
    private List<Segment> segments;
    private VersionedReference hierarchyElement;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private VehicleAncilliaryIdentification identifiedVehicle;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Long modified;

    public Session( String id, Integer version) {
        this.setId( id);
        this.setVersion( version);
        this.segments = new ArrayList<>();
    }

    public Session() {
        this( null, null);
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public void addSegment( Segment segment) {
        segments.add( segment);
    }

    public boolean updateSegment( Segment segment) {
        for ( Segment currentSegment : segments) {
            if ( currentSegment.getId().equals( segment.getId())) {
                segments.remove( currentSegment);
                segments.add( segment);
                return true;
            }
        }
        return false;
    }

    public Instant getActualStart() { return actualStart;}
    public Instant getActualEnd() { return actualEnd;}
    public String getInitiator() { return initiator;}
    public List<Segment> getSegments() { return segments;}
    public List<HolderCredential> getCredentials() { return credentials;}
    public VersionedReference getHierarchyElement() { return hierarchyElement;}
    public VehicleAncilliaryIdentification getIdentifiedVehicle() { return identifiedVehicle;}
    public Long getModified() { return modified;}

    public void setActualStart( Instant actualStart) { this.actualStart = actualStart;}
    public void setActualEnd( Instant actualEnd) {this.actualEnd = actualEnd;}
    public void setInitiator( String initiator) { this.initiator = initiator;}
    public void setCredentials(List<HolderCredential> credentials) { this.credentials = credentials;}
    public void setSegments( List<Segment> segments) { this.segments = segments;}
    public void setHierarchyElement( VersionedReference hierarchyElement) { this.hierarchyElement = hierarchyElement;}
    public void setIdentifiedVehicle( VehicleAncilliaryIdentification identifiedVehicle) { this.identifiedVehicle = identifiedVehicle;}
    public void setModified( Long modified) { this.modified = modified;}
}
