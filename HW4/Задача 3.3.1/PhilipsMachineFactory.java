public class PhilipsMachineFactory implements CoffeeMachineFactory {
    @Override
    public Coffee createEspresso() { return new Espresso(12.0, 35.0); }
    @Override
    public Coffee createAmericano() { return new Americano(15.0, 40.0); }
    @Override
    public Coffee createCappuccino() { return new Cappuccino(18.0, 50.0); }
    @Override
    public Coffee createLatte() { return new Latte(20.0, 55.0); }

    @Override
    public double getMachineCost() { return 12000.0; } // Дешевша
    @Override
    public double getMaintenancePerDay() { return 25.0; }
    @Override
    public String getBrandName() { return "Philips"; }
}
