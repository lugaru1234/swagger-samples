package io.swagger.sample.exception;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ApiExceptionMapper implements ExceptionMapper<ApiException> {

    @Context
    protected HttpHeaders hh;

    @Override
    public Response toResponse(ApiException e) {

        return Response
                .status(1)
                .entity(e)
                .type(this.hh.getMediaType())
                .build();
    }
}
