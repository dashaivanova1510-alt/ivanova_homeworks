import java.util.*;


class Equation {
    protected double[] coeffs;

    public Equation(double... coeffs) {
        this.coeffs = coeffs;
    }


    public List<Double> solve() {
        double b = coeffs[0];
        double c = coeffs[1];

        if (b == 0) {
            if (c == 0) return null; 
            else return Collections.emptyList(); 
        }
        return Collections.singletonList(-c / b);
    }

    public String toStringCoeffs() {
        return Arrays.toString(coeffs);
    }
}


class QuadraticEquation extends Equation {
    public QuadraticEquation(double... coeffs) {
        super(coeffs);
    }

    @Override
    public List<Double> solve() {
        double a = coeffs[0];
        double b = coeffs[1];
        double c = coeffs[2];

        if (a == 0) {
            return new Equation(b, c).solve();
        }

        double d = b * b - 4 * a * c;
        if (d < 0) return Collections.emptyList();
        
        Set<Double> roots = new TreeSet<>(); 
        if (d == 0) {
            roots.add(-b / (2 * a));
        } else {
            roots.add((-b + Math.sqrt(d)) / (2 * a));
            roots.add((-b - Math.sqrt(d)) / (2 * a));
        }
        return new ArrayList<>(roots);
    }
}



class BiQuadraticEquation extends Equation {
    public BiQuadraticEquation(double... coeffs) {
        super(coeffs);
    }

    @Override
    public List<Double> solve() {
        double a = coeffs[0];
        double b = coeffs[2]; 
        double c = coeffs[4]; 

        if (a == 0) {
           
            if (b == 0) {
                if (c == 0) return null;
                return Collections.emptyList();
            }
            double x2 = -c / b;
            if (x2 < 0) return Collections.emptyList();
            if (x2 == 0) return Collections.singletonList(0.0);
            return Arrays.asList(Math.sqrt(x2), -Math.sqrt(x2));
        }

        
        QuadraticEquation tempQuad = new QuadraticEquation(a, b, c);
        List<Double> yRoots = tempQuad.solve();

        if (yRoots == null) return null;

        Set<Double> xRoots = new TreeSet<>();
        for (double y : yRoots) {
            if (y > 0) {
                xRoots.add(Math.sqrt(y));
                xRoots.add(-Math.sqrt(y));
            } else if (y == 0) {
                xRoots.add(0.0);
            }
        }
        return new ArrayList<>(xRoots);
    }
}
