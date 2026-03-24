public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        // Директор каже зібрати SUV
        director.constructPowerfulSUV(builder);
        Car myCar = builder.build();

        System.out.println("--- Машина від Директора ---");
        System.out.println(myCar);

        // Або збираємо самі вручну (теж через білдер)
        Car customCar = new CarBuilder()
                .setType(Car.Type.Hatchback)
                .setColor(Car.CarColor.Red)
                .setEngine(new EngineBuilder().setPower(150).setFuel(Engine.Fuel.Electric).build())
                .setWheel(new WheelBuilder().setDiameter(17).build())
                .build();

        System.out.println("Кастомна машина");
        System.out.println(customCar);
    }
}
