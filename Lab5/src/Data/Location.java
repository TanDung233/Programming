package Data;

/**
 * Класс Location
 */
public class Location {
    private Integer x; //Поле не может быть null
    private double y;
    private double z;
    private String name; //Строка не может быть пустой, Поле может быть null

    public Location(Integer x, double y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ", Имя: " + name + ")";
    }
}
