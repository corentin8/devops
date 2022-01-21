package me.escoffier.workshop.supes;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import fight.src.main.java.me.escoffier.workshop.vilain.Villain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(configKey = "vilain-client")
public interface VilainClient {

    @Path("/vilain")
    @GET
    Villain findRandom();
    
}
