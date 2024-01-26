package org.apds.model.protocol;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;

import java.util.List;

public class PaginatedResult<T> {

    private PageMetaData meta;
    private List<T> data;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private List<String> deleted;

    public PaginatedResult(){}

    public PaginatedResult( List<T> data) {
        this.data = data;
        this.meta = new PageMetaData().withTotalOf( data.size());
    }

    @JsonIgnore
    public PaginatedResult<T> withDeleted( List<String> deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public PageMetaData getMeta() { return meta;}
    public List<T> getData() { return data;}
    public List<String> getDeleted() { return deleted;}
}