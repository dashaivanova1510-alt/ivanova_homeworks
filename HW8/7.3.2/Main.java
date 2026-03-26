public class Main {
    public static void main(String[] args) {
        VehicleCalculator carCalc = new CarCalculator();

        Customs customs = new CustomsAdapter(carCalc);

        
        Auto myAuto = new Auto(5, "Audi A4", true, 120000);

        float priceInUah = customs.vehiclePrice(myAuto);
        float taxInUah = customs.tax(myAuto);

        System.out.println("Модель: " + myAuto.model);
        System.out.println("Вартість авто: " + priceInUah + " грн.");
        System.out.println("Мито (20%): " + taxInUah + " грн.");
        System.out.println("Разом до сплати: " + (priceInUah + taxInUah) + " грн.");
    }
}
