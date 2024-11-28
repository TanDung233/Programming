package pokemon;
import move.physical.Peck;
import move.status.Growl;
import move.status.Leer;
import ru.ifmo.se.pokemon.*;

public class Spearow extends Pokemon{

    public Spearow(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL,Type.FLYING);
        this.setStats(40,60,30,31,31,70);
        this.setMove(
                new Growl(),
                new Leer(),
                new Peck()
        );
    }
}

