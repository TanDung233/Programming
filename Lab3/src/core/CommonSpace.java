package core;

import utility.LightingStatus;
import utility.LightingTypeStatus;
import utility.SpaceObjectType;

import java.util.Objects;

public class CommonSpace extends HouseSpace {
    private final SpaceObjectType objectType = SpaceObjectType.COMMONSPACE;
    private final LightingTypeStatus lightingTypeStatus = LightingTypeStatus.LED;
    protected   LightingStatus lightingStatus = LightingStatus.ON;
    private String airQuality;

    public CommonSpace(String name,int area, double temperature, int floor, String airQuality ) {
        super(name, area, temperature, floor);
        this.airQuality = airQuality;
    }

    public String getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(String airQuality) {
        this.airQuality = airQuality;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        CommonSpace other = (CommonSpace) otherObject;
        return otherObject == other.objectType;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * Objects.hash(objectType)
                + 19 * Objects.hash(lightingTypeStatus)
                + 21 * Objects.hash(lightingStatus);
    }

    @Override
    public String toString() {
        return super.toString() + "[objectType=" + objectType + "]"
         + "[lightingType=" + lightingType + "]"
         + "[lightingStatus=" + lightingStatus + "]";
    }
}


