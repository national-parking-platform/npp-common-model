package org.apds.model.place.contacts;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apds.model.common.Mapper;
import org.apds.model.common.VersionedIdentity;

import java.time.Instant;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class Organisation extends VersionedIdentity {

    private String name;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String shortName;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String tradingName;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Instant validFromDate;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private Instant validToDate;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String linkToGeneralInformation;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String linkToLogo;

    public Organisation( String name) {
        super(UUID.randomUUID().toString(), 1);
        this.name = name;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }
}
