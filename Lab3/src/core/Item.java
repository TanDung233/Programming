package core;

import utility.ItemStatus;
import utility.ItemType;

import java.util.Objects;

public class Item {
    protected String name;
    protected ItemType itemType;
    protected Person owner;
    protected float mass;
    protected ItemStatus status;
    protected String color;

    public Item(String name,ItemType itemType, Person owner, float mass, ItemStatus status, String color) {
        this.name = name;
        this.itemType = itemType;
        this.owner = owner;
        this.mass = mass;
        this.status = status;
        this.color = color;
    }
    public Item(String name, Person owner, float mass,ItemStatus status, String color) {
        this.name = name;
        this.itemType = itemType;
        this.owner = owner;
        this.mass = mass;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemTyoe(ItemType itemType) {
        this.itemType = itemType;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void use() {
        this.status = ItemStatus.USED;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return name.equals(item.name) &&
                itemType.equals(item.itemType) &&
                owner.equals(item.owner) &&
                Float.compare(item.mass, mass) == 0 &&
                status == item.status &&
                color.equals(item.color);
    }

    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(name)
                + 9  * Objects.hashCode(itemType)
                + 11 * Objects.hashCode(owner)
                + 13 * Float.hashCode(mass)
                + 15 * Objects.hashCode(status)
                + 17 * Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", itemType=" + itemType +
                ", owner=" + owner.getName() +
                ", mass=" + mass +
                ", status=" + status +
                ", color='" + color + '\'' +
                '}';
    }
}

