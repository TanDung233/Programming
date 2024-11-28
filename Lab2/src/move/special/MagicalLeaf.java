package move.special;
import ru.ifmo.se.pokemon.*;

public class MagicalLeaf extends SpecialMove{

    // The Magic Leaf deals damage and ignores changes to Accuracy and Evasion.
    // Does not attack Pokémon during the invulnerability phase of Bounce, Dig, Dive, Fly, Phantom Force, Shadow Force
    // or Sky Drop.
    public MagicalLeaf(){
        super(Type.GRASS, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe(){
        return "Use SpecialMove - Magical Leaf";
    }
}
