import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int days = 60;        // Період N днів
        int cupsPerDay = 40;  // Скільки чашок продаємо в день


        List<CoffeeMachineFactory> factories = new ArrayList<>();
        factories.add(new PhilipsMachineFactory());
        factories.add(new DeLonghiMachineFactory());

        System.out.println("Аналіз прибутковості за " + days + " днів");

        for (CoffeeMachineFactory factory : factories) {
            calculateBusiness(factory, days, cupsPerDay);
            System.out.println("____________________________________");
        }
    }

    public static void calculateBusiness(CoffeeMachineFactory factory, int days, int cupsPerDay) {

        Coffee espresso = factory.createEspresso();
        Coffee americano = factory.createAmericano();
        Coffee cappuccino = factory.createCappuccino();
        Coffee latte = factory.createLatte();

        // Рахуємо середній прибуток з однієї чашки (припустимо, продаємо всіх порівну)
        double avgProfitPerCup = (espresso.getProfitPerCup() + americano.getProfitPerCup() + 
                                  cappuccino.getProfitPerCup() + latte.getProfitPerCup()) / 4;

        double totalRevenue = avgProfitPerCup * cupsPerDay * days;
        double totalMaintenance = factory.getMaintenancePerDay() * days;
        double netProfit = totalRevenue - totalMaintenance - factory.getMachineCost();

        System.out.println("Виробник: " + factory.getBrandName());
        System.out.println("Загальний прибуток з продажів: " + String.format("%.2f", totalRevenue) + " грн.");
        System.out.println("Витрати на обслуговування: " + totalMaintenance + " грн.");
        System.out.println("Вартість кавомашини: " + factory.getMachineCost() + " грн.");
        
        if (netProfit > 0) {
            System.out.println("ЧИСТИЙ ПРИБУТОК: " + String.format("%.2f", netProfit) + " грн.");
        } else {
            System.out.println("ЗБИТОК: " + String.format("%.2f", netProfit) + " грн. (Машина ще не окупилася)");
        }
    }
}
