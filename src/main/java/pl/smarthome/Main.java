package pl.smarthome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StacjaPogodowa stacjaPogodowa = context.getBean(StacjaPogodowa.class);
        stacjaPogodowa.getMessage();
        stacjaPogodowa.getInfo();

        SterownikGlosnika sterownikGlosnika = context.getBean(SterownikGlosnika.class);
        sterownikGlosnika.powiedzJakaJestPogoda();

        SterownikPieca sterownikPieca = context.getBean(SterownikPieca.class);
        if(sterownikPieca.onOffHeating(stacjaPogodowa)){
            System.out.println("Jest zimno, piec uruchomiony");
        }else{
            System.out.println("Jest ciepło, nie uruchamiam pieca");
        }

        SterownikRolet sterownikRolet=context.getBean(SterownikRolet.class);
        if(sterownikRolet.onOffShutters(stacjaPogodowa)){
            System.out.println("Jest słonecznie, zasłaniam rolety");
        }else {
            System.out.println("Jest pochmurnie, odsłaniam rolety");
        }
    }
}
