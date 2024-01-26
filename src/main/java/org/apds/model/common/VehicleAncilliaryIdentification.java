package org.apds.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

public class VehicleAncilliaryIdentification {

    @JsonIgnore
    public static final String DEFAULT_COUNTRY = "GB";

    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String color;
    @NotNull
    private String country;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String make;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String model;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String stateProvince;

    public VehicleAncilliaryIdentification( String country) {
        this.country = country;
    }

    public VehicleAncilliaryIdentification() {
        this( DEFAULT_COUNTRY);
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public String getColor() { return color;}
    public String getCountry() { return country;}
    public String getDescription() { return description;}
    public String getMake() { return make;}
    public String getModel() { return model;}
    public String getStateProvince() { return stateProvince;}

    public void setColor( String color) { this.color = color;}
    public void setCountry( String country) { this.country = country;}
    public void setDescription( String description) { this.description = description;}
    public void setMake( String make) { this.make = make;}
    public void setModel( String model) { this.model = model;}
    public void setStateProvince( String stateProvince) { this.stateProvince = stateProvince;}
}
