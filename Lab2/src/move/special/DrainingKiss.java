package move.special;
import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove {

    // DrainingKiss deals damage and the user recovers 75% of the health drained.
    public DrainingKiss() {
        super(Type.FAIRY, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (this.power*0.75));
    }

    @Override
    protected String describe(){
        return "Use SpecialMove - Draining Kiss";
    }
}
