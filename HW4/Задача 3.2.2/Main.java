import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int A = 10;       // Автобусів
        final int T = 5;        // Трамваїв
        final int Tr = 40;      // Тролейбусів
        final int N = 200_000;  // Пробіг (км)

        // Список заводів, які беруть участь у тендері
        List<TransportFactory> factories = new ArrayList<>();
        factories.add(new VolvoFactory());
        factories.add(new SkodaFactory());
        factories.add(new HyundaiFactory());

        System.out.println("--- АНАЛІЗ ВИТРАТ ПАРКУ ТРАНСПОРТУ ---");

        for (TransportFactory factory : factories) {
            long totalCost = calculateTotalContract(factory, A, T, Tr, N);
            System.out.printf("Виробник: %-8s | Загальні витрати: %,d грн.%n", 
                               factory.getBrandName(), totalCost);
        }
    }

    public static long calculateTotalContract(TransportFactory factory, int A, int T, int Tr, int N) {
        // Створюємо по одному зразку, щоб дізнатися ціни
        Bus bus = factory.createBus();
        Tram tram = factory.createTram();
        Trolleybus trolley = factory.createTrolleybus();

        // Формула: (Ціна + Експлуатація * Пробіг) * Кількість одиниць
        long busTotal = (bus.getCost() + (long)bus.getUsageCost() * N) * A;
        long tramTotal = (tram.getCost() + (long)tram.getUsageCost() * N) * T;
        long trolleyTotal = (trolley.getCost() + (long)trolley.getUsageCost() * N) * Tr;

        return busTotal + tramTotal + trolleyTotal;
    }
}
