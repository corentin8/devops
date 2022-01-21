package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;

@RegisterRestClient(configKey = "vilain")
public interface VilainClient {

    @Path("/vilain/random")
    @GET
    Villain findRandom();
    
}
