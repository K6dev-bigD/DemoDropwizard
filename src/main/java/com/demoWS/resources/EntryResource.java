package com.demoWS.resources;

import javax.ws.rs.Path;

/**
 * Created by kundankumar on 29/04/17.
 */

@Path("/api.demo.com/v1")
public class EntryResource {


    @Path("/vis/first")
    public FirstResource firstResource(){


        System.out.println("firstresource");
        return new FirstResource();
    }



}
