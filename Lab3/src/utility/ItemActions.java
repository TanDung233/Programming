package utility;

import core.Hat;
import core.Item;

import java.util.List;

public interface ItemActions {
    public void hideItem(List<Item> items);
    public void compareItem(Item item1, Item item2);
    public void addItems(List<Item> itemsToAdd, Hat hat);
    public void takeItems(List<Item> itemsToTake, Hat hat);
}
