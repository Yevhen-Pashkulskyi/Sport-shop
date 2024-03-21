import java.security.PrivilegedAction;

public enum Manufacturer {
    ACTIVE_SPORTS("Active sports"),
    SMART_CAPS("Smart caps");
    private final String name;

    Manufacturer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
