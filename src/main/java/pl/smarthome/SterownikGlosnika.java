package pl.smarthome;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {
    private StacjaPogodowa pogoda;

    public SterownikGlosnika(StacjaPogodowa pogoda) {
        this.pogoda = pogoda;
    }

    public StacjaPogodowa getPogoda() {
        return pogoda;
    }

    public void setPogoda(StacjaPogodowa pogoda) {
        this.pogoda = pogoda;
    }

    public void powiedzJakaJestPogoda() {
        System.out.println("Dzień dobry. Dzisiejsza temperatura to " + pogoda.getTemp() + "°C i jest "
                + pogoda.getInsolation() + ". To będzie dobry dzień!");

    }
}
