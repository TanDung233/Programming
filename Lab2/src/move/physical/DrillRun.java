package move.physical;
import ru.ifmo.se.pokemon.*;

public class DrillRun extends PhysicalMove {

    //Drill Run deals damage and has increased critical strike chance (1⁄8 instead of 1⁄24).
    public DrillRun(){
        super(Type.GROUND,80,95);
    }

    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (Math.random()<0.125){
            return 2.0;
        }else{
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "Use DrillRun";
    }
}
