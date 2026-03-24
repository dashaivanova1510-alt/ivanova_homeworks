public class Engine implements Cloneable {
    public enum Fuel { Petrol, Diesel, Electric }

    int power;
    float volume;
    Fuel fuel;

    public Engine(int power, float volume, Fuel fuel) {
        this.power = power;
        this.volume = volume;
        this.fuel = fuel;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Engine [power=" + power + ", volume=" + volume + ", fuel=" + fuel + "]";
    }
}
