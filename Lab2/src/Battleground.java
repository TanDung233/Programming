import ru.ifmo.se.pokemon.*;
import pokemon.*;
public class Battleground {

    public static void main(String[] args){

        Battle b = new ru.ifmo.se.pokemon.Battle();
        Pokemon p1 = new Comfey("Black", 10);
        Pokemon p2 = new Fearow("White",10 );
        Pokemon p3 = new Spearow("Pink", 10);
        Pokemon p4 = new Bounsweet("Yellow", 1);
        Pokemon p5 = new Steenee("Green", 2);
        Pokemon p6 = new Tsareena("Orange", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
