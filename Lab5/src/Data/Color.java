package Data;

/**
 * Enum Color для хранения цветов
 */
public enum Color {
    GREEN("зелёный"),
    RED("красный"),
    YELLOW("жёлтый"),
    ORANGE("оранжевый");

    private final String description;

    /**
     * Конструктор для создания константы Color
     *
     * @param description Описание цвета
     */
    private Color(String description) {
        this.description = description;
    }

    /**
     * Получить описание цвета
     *
     * @return Описание цвета
     */
    @Override
    public String toString() {
        return description;
    }
}
