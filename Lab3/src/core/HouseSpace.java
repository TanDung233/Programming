package core;
import utility.LightingStatus;
import utility.LightingTypeStatus;
import utility.SpaceObjectType;

import java.util.Objects;

public class HouseSpace {
    protected  String name;
    protected SpaceObjectType objectType;
    protected  double area;
    protected  double temperature;
    protected  int floor;
    protected LightingTypeStatus lightingType;
    protected LightingStatus lightingStatus;

    public HouseSpace(String name, int area, double temperature, int floor) {
        this.name = name;
        this.area = area;
        this.temperature = temperature;
        this.floor = floor;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HouseSpace houseSpacet = (HouseSpace) obj;
        return name.equals(houseSpacet.name) &&
                Double.compare(houseSpacet.area, area) == 0 &&
                Double.compare(houseSpacet.temperature, temperature) == 0 &&
                floor == houseSpacet.floor;
    }

    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(name)
                + 13 * Double.hashCode(area)
                + 15 * Double.hashCode(temperature)
                + 17 * floor;
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", temperature=" + temperature +
                ", floor=" + floor +
                '}';
    }
}
