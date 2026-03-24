import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Equation> equations = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("equations.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                double[] coeffs = Arrays.stream(parts).mapToDouble(Double::parseDouble).toArray();

                if (coeffs.length == 2) {
                    equations.add(new Equation(coeffs[0], coeffs[1]));
                } else if (coeffs.length == 3) {
                    equations.add(new QuadraticEquation(coeffs[0], coeffs[1], coeffs[2]));
                } else if (coeffs.length == 5) {

                    equations.add(new BiQuadraticEquation(coeffs[0], coeffs[2], coeffs[4]));
                }
            }
        } catch (Exception e) {
            System.out.println("Помилка файлу: " + e.getMessage());
        }


        Map<Integer, List<Equation>> results = new HashMap<>();
        for (int i = 0; i <= 4; i++) results.put(i, new ArrayList<>());
        List<Equation> infinite = new ArrayList<>();

        List<Double> allOneRoots = new ArrayList<>();

        for (Equation eq : equations) {
            List<Double> roots = eq.solve();
            if (eq.isInfinite()) {
                infinite.add(eq);
            } else {
                int count = roots.size();
                if (results.containsKey(count)) {
                    results.get(count).add(eq);
                }
                if (count == 1) {
                    allOneRoots.add(roots.get(0));
                }
            }
        }


        results.forEach((count, list) -> System.out.println("Мають " + count + " розв'язків: " + list.size()));
        System.out.println("Нескінченна кількість: " + infinite.size());

        if (!allOneRoots.isEmpty()) {
            Collections.sort(allOneRoots);
            System.out.println("Найменший розв'язок (з тих, де він один): " + allOneRoots.get(0));
            System.out.println("Найбільший розв'язок (з тих, де він один): " + allOneRoots.get(allOneRoots.size() - 1));
        }
    }
}
