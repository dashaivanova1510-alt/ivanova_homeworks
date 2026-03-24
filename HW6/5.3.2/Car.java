public class Car implements Cloneable {
    public enum Type { Sedan, SUV, Hatchback }
    public enum Color { White, Black, Red, Silver }

    private Type type;
    private Color color;
    private Engine engine;
    private Wheel wheel;
    private Transmission transmission;

    public Car(Type type, Color color, Engine engine, Wheel wheel, Transmission transmission) {
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
    }


    public void setColor(Color color) { this.color = color; }
    public void setEngine(Engine engine) { this.engine = engine; }

    @Override
    public Car clone() {
        try {

            Car clonedCar = (Car) super.clone();

            clonedCar.engine = this.engine.clone();
            clonedCar.wheel = this.wheel.clone();
            clonedCar.transmission = this.transmission.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Car:\n Type: " + type + "\n Color: " + color + 
               "\n " + engine + "\n " + wheel + "\n " + transmission + "\n";
    }
}
