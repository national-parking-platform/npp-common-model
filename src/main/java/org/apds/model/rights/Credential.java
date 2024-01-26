package org.apds.model.rights;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.enums.CredentialType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import static org.apds.model.enums.CredentialType.licensePlate;

@Data
@EqualsAndHashCode
public class Credential {

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private CredentialType type;

    public Credential() {
        this.type = licensePlate;
    }
}
