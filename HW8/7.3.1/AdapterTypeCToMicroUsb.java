public class AdapterTypeCToMicroUsb extends Charger {
    public AdapterTypeCToMicroUsb(TypeCCharger fastCharge) {
        super(5.0f, fastCharge.getOutputPower() / 5.0f);
    }
}
