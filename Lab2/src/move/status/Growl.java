package move.status;
import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {

    //Growl reduces the target's Attack by 1 level.
    //Stat can be reduced by a minimum of -6 levels per stat.
    public Growl(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,-1);
    }

    @Override
    protected String describe() {
        return "Use Growl";
    }
}
