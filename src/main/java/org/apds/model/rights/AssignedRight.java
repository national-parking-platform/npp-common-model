package org.apds.model.rights;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;
import org.apds.model.common.Mapper;
import org.apds.model.common.Reference;
import org.apds.model.common.VersionedIdentity;
import org.apds.model.enums.IssueMethod;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class AssignedRight extends VersionedIdentity {

    // at a minimum: VersionedIdentity
    // VersionedIdentity.id
    // VersionedIdentity.version

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private RightHolder rightHolder;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private RightSpecification rightSpecification;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant expiry;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant issuanceTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Reference assignedRightIssuer;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Integer instancesAvailable;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Integer instancesUsed;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Double minutesUsed;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Double minutesAvailable;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Double remainingValue;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Integer totalInstances;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Double totalMinutes;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Double totalRightValue;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private IssueMethod issueMethod;

    public AssignedRight() {

    }

    public AssignedRight( String id, Integer version) {
        super.setId( id);
        super.setVersion( version);
    }

    public AssignedRight( RightHolder rightHolder, RightSpecification rightSpecification) {
        super.setId(UUID.randomUUID().toString());
        super.setVersion( 1);
        this.rightHolder = rightHolder;
        this.rightSpecification = rightSpecification;
    }

    public AssignedRight withIdAndVersion( String id, Integer version) {
        this.setId( id);
        this.setVersion( version);
        return this;
    }

    public AssignedRight withExpiry( Instant expiry) {
        this.expiry = expiry;
        return this;
    }

    public AssignedRight withIssuanceTime( Instant issuanceTime) {
        this.issuanceTime = issuanceTime;
        return this;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public void setId( String id) { super.setId( id);}
    public void setVersion( Integer version) {super.setVersion( version);}
    public String getId() { return super.getId();}
    public Integer getVersion() { return super.getVersion();}
}
