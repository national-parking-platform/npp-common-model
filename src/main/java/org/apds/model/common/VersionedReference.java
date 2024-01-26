package org.apds.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class VersionedReference implements Serializable {

    private String id;

    private Integer version;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String className;

    public VersionedReference() {
        this( null, null, null);
    }

    public VersionedReference( String id, Integer version, String className) {
        this.id = id;
        this.version = version;
        this.className = className;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public String getId() { return id;}
    public String getClassName() { return className;}
    public Integer getVersion() { return version;}

    public void setVersion( Integer version) { this.version = version;}
    public void setId( String id) { this.id = id;}
    public void setClassName( String className) { this.className = className;}
}
