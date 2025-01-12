package utility;

import core.Item;
import core.Person;

public interface ViewActions {
    public void lookAround();
    public void lookAt (Person person);
    public void lookAtItem(Item item);
}
