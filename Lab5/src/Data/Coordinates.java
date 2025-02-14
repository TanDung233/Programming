package Data;

/**
 * Класс Coordinates для хранения координат
 */
public class Coordinates {
    private Integer x; //Поле не может быть null
    private Double y; //Значение поля должно быть больше -348, Поле не может быть null

    /**
     * Конструктор для создания объекта Coordinates
     *
     * @param x Координата x (не может быть null)
     * @param y Координата y (должна быть больше -348, не может быть null)
     */
    public Coordinates(Integer x, Double y) {
        if (x == null) {
            throw new IllegalArgumentException("Координата x не может быть null.");
        }
        if (y == null || y <= -348) {
            throw new IllegalArgumentException("Координата y должна быть больше -348 и не может быть null.");
        }
        this.x = x;
        this.y = y;
    }

    /**
     * Получить координату x
     *
     * @return Координата x
     */
    public Integer getX() {
        return x;
    }

    /**
     * Установить координату x
     *
     * @param x Координата x (не может быть null)
     */
    public void setX(Integer x) {
        if (x == null) {
            throw new IllegalArgumentException("Координата x не может быть null.");
        }
        this.x = x;
    }

    /**
     * Получить координату y
     *
     * @return Координата y
     */
    public Double getY() {
        return y;
    }

    /**
     * Установить координату y
     *
     * @param y Координата y (должна быть больше -348, не может быть null)
     */
    public void setY(Double y) {
        if (y == null || y <= -348) {
            throw new IllegalArgumentException("Координата y должна быть больше -348 и не может быть null.");
        }
        this.y = y;
    }

    /**
     * Преобразовать координаты в строковое представление
     *
     * @return Строковое представление координат
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
