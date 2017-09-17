package com.demoWS.customExceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kundankumar on 29/04/17.
 */
public class NotFoundException extends WebApplicationException {

    public NotFoundException(String level, String property){

        super(Response.status(Response.Status.NOT_FOUND).entity("{\"label\":\"Error\",\"message\":\""+level+" "+"\'"+property+"\'not found OR wrong"+level.toLowerCase()+"ID parameter provided.\"}").type(MediaType.TEXT_PLAIN).build());
    }


}
