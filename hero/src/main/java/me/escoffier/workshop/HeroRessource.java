package hero.src.main.java.me.escoffier.workshop;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;



@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class HeroRessource {
    
    @GET
    @Path("/heroes/random")
    public Hero getRandomHero() {
        Hero hero = Hero.findRandom();
        return hero;
    }

    @GET
    @Path("/heroes/tostring")
    public String getHeroString(){
        Hero hero = Hero.findRandom();
        return hero.toString();
    }

}
