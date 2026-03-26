public class AdapterMicroUsbToTypeCInheritance extends Charger implements TypeCCharger {
    
    public AdapterMicroUsbToTypeCInheritance(float voltage, float current) {
        super(voltage, current);
    }

    @Override
    public float getOutputPower() {
        return getVoltage() * getCurrent();
    }
}
