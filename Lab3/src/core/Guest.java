package core;

import utility.GuestActions;
import utility.PersonType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Objects;

public class Guest extends Person implements GuestActions {
    private static final Logger logger = LogManager.getLogger(Guest.class);
    private final PersonType personType = PersonType.GUEST;

    public Guest(String name, int age, String gender, HouseSpace location, double height, double weight, String language){
    super(name, age, gender, location, height, weight, language);
    }

    @Override
    public void putSoap() {
        logger.info(this.name + " laid his soap down next to him.");
    }

    @Override
    public void useSoap(Item item) {
        logger.info("After which " + this.name + " then began to carefully scrub his hands and cheeks with " + item.getName() + ".");
    }

    @Override
    public void saveMoney() {
        logger.info(this.name + " was also very happy to have successfully saved money this way.");
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Guest other = (Guest) otherObject;
        return personType == other.personType;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 23 * Objects.hash(personType);
    }

    @Override
    public String toString() {
        return super.toString() + "[personType=" + personType + "]";
    }
}
