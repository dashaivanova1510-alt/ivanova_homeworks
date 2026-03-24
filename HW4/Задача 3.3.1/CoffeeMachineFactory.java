public interface CoffeeMachineFactory {

    Coffee createEspresso();
    Coffee createAmericano();
    Coffee createCappuccino();
    Coffee createLatte();


    double getMachineCost();       
    double getMaintenancePerDay(); 
    String getBrandName();        
}
