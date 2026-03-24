import java.util.ArrayList;
import java.util.List;

public class Equation implements Cloneable {
    protected double b, c;
    protected boolean isInfinite = false;

    public Equation(double b, double c) {
        this.b = b;
        this.c = c;
    }

    public List<Double> solve() {
        List<Double> roots = new ArrayList<>();
        if (b == 0) {
            if (c == 0) isInfinite = true;
        } else {
            roots.add(-c / b);
        }
        return roots;
    }

    public boolean isInfinite() {
        return isInfinite;
    }

    @Override
    public Equation clone() {
        try {
            return (Equation) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("%.1fx + %.1f = 0", b, c);
    }
}
