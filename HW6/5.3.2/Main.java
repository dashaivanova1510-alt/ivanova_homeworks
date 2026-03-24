public class Main {
    public static void main(String[] args) {

        Engine stockEngine = new Engine(150, 2.0f, Engine.Fuel.Petrol);
        Wheel stockWheel = new Wheel(Wheel.Material.Alloy, 17);
        Transmission stockTrans = new Transmission(Transmission.Type.Automatic, 6);

        Car prototypeCar = new Car(Car.Type.Sedan, Car.Color.White, stockEngine, stockWheel, stockTrans);

        System.out.println("--- ОРИГІНАЛ ---");
        System.out.println(prototypeCar);


        Car blackCar = prototypeCar.clone();
        blackCar.setColor(Car.Color.Black); 


        Car sportCar = prototypeCar.clone();
        sportCar.setColor(Car.Color.Red);
        sportCar.setEngine(new Engine(450, 4.4f, Engine.Fuel.Petrol));

        System.out.println("--- КЛОН 1 (Тільки колір змінено) ---");
        System.out.println(blackCar);

        System.out.println("--- КЛОН 2 (Колір та двигун змінено) ---");
        System.out.println(sportCar);
    }
}
