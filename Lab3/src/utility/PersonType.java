package utility;

public enum PersonType {
    GUEST("Guest"),
    HOST("Host");

    private final String description;

    PersonType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
