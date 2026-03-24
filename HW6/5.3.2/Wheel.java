public class Wheel implements Cloneable {
    public enum Material { Steel, Alloy, Forged }

    Material material;
    int diameter;

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public Wheel clone() {
        try {
            return (Wheel) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Wheel [material=" + material + ", diameter=" + diameter + "]";
    }
}
