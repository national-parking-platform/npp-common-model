package org.apds.model.sessions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;
import org.apds.model.common.Mapper;
import org.apds.model.common.MultilingualString;
import org.apds.model.common.VersionedReference;

import java.time.Instant;

public class FinancialTransaction {

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant dateCollected;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private VersionedReference rateLineId;
    private Double segmentValue;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private MultilingualString serviceProvider;
    private Boolean taxIncluded = true;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String transactionId;

    public FinancialTransaction( Double segmentValue, MultilingualString serviceProvider, Boolean taxIncluded) {
        this.segmentValue = segmentValue;
        this.serviceProvider = serviceProvider;
        this.taxIncluded = taxIncluded;
    }
    public FinancialTransaction() {
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public Instant getDateCollected() { return dateCollected;}
    public VersionedReference getRateLineId() { return rateLineId;}
    public Double getSegmentValue() { return segmentValue;}
    public MultilingualString getServiceProvider() { return serviceProvider;}
    public Boolean getTaxIncluded() { return taxIncluded;}
    public Boolean isTaxIncluded() { return taxIncluded;}
    public String getTransactionId() { return transactionId;}

    public void setDateCollected( Instant dateCollected) { this.dateCollected = dateCollected;}
    public void setRateLineId( VersionedReference rateLineId) { this.rateLineId = rateLineId;}
    public void setSegmentValue( Double segmentValue) { this.segmentValue = segmentValue;}
    public void setServiceProvider( MultilingualString serviceProvider) { this.serviceProvider = serviceProvider;}
    public void setTaxIncluded( Boolean taxIncluded) { this.taxIncluded = taxIncluded;}
    public void setTransactionId( String transactionId) { this.transactionId = transactionId;}
}
