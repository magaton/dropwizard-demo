package com.magaton.dropwizard.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created with IntelliJ IDEA.
 * User: agaton
 * Date: 17/06/2013
 */
@Path("/greetings/{name}")
public class HelloWorldResource {

    @GET
    public String getGreeting(@PathParam("name") String name)  {
        return "Hello " + name + "!";
    }


}
