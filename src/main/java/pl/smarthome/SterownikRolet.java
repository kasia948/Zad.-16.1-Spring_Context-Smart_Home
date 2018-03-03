package pl.smarthome;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
    private StacjaPogodowa pogoda;

    public SterownikRolet(StacjaPogodowa pogoda) {
        this.pogoda = pogoda;
    }

    public SterownikRolet() {
    }

    public boolean onOffShutters(StacjaPogodowa pogoda){
        if (pogoda.getInsolation().equals("słonecznie")){
            return true;
        }
        return false;
    }
}
