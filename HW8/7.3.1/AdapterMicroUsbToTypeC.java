public class AdapterMicroUsbToTypeC implements TypeCCharger {
    private Charger microUsbCharger;

    public AdapterMicroUsbToTypeC(Charger charger) {
        this.microUsbCharger = charger;
    }

    @Override
    public float getOutputPower() {
        // Потужність = Напруга * Струм
        return microUsbCharger.getVoltage() * microUsbCharger.getCurrent();
    }
}
