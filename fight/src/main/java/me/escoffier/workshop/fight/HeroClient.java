package me.escoffier.workshop.fight;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import fight.src.main.java.me.escoffier.workshop.hero.Hero;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;


@RegisterRestClient(configKey = "hero")
public interface HeroClient {
    

    @Fallback(fallbackMethod = "getFallbackHero")
    @Path("/heroes/random")
    @GET
    Hero findRandom();



    //VALUES (nextval('hibernate_sequence'), 'Buffy', 'Buffy Anne Summers', 'https://www.superherodb.com/pictures2/portraits/10/050/10430.jpg', 
    //'Accelerated Healing, Agility, Danger Sense, Durability, Enhanced Memory, Psionic Powers, Reflexes, Stamina, Stealth, Super Speed, Super Strength, Vision - Telescopic', 6);


    default Hero getFallbackHero() {
        Hero h = new Hero();
        h.name="Buffy";
        h.otherName="Buffy Anne Summers";
        h.level=6;
        h.picture="https://www.superherodb.com/pictures2/portraits/10/050/10430.jpg";
        h.powers="Accelerated Healing, Agility, Danger Sense, Durability, Enhanced Memory, Psionic Powers, Reflexes, Stamina, Stealth, Super Speed, Super Strength, Vision - Telescopic";
        return h;
    }
}
