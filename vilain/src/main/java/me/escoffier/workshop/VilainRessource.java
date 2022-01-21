package vilain.src.main.java.me.escoffier.workshop;

import org.jboss.logging.Logger;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class VilainRessource {

    @GET
    @Path("/vilain/random")
    public Villain getRandomVilain() {
        Villain vilain = Villain.findRandom();
        return vilain;
    }

    @GET
    @Path("/vilain/tostring")
    public String getVilainString(){
        Villain vilain = Villain.findRandom();
        return vilain.toString();
    }
    
}
