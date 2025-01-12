package core;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utility.LightingStatus;
import utility.LightingTypeStatus;
import utility.SpaceObjectType;

import java.util.Objects;

public class SanitarySpace extends HouseSpace {
    private static final Logger logger = LogManager.getLogger(SanitarySpace.class);
    private final SpaceObjectType objectType = SpaceObjectType.SANITARYSPACE;
    private final LightingTypeStatus lightingTypeStatus = LightingTypeStatus.FLUORESCENT;
    protected LightingStatus lightingStatus = LightingStatus.ON;
    private String colorTheme;

    public SanitarySpace(String name, int area, double temperature, int floor, String colorTheme) {
        super(name, area, temperature, floor);
        this.colorTheme = colorTheme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public LightingStatus getLightingStatus(){
        return lightingStatus;
    }

    public void setLightingStatus(LightingStatus lightingStatus){
        this.lightingStatus = lightingStatus;
    }

    public String getColorTheme() {
        return colorTheme;
    }

    public void setColorTheme(String colorTheme) {
        this.colorTheme = colorTheme;
    }

    public void status() {
        logger.info(this.name + " space is being cleaned. Color theme: " + colorTheme);
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        SanitarySpace other = (SanitarySpace) otherObject;
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

