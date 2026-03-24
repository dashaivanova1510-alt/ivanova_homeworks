public class Director {
    

    private static Director instance;


    private Director() {
        System.out.println("Директор прийшов на завод і готовий керувати.");
    }


    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }



    public void constructCitySedan(CarBuilder builder) {
        Engine cityEngine = new EngineBuilder()
                .setPower(90)
                .setVolume(1.2f)
                .setFuel(Engine.Fuel.Petrol)
                .build();
        
        Wheel cityWheels = new WheelBuilder()
                .setMaterial(Wheel.Material.Steel)
                .setDiameter(15)
                .build();

        builder.setType(Car.Type.Sedan)
               .setColor(Car.CarColor.White)
               .setEngine(cityEngine)
               .setWheel(cityWheels);
    }

    public void constructPowerfulSUV(CarBuilder builder) {
        Engine v8 = new EngineBuilder()
                .setPowe
