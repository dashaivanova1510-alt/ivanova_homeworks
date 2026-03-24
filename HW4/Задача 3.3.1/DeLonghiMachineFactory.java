public class DeLonghiMachineFactory implements CoffeeMachineFactory {
    @Override
    public Coffee createEspresso() { return new Espresso(9.0, 40.0); }
    @Override
    public Coffee createAmericano() { return new Americano(11.0, 45.0); }
    @Override
    public Coffee createCappuccino() { return new Cappuccino(14.0, 55.0); }
    @Override
    public Coffee createLatte() { return new Latte(16.0, 60.0); }

    @Override
    public double getMachineCost() { return 20000.0; } // Дорожча
    @Override
    public double getMaintenancePerDay() { return 15.0; }
    @Override
    public String getBrandName() { return "DeLonghi"; }
}
