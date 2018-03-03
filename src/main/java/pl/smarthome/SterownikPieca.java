package pl.smarthome;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    private StacjaPogodowa pogoda;

    public SterownikPieca() {
    }

    public SterownikPieca(StacjaPogodowa pogoda) {
        this.pogoda = pogoda;
    }

    public boolean onOffHeating(StacjaPogodowa pogoda) {
        if (pogoda.getTemp() < 15) {
            return true;
        }
        return false;
    }
}


