public class Transmission implements Cloneable {
    public enum Type { Manual, Automatic }

    Type type;
    int gears;

    public Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public Transmission clone() {
        try {
            return (Transmission) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Transmission [type=" + type + ", gears=" + gears + "]";
    }
}
