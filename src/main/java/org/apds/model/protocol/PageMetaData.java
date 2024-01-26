package org.apds.model.protocol;

import org.apds.model.common.Mapper;

import java.time.Instant;

public class PageMetaData {

    public Long referenceInstant;
    public int offset;
    public int pageSize;
    public int total;

    public PageMetaData() {
        this( 0, 100, 0);
    }

    public PageMetaData( int offset, int pageSize, int total) {
        this.referenceInstant = Instant.now().getEpochSecond();
        this.offset = offset;
        this.pageSize = pageSize;
        this.total = total;
    }

    public PageMetaData withTotalOf( int total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public Long getReferenceInstant() { return referenceInstant;}
    public int getOffset() { return offset;}
    public int getPageSize() { return pageSize;}
    public int getTotal() { return total;}
}