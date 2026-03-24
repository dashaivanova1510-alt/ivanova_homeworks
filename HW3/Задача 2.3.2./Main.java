import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] files = {"input01.txt", "input02.txt", "input03.txt"};
        for (String fileName : files) {
            processFile(fileName);
        }
    }

    public static void processFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Файл " + fileName + " не знайдено.");
            return;
        }

        System.out.println("\n===== ОБРОБКА ФАЙЛУ: " + fileName + " =====");

        List<Equation> equations = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                
                String[] parts = line.split("\\s+");
                double[] c = new double[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    c[i] = Double.parseDouble(parts[i]);
                }

                if (c.length == 2) {
                    equations.add(new Equation(c));
                } else if (c.length == 3) {
                    equations.add(new QuadraticEquation(c));
                } else if (c.length == 5) {
                    equations.add(new BiQuadraticEquation(c));
                }
            }
        } catch (Exception e) {
            System.out.println("Помилка читання: " + e.getMessage());
        }

        // Статистика
        int noSol = 0, oneSol = 0, twoSol = 0, threeSol = 0, fourSol = 0, infSol = 0;
        Double minRootOne = null;
        Double maxRootOne = null;
        Equation minEq = null;
        Equation maxEq = null;

        for (Equation eq : equations) {
            List<Double> roots = eq.solve();

            if (roots == null) {
                infSol++;
            } else {
                int count = roots.size();
                switch (count) {
                    case 0 -> noSol++;
                    case 1 -> {
                        oneSol++;
                        double r = roots.get(0);
                        if (minRootOne == null || r < minRootOne) {
                            minRootOne = r; minEq = eq;
                        }
                        if (maxRootOne == null || r > maxRootOne) {
                            maxRootOne = r; maxEq = eq;
                        }
                    }
                    case 2 -> twoSol++;
                    case 3 -> threeSol++;
                    case 4 -> fourSol++;
                }
            }
        }

        System.out.println("Не мають розв'язків: " + noSol);
        System.out.println("Мають один розв'язок: " + oneSol);
        System.out.println("Мають два розв'язки: " + twoSol);
        System.out.println("Мають три розв'язки: " + threeSol);
        System.out.println("Мають чотири розв'язки: " + fourSol);
        System.out.println("Мають нескінченну кількість розв'язків: " + infSol);

        if (oneSol > 0) {
            System.out.printf("Найменший розв'язок серед рівнянь з 1 коренем: %.4f (Рівняння: %s)\n", minRootOne, minEq.toStringCoeffs());
            System.out.printf("Найбільший розв'язок серед рівнянь з 1 коренем: %.4f (Рівняння: %s)\n", maxRootOne, maxEq.toStringCoeffs());
        }
    }
}
