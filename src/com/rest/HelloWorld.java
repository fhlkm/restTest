package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloWorld")
public class HelloWorld {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		String ret = "Hello World!";
		return ret;
	}
}
