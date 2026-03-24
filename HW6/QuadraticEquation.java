import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation extends Equation {
    protected double a;

    public QuadraticEquation(double a, double b, double c) {
        super(b, c);
        this.a = a;
    }

    @Override
    public List<Double> solve() {
        if (a == 0) return super.solve(); // Якщо a=0, це лінійне рівняння

        List<Double> roots = new ArrayList<>();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            roots.add((-b + Math.sqrt(d)) / (2 * a));
            roots.add((-b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            roots.add(-b / (2 * a));
        }
        return roots;
    }

    @Override
    public QuadraticEquation clone() {
        return (QuadraticEquation) super.clone();
    }

    @Override
    public String toString() {
        return String.format("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
    }
}
