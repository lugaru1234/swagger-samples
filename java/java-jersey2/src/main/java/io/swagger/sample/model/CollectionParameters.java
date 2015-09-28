package io.swagger.sample.model;

import javax.ws.rs.QueryParam;

public class CollectionParameters {
    @QueryParam(value="sort")
    public String sort;

    @QueryParam(value="excluded")
    public String excluded;

    @QueryParam(value="included")
    public String included;
}
