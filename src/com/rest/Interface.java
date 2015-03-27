package com.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.sun.jersey.spi.resource.Singleton;

@Produces("text/plain")
@Path("customers")
@Singleton
public class Interface {

    @GET
    public String getCustomers(){
    	
        return "getCustomers all";
    }
    @GET  
    @Path("{id}")  
    public String getCustomer(@PathParam("id") String uid) {  
        return "your id is "+ uid;  
    }  
}