package pl.smarthome;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class StacjaPogodowa {
    private int temp;
    private String insolation;

    public StacjaPogodowa(int temp, String insolation) {
        this.temp = temp;
        this.insolation = insolation;
    }


    public StacjaPogodowa getInfo() {
        StacjaPogodowa pogoda = new StacjaPogodowa();
        Random generator = new Random();
        temp = generator.nextInt(61)-25;
        if (generator.nextBoolean()) {
            insolation = "słonecznie";
        }else {
            insolation="pochmurnie";
        }
        return pogoda;
    }

    public StacjaPogodowa() {
    }

    public void getMessage() {
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze");
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getInsolation() {
        return insolation;
    }

    public void setInsolation(String insolation) {
        this.insolation = insolation;
    }
}
