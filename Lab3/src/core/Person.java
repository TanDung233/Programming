package core;

import utility.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Objects;

public class Person implements EmotionalActions, ItemActions, PhysicalActions, ViewActions, LightActions {
    private static final Logger logger = LogManager.getLogger(Person.class);
    protected String name;
    protected int age;
    protected String gender;
    protected HouseSpace location;
    protected double height;
    protected double weight;
    protected String language;

    public Person(String name, int age, String gender, HouseSpace location, double height, double weight, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.height = height;
        this.weight = weight;
        this.language = language;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public HouseSpace getLocation() {
        return location;
    }
    public void setLocation(HouseSpace location) {
        this.location = location;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void lookAround() {
        logger.info(this.name + " looked around the " + this.getLocation().getName() +".");
    }

    @Override
    public void lookAt (Person person){
        logger.info(this.name + " looking at to " + person.getName());
    }

    @Override
    public void smile() {
        logger.info(this.name + " put on a semblance of a smile that might as well have been a grimace of disgust.");
    }

    @Override
    public void thankTo(Person person) {
        logger.info(this.name + " thanked " + person.getName() + ".");
    }

    @Override
    public void moveTo(HouseSpace newLocation) {
        logger.info(this.name + " went straight to the " + newLocation.getName());
        setLocation(newLocation);
    }

    @Override
    public void turnOffLight(){
        this.location.setLightingStatus(LightingStatus.OFF);
        logger.info(this.name + " turned OFF the lights in " + this.location.getName());
    }

    @Override
    public void turnOnLight(){
        this.location.setLightingStatus(LightingStatus.ON);
        logger.info(this.name + " turned ON the lights in " + this.location.getName());
    }

    @Override
    public void addItems(List<Item> itemsToAdd, Hat hat) {
        if (hat.getHatItems().size() + itemsToAdd.size() <= hat.getCapacity()) {
            hat.getHatItems().addAll(itemsToAdd);
            logger.info(this.name + " added " + itemsToAdd.size() + " items to the hat.");
        } else {
            logger.info("Not enough capacity in the hat to add all items.");
        }
    }

    @Override
    public void pullHat(Hat hat) {
        logger.info(this.name + " pulled off his top " + hat.getName() + ".");
    }
    @Override
    public void takeItems(List<Item> itemsToTake, Hat hat) {
        logger.info(this.name + " takes out from the hat: ");
        for (Item item : itemsToTake) {
            if (hat.getHatItems().contains(item)) {
                item.use();
                hat.getHatItems().remove(item);
                logger.info(item.getName() + " ");
            } else {
                logger.info("Item " + item.getName() + " is not in the hat.");
            }
        }
    }

    @Override
    public void hideItem(List<Item> items) {
        logger.info("\n" + this.name + " hides in the cupboard: ");
        for (Item item : items) {
            logger.info(item.getName() + " ");
        }
    }

    @Override
    public void lookAtItem(Item item) {
        logger.info("\n" + this.name + " immediately noticed on the shelf next to the sink " + item.getName() + ".");
    }

    @Override
    public void compareItem(Item item1, Item item2) {
        if (item1.getMass() == (item2.getMass())) {
            logger.info(this.name + " found them identical.");
        } else {
            logger.info("The items are different.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;

        return name.equals(person.name) &&
                age == person.age &&
                gender.equals(person.gender) &&
                location.equals(person.location) &&
                Double.compare(person.height, height) == 0 &&
                Double.compare(person.weight, weight) == 0 &&
                language.equals(person.language);
    }

    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(name)
                + 11 * Objects.hashCode(gender)
                + 13 * Objects.hashCode(location)
                + 15 * Double.hashCode(height)
                + 17 * Double.hashCode(weight)
                + 19 * Objects.hashCode(language)
                + 21 * age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", location=" + location.getName() +
                ", height=" + height +
                ", weight=" + weight +
                ", language='" + language +
                '}';
    }
}
