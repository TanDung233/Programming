package Data;

import java.time.ZonedDateTime;

/**
 * Класс Person
 */
public class Person {
    private static int nextId = 1;
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int height; //Значение поля должно быть больше 0
    private java.time.LocalDateTime birthday; //Поле не может быть null
    private Color eyeColor; //Поле не может быть null
    private Color hairColor; //Поле может быть null
    private Location location; //Поле не может быть null

    public Person() {
        this.id = nextId++;
        this.name = "";
        this.coordinates = new Coordinates(0, 0.0);
        this.creationDate = ZonedDateTime.now();
        this.height = 0;
        this.birthday = java.time.LocalDateTime.now();
        this.eyeColor = null;
        this.hairColor = null;
        this.location = new Location(0, 0.0, 0.0, "");
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Person.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public java.time.LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(java.time.LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Вернуть информацию о человеке в виде строки
     * @return Информация о человеке
     */
    @Override
    public String toString() {
        String info = "";
        info += "Человек № " + id;
        info += " (добавлен " + creationDate.toString() + ")";
        info += "\n Имя: " + name;
        info += "\n Координаты: " + coordinates.toString();
        info += "\n Рост: " + height;
        info += "\n Дата рождения: " + birthday.toString();
        info += "\n Цвет глаз: " + ((eyeColor != null) ? eyeColor.toString() : "null");
        info += "\n Цвет волос: " + ((hairColor != null) ? hairColor.toString() : "null");
        info += "\n Местоположение: " + location.toString();
        info += "\n------------------------------------------------------";
        return info;
    }
}
