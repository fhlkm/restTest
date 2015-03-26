package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hiCheck")
public class HiCheck {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		String ret = "Hi Check!";
		return ret;
	}
}
