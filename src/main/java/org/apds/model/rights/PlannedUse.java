package org.apds.model.rights;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apds.model.common.CustomInstantDeserializer;
import org.apds.model.common.MultilingualString;
import org.apds.model.enums.IssueMethod;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode
public class PlannedUse {

    @NotNull
    @JsonInclude( JsonInclude.Include.ALWAYS)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant startTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant endTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant expiryTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant cancelTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    @JsonFormat( shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="UTC")
    @JsonDeserialize( using = CustomInstantDeserializer.class)
    private Instant issuanceTime;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private IssueMethod issueMethod;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private MultilingualString issuer;

    @JsonInclude( JsonInclude.Include.NON_EMPTY)
    private List<CredentialAssigned> credentialsAssigned;
}
