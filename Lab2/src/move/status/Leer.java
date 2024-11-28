package move.status;
import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    //Leer lowers target's Defense by 1 level. 
    //Stat can be reduced by a minimum of -6 levels each time
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
            p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "Use Leer";
    }
}
