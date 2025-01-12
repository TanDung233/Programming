package utility;
import core.Item;

import java.util.List;
import java.util.Objects;

public abstract class StorageSpace {
    protected List<Item> storageItems;

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        StorageSpace other = (StorageSpace) otherObject;
        return Objects.equals(storageItems, other.storageItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageItems);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[storageItems=" + storageItems + "]";
    }
}
