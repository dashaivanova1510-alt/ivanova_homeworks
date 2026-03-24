import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BiQuadraticEquation extends QuadraticEquation {

    public BiQuadraticEquation(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public List<Double> solve() {
        // Заміна x^2 = t, розв'язуємо at^2 + bt + c = 0
        List<Double> tRoots = super.solve();
        if (this.isInfinite) return new ArrayList<>();

        Set<Double> xRoots = new HashSet<>(); // Використовуємо Set, щоб не було дублікатів (наприклад, для 0)
        for (double t : tRoots) {
            if (t > 0) {
                xRoots.add(Math.sqrt(t));
                xRoots.add(-Math.sqrt(t));
            } else if (t == 0) {
                xRoots.add(0.0);
            }
        }
        List<Double> result = new ArrayList<>(xRoots);
        Collections.sort(result);
        return result;
    }

    @Override
    public BiQuadraticEquation clone() {
        return (BiQuadraticEquation) super.clone();
    }

    @Override
    public String toString() {
        return String.format("%.1fx^4 + %.1fx^2 + %.1f = 0", a, b, c);
    }
}
