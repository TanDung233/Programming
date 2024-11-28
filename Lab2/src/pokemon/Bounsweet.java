package pokemon;
import move.special.MagicalLeaf;
import move.status.TeeterDance;
import ru.ifmo.se.pokemon.*;

public class Bounsweet extends Pokemon {

    public Bounsweet(String name, int level){
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(42,30,38,30,38,32);
        this.setMove(
                new TeeterDance(),
                new MagicalLeaf()
        );
    }
}
