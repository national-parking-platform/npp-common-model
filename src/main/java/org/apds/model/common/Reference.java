package org.apds.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class Reference {

    @JsonIgnore
    public static final String DIGITAL_SERVICE_PROVIDER = "DigitalServiceProvider";

    @JsonIgnore
    public static final String UK_NUMBER_PLATE = "UKNumberPlate";

    @JsonIgnore
    public static final String RIGHT_SPECIFICATION = "RightSpecification";

    @JsonIgnore
    public static final String HIERARCHY_ELEMENT = "HierarchyElement";

    @JsonIgnore
    public static final String ASSIGNED_RIGHT = "AssignedRight";

    @JsonIgnore
    public static final String RATE_TABLE = "RateTable";

    private String id;

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String className;

    public Reference( String id, String className) {
        this.id = id;
        this.className = className;
    }

    public Reference( String id) {
        this( id, null);
    }

    public Reference() {
        this( null, null);
    }
}
