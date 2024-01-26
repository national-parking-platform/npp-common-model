package org.apds.model.protocol;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apds.model.common.Mapper;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletResponse;

public class ServiceResponse {

    private int code;
    private String status;
    @JsonInclude( JsonInclude.Include.NON_NULL)
    private String message;

    public ServiceResponse() {

    }

    public ServiceResponse( int code, String message, HttpServletResponse response) {
        this.code = code;
        this.status = HttpStatus.valueOf( code).getReasonPhrase();
        this.message = message;
        response.setStatus( code);
    }

    @Override
    public String toString() {
        return Mapper.mapToJson( this);
    }

    public String getStatus() { return status;}
    public String getMessage() { return message;}
    public int getCode() { return code;}
    public void setStatus( String status) { this.status = status;}
    public void setMessage( String message) { this.message = message;}
    public void setCode( int code) { this.code = code;}
}
