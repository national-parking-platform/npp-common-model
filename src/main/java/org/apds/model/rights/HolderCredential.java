package org.apds.model.rights;

import org.apds.model.common.MultilingualString;
import org.apds.model.common.Reference;
import org.apds.model.enums.CredentialType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class HolderCredential extends CredentialAssigned {

    // CredentialAssigned.identifier
    // CredentialAssigned.issuer
    // CredentialAssigned.Credential.type

    public HolderCredential(Reference identifier, MultilingualString issuer, CredentialType type) {
        super();
        setIdentifier( identifier);
        setIssuer( issuer);
        setType( type);
    }
}
