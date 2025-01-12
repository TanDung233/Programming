package core;

import utility.PersonType;

import java.util.Objects;

public class Host extends Person  {
    private final PersonType personType = PersonType.HOST;

    public Host(String name, int age, String gender, HouseSpace location, double height, double weight, String language){
        super(name, age, gender, location, height, weight, language);
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Host other = (Host) otherObject;
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
