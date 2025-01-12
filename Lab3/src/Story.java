import core.*;
import utility.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class Story {
    private static final Logger logger = LogManager.getLogger(Story.class);
    public static void main(String[] args) {
        CommonSpace Livingroom = new CommonSpace("LivingRoom", 100, 24.5, 1, "Good");
        SanitarySpace Bathroom = new SanitarySpace("Bathroom",25,30,2,"Black");

        Guest Scooperffield = new Guest("Scooperfield",53,"male", Livingroom, 172,66,"Russian");
        Host Krabs = new Host("Krabs",49,"male",Livingroom,170,70,"Russian");

        Hat hat = new Hat("Hat",Scooperffield,15);

        Item Toothpaste = new Item("Toothpaste",Scooperffield,0.07f, ItemStatus.NEW,"Blue");
        Item Toothbrush = new Item("Toothbrush",Scooperffield,0.05f, ItemStatus.NEW,"Green");
        Item Towel = new Item("Towel",Scooperffield,0.5f, ItemStatus.NEW,"White");
        Item ScooperffieldSoap = new Item("ScooperffieldSoap",Scooperffield,0.2f, ItemStatus.NEW,"White");
        Item KrabsSoap = new Item("KrabsdSoap",Krabs,0.2f, ItemStatus.NEW,"White");
        Item Handkerchief = new Item("Handkerchief",Scooperffield,0.2f, ItemStatus.NEW,"White");
        Item Socks = new Item("Socks",Scooperffield, 0.1f,ItemStatus.NEW,"Brown");
        Item OldNail = new Item("OldNail",Scooperffield, 0.3f,ItemStatus.OLD,"Black");
        Item CopperWire = new Item("CopperWire",Scooperffield, 0.4f,ItemStatus.NEW,"Yellow");

        List<Item> list = List.of(Toothpaste,Toothbrush,Towel,ScooperffieldSoap,Handkerchief,Socks,OldNail,CopperWire);
        List<Item> listHide = List.of(Toothpaste,Toothbrush,Towel,Handkerchief,Socks,OldNail,CopperWire);

        logger.info("Story started !");
        
        Scooperffield.addItems(list,hat);
        Scooperffield.lookAround();
        Krabs.lookAt(Scooperffield);
        Scooperffield.smile();
        Scooperffield.thankTo(Krabs);
        Scooperffield.moveTo(Bathroom);
        Krabs.turnOffLight();
        Scooperffield.turnOnLight();
        Scooperffield.lookAround();
        Scooperffield.pullHat(hat);
        Scooperffield.takeItems(list,hat);
        Scooperffield.hideItem(listHide);
        Scooperffield.lookAtItem(KrabsSoap);
        Scooperffield.compareItem(ScooperffieldSoap, KrabsSoap);
        Scooperffield.putSoap();
        Scooperffield.useSoap(KrabsSoap);
        Scooperffield.saveMoney();

        logger.info("Story closed !");
    }
}
