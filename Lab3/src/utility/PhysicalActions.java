package utility;

import core.Hat;
import core.HouseSpace;

public interface PhysicalActions {
    public void moveTo(HouseSpace newLocation);
    public void pullHat(Hat hat);
}
