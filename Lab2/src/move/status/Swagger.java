package move.status;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    // Increases the opponent's Attack by 2 levels (2 stages)
    // Confuses the opponent
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "Use Swagger";
    }
}
