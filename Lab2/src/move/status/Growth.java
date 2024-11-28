package move.status;
import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {

    //Growth increases the user's Attack and Special Attack by one level.
    public Growth() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,1);
        p.setMod(Stat.SPECIAL_ATTACK,1);
    }

    @Override
    protected String describe() {
        return "Use Growth";
    }
}
