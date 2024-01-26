package org.apds.model.sessions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.*;
import org.apds.model.enums.CredentialType;
import org.apds.model.rights.AssignedRight;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Segment extends VersionedIdentity {

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

    private AssignedRight assignedRight;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private VersionedReference space;
    private List<CredentialType> validationType;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Reference validationValue;
    @JsonInclude( JsonInclude.Include.NON_EMPTY)
    private List<FinancialTransaction> financialTransactions;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Long modified;

    public Segment( String id, Integer version) {
        this.setId( id);
        this.setVersion( version);
        this.validationType = new ArrayList<>();
        this.financialTransactions = new ArrayList<>();
    }

    public Segment() {
        this( null, null);
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public Instant getActualStart() { return actualStart;}
    public Instant getActualEnd() { return actualEnd;}
    public AssignedRight getAssignedRight() { return assignedRight;}
    public VersionedReference getSpace() { return space;}
    public List<CredentialType> getValidationType() { return validationType;}
    public Reference getValidationValue() { return validationValue;}
    public List<FinancialTransaction> getFinancialTransactions() { return financialTransactions;}
    public Long getModified() { return modified;}

    public void setActualStart( Instant actualStart) { this.actualStart = actualStart;}
    public void setActualEnd( Instant actualEnd) { this.actualEnd = actualEnd;}
    public void setAssignedRight( AssignedRight assignedRight) { this.assignedRight = assignedRight;}
    public void setSpace( VersionedReference space) { this.space = space;}
    public void setValidationType( List<CredentialType> validationType) { this.validationType = validationType;}
    public void setValidationValue( Reference validationValue) { this.validationValue = validationValue;}
    public void setFinancialTransactions( List<FinancialTransaction> financialTransactions) { this.financialTransactions = financialTransactions;}
    public void addFinancialTransaction( FinancialTransaction financialTransaction) { this.financialTransactions.add( financialTransaction);}
    public void setModified( Long modified) { this.modified = modified;}
}