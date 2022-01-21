package me.escoffier.workshop.supes;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import fight.src.main.java.me.escoffier.workshop.hero.Hero;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@RegisterRestClient(configKey = "hero-client")
public interface HeroClient {
    
    @Path("/hero")
    @GET
    Hero findRandom();

}
