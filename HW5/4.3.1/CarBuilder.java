public class CarBuilder {
    private Car.Type type;
    private Car.CarColor color;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder setType(Car.Type type) { this.type = type; return this; }
    public CarBuilder setColor(Car.CarColor color) { this.color = color; return this; }
    public CarBuilder setEngine(Engine engine) { this.engine = engine; return this; }
    public CarBuilder setWheel(Wheel wheel) { this.wheel = wheel; return this; }

    public Car build() {
        return new Car(type, color, engine, wheel);
    }
}
