public class Charger {
    private float voltage;
    private float current;

    public Charger(float voltage, float current) {
        this.voltage = voltage;
        this.current = current;
    }

    public float getVoltage() { return voltage; }
    public float getCurrent() { return current; }
}
