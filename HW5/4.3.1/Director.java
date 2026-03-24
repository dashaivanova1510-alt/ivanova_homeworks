public class Director {
    

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
                .setPower(300)
                .setVolume(4.0f)
                .setFuel(Engine.Fuel.Diesel)
                .setTorque(600)
                .build();

        Wheel offroadWheels = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(20)
                .build();

        builder.setType(Car.Type.SUV)
               .setColor(Car.CarColor.Black)
               .setEngine(v8)
               .setWheel(offroadWheels);
    }
}
