public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger(5.0f, 1.0f);

        System.out.println("\n MicroUsb \n");
        MobilePhone phone = new MobilePhone();
        phone.charge(20);
        phone.pluginCharger(charger);
        phone.charge(20);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

        System.out.println("\n Type-C \n");
        FastCharge fastCharge = new FastCharge(18);

        SamsungS samsung = new SamsungS();
        samsung.makeCall();
        samsung.pluginCharger(fastCharge);
        samsung.charge(30);
        samsung.unplugCharger();
        printBatteryStatus(samsung);

        System.out.println("\n Charging throughout adapter (Composition) ");
        TypeCCharger adapter1 = new AdapterMicroUsbToTypeC(charger);
        samsung.pluginCharger(adapter1);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);

        System.out.println("\n Charging throughout adapter (Inheritance) ");
        TypeCCharger adapter2 = new AdapterMicroUsbToTypeCInheritance(5.0f, 2.0f);
        samsung.pluginCharger(adapter2);
        samsung.charge(10);
        samsung.unplugCharger();
        printBatteryStatus(samsung);

        System.out.println("\n Maintaining legacy charging (Reverse Adapter) ");
        phone.pluginCharger(new AdapterTypeCToMicroUsb(fastCharge));
        phone.charge(20);
        System.out.printf("Legacy phone power status = %s%n", phone.getChargingPercent());
    }

    private static void printBatteryStatus(SamsungS phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }
}
