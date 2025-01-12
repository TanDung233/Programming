package utility;

public enum LightingStatus {
    ON("The light on"),
    OFF("The light off");

    private final String description;

    LightingStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}