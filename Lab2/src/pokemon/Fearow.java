package pokemon;
import move.physical.DrillRun;
import move.physical.Peck;
import move.status.Growl;
import move.status.Leer;
import ru.ifmo.se.pokemon.Type;

public class Fearow extends Spearow{

    public Fearow(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL,Type.FLYING);
        this.setStats(65,90,65,61,61,100);
        this.setMove(
                new Growl(),
                new Leer(),
                new Peck(),
                new DrillRun()
        );
    }
}
