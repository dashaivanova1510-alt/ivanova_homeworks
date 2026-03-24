public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        double totalProfit = 0;

        CoffeeType[] orders = {
            CoffeeType.ESPRESSO, 
            CoffeeType.LATTE, 
            CoffeeType.CAPPUCCINO, 
            CoffeeType.FLAT_WHITE, 
            CoffeeType.AMERICANO,
            CoffeeType.LATTE
        };

        System.out.println("--- Кав'ярня в ТРЦ MechMat Mall працює ---");

        for (CoffeeType orderType : orders) {
            Coffee coffee = factory.createCoffee(orderType);
            double profitFromCup = coffee.getProfit();
            totalProfit += profitFromCup;
            
            System.out.printf("Продано: %s | Прибуток: %.2f грн\n", 
                               coffee.getName(), profitFromCup);
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Загальний прибуток за зміну: %.2f грн\n", totalProfit);
    }
}
