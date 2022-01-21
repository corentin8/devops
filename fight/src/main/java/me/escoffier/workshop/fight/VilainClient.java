package me.escoffier.workshop.fight;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import fight.src.main.java.me.escoffier.workshop.vilain.Villain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;

@RegisterRestClient(configKey = "vilain")
public interface VilainClient {

    @Fallback(fallbackMethod = "getFallbackVilain")
    @Path("/vilain/random")
    @GET
    Villain findRandom();


    default Villain getFallbackVilain() {
        Villain v = new Villain();
        v.name="Blackwing";
        v.otherName="Joseph Manfredi";
        v.level=3;
        v.picture="https://www.superherodb.com/pictures2/portraits/10/050/249.jpg";
        v.powers="Flight, Telepathy";
        return v;
    }

}
