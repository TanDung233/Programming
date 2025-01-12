package core;

import utility.StorageSpace;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Hat extends StorageSpace {
    private String name;
    private Person owner;
    private int capacity;

    public Hat(String name, Person owner, int capacity) {
        this.name = name;
        this.owner = owner;
        this.capacity = capacity;
        this.storageItems = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Item> getHatItems() {
        return storageItems;

    }
    public void setHatItems(List<Item> hatItems) {
        this.storageItems = hatItems;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Hat other = (Hat) otherObject;
        return capacity == other.capacity &&
                Objects.equals(storageItems, other.storageItems) &&
                Objects.equals(name, other.name) &&
                Objects.equals(owner, other.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, capacity, storageItems);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + "]" +
                "[owner=" + owner + "]" +
                "[capacity=" + capacity + "]" +
                "[storageItems=" + storageItems + "]";
    }
}
