package com.popa.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path( "dating" )
public class DatingResource {

  @GET
  @Produces( MediaType.TEXT_PLAIN )
  public String meet() {
    return "Afra, Ange, Ceri, Dara, Ha, Jun, Sevan";

 }
}
