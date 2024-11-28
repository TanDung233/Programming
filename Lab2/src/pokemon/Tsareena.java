package pokemon;
import move.special.MagicalLeaf;
import move.status.PlayNice;
import move.status.Swagger;
import move.status.TeeterDance;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee{

    public Tsareena(String name, int level){
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(72,120,98,50,98,72);
        this.setMove(
                new TeeterDance(),
                new MagicalLeaf(),
                new PlayNice(),
                new Swagger()
        );
    }
}
