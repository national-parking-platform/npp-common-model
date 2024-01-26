package org.apds.model.observation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;
import org.apds.model.common.MultilingualString;
import org.apds.model.common.VehicleAncilliaryIdentification;
import org.apds.model.common.VersionedIdentity;
import org.apds.model.enums.CredentialType;
import org.apds.model.enums.ObservationType;

import java.time.Instant;
import java.util.List;

public class ObservationElement extends VersionedIdentity  {

    // VersionedIdentity.id
    // VersionedIdentity.version

    private ObservationType method;
    private String observer;
    private CredentialType type;
    private String observedCredentialId;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    private Instant observationStartTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant observationEndTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant creationDateTime;

    private MultilingualString description;
    private VehicleAncilliaryIdentification vehicleAncilliaryIdentification;
    private VersionedIdentity hierarchyElement;
    private Location location;
    private List<Image> images;

    public ObservationElement() {}

    public Instant getObservationStartTime() { return observationStartTime;}
    public Instant getObservationEndTime() { return observationEndTime;}
    public ObservationType getMethod() { return method;}
    public String getObserver() { return observer;}
    public CredentialType getType() { return type;}
    public String getObservedCredentialId() { return observedCredentialId;}
    public MultilingualString getDescription() { return description;}
    public Instant getCreationDateTime() { return creationDateTime;}
    public VehicleAncilliaryIdentification getVehicleAncilliaryIdentification() { return vehicleAncilliaryIdentification;}
    public VersionedIdentity getHierarchyElement() { return hierarchyElement;}
    public Location getLocation() { return location;}
    public List<Image> getImages() { return images;}


    public void setMethod( ObservationType method) {
        this.method = method;
    }

    public void setObserver( String observer) {
        this.observer = observer;
    }

    public void setType( CredentialType type) {
        this.type = type;
    }

    public void setObservationStartTime( Instant observationStartTime) {
        this.observationStartTime = observationStartTime;
    }

    public void setObservationEndTime( Instant observationEndTime) {
        this.observationEndTime = observationEndTime;
    }

    public void setDescription( MultilingualString description) {
        this.description = description;
    }

    public void setCreationDateTime( Instant creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public void setVehicleAncilliaryIdentification( VehicleAncilliaryIdentification vehicleAncilliaryIdentification) {
        this.vehicleAncilliaryIdentification = vehicleAncilliaryIdentification;
    }

    public void setHierarchyElement( VersionedIdentity hierarchyElement) {
        this.hierarchyElement = hierarchyElement;
    }

    public void setLocation( Location location) {
        this.location = location;
    }

    public void setObservedCredentialId( String observedCredentialId) {
        this.observedCredentialId = observedCredentialId;
    }

    public void setImages( List<Image> images) {
        this.images = images;
    }
}
