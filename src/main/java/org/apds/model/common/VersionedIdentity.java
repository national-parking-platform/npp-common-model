package org.apds.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class VersionedIdentity {

    private String id;

    private Integer version;

    public VersionedIdentity() {
        this.id = "none";
        this.version = 1;
    }
}
