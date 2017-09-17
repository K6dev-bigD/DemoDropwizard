package com.demoWS.resources;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by kundankumar on 29/04/17.
 */
@Produces(MediaType.APPLICATION_JSON)
public class FirstResource {


    public FirstResource(){

    }

    public Response getFirstResource(){

        return Response.ok("done").build();
    }

}
