package org.apds.model.rights;

import org.apds.model.common.MultilingualString;
import org.apds.model.common.Reference;
import org.apds.model.enums.CredentialType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = false)
public class CredentialAssigned extends Credential {

    @NotNull
    private Reference identifier;

    @NotNull
    private MultilingualString issuer;

    // Credential.type

    public CredentialAssigned() {
        this(   new Reference( "?", "?"),
                new MultilingualString( "en", "?"),
                CredentialType.licensePlate);
    }

    public CredentialAssigned(
            Reference identifier,
            MultilingualString issuer,
            CredentialType type
    ) {
        this.identifier = identifier;
        this.issuer = issuer;
        this.setType( type);
    }
}
