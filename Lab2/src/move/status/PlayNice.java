package move.status;
import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {

    //PlayNice will reduce the target's Attack by 1 level. 
    //This move always hits the target.
    public PlayNice(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,-1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "Use PlayNice";
    }
}
