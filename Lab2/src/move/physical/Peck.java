package move.physical;
import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove {

    // Peck deals damage but has no additional effects
    public Peck(){
        super(Type.FLYING,35,100);
    }

    @Override
    protected String describe() {
        return "Use Peck";
    }
}
