package com.popa.jersey;

import java.net.URI;

import javax.swing.JOptionPane;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer;

public class HttpServerMain {

	public static void main(String[] args) {
		ResourceConfig rc = new ResourceConfig().packages( "com.popa.jersey" );
		 HttpServer server = JdkHttpServerFactory.createHttpServer( 
		    URI.create( "http://localhost:8080/api" ), rc );
		 
		 Client client = ClientBuilder.newClient();
		 WebTarget target = client.target( "http://localhost:8080/api" );
		 WebTarget resourceTarget = target.path( "dating" );
		 Invocation.Builder request = resourceTarget.request( MediaType.TEXT_PLAIN );
		 Response response = request.get();
		 System.out.println( response.readEntity( String.class ) );
		 
		 JOptionPane.showMessageDialog( null, "Ende" );
		 
		 
		
		 
		 server.stop( 0 );

	}

}
