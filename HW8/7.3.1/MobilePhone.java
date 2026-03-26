public class MobilePhone {
    private int charge = 0;
    private Charger charger;

    public void pluginCharger(Charger charger) { this.charger = charger; }
    public void unplugCharger() { this.charger = null; }
    public int getChargingPercent() { return charge; }

    public void charge(int time) {
        if (charger != null) {
            charge = Math.min(100, charge + (int)(charger.getVoltage() * charger.getCurrent() * (time/10.0f)));
        }
    }
}
