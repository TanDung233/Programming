package move.status;
import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove {

    // TeeterDance confuses the target
    public TeeterDance() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "Use TeeterDance";
    }
}
