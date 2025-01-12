package utility;

public enum SpaceObjectType {
    COMMONSPACE("CommonSpace"),
    WORKSPACE("WorkSpace"),
    RESTINGSPACE("RestingSpace"),
    SANITARYSPACE("SanitarySpace");

    private final String description;

    SpaceObjectType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
