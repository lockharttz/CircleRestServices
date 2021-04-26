/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXB;
import model.Result;

/**
 * REST Web Service
 *
 * @author Oom
 */
@Path("circum")
public class Circum {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Circum
     */
    public Circum() {
    }

    /**
     * Retrieves representation of an instance of services.Circum
     * @return an instance of java.lang.String
     */
    @GET
     @Path("{radius}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getXml(@PathParam("radius") double radius) {
        double circum =  (2* 3.14)*(radius);
        System.out.print("hellooooooooooooooooooooooooooooooooooooooooooooooooooooooo"+circum);
        StringWriter writer = new StringWriter();
        Result result = new Result();
        result.setCircumference(circum);
        JAXB.marshal(result,writer);
        return writer.toString();
        
    }

    /**
     * PUT method for updating or creating an instance of Circum
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
