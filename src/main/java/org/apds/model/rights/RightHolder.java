package org.apds.model.rights;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@EqualsAndHashCode
public class RightHolder {

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private List<HolderCredential> credentials;

    public RightHolder() {
        this.setCredentials( new ArrayList<>());
    }

    public RightHolder( HolderCredential initialCredential) {
        this.setCredentials( Arrays.asList( initialCredential));
    }

    public RightHolder( List<HolderCredential> credentials) {
        this.credentials = credentials;
    }
}
