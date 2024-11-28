package pokemon;
import move.special.DrainingKiss;
import move.status.Confide;
import move.status.Growth;
import move.status.Swagger;
import ru.ifmo.se.pokemon.*;

public class Comfey extends Pokemon{

    public Comfey(String name, int level){
        super(name, level);
        this.setType(Type.FAIRY);
        this.setStats(51,52,90,82,110,100);
        this.setMove(
                new Swagger(),
                new Growth(),
                new DrainingKiss(),
                new Confide()
        );
    }
}
