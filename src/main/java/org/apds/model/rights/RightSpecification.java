package org.apds.model.rights;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;
import org.apds.model.common.Mapper;
import org.apds.model.common.VersionedIdentity;
import org.apds.model.common.VersionedReference;
import org.apds.model.enums.CredentialType;
import org.apds.model.enums.RightType;

import java.time.Instant;
import java.util.List;

public class RightSpecification extends VersionedIdentity  {

    // VersionedIdentity.id
    // VersionedIdentity.version

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant expiry;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Boolean transferable;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String issuer;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private List<VersionedReference> hierarchyElements;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private List<CredentialType> credentials;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private RightType type;

    public RightSpecification( String id, Integer version) {
        this.setId( id);
        this.setVersion( version);
    }

    public RightSpecification() {
        this( null, 1);
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public Instant getExpiry() { return expiry;}
    public void setExpiry( Instant expiry) { this.expiry = expiry;}
    public Boolean getTransferable() { return transferable;}
    public Boolean isTransferable() { return transferable;}
    public void setTransferable( Boolean transferable) { this.transferable = transferable; }
    public List<VersionedReference> getHierarchyElements() { return hierarchyElements;}
    public void setHierarchyElements( List<VersionedReference> hierarchyElements) { this.hierarchyElements = hierarchyElements;}
    public String getIssuer() { return issuer;}
    public void setIssuer( String issuer) { this.issuer = issuer;}
    public void setCredentials( List<CredentialType> credentials) { this.credentials = credentials;}
    public List<CredentialType> getCredentials() { return credentials;}
    public RightType getType() { return type;}
    public void setType( RightType type) { this.type = type;}
}
