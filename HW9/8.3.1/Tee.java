public class Tee extends Beverage {
    public Tee(int sugar, ServingMethod servingMethod) {
        super(sugar, servingMethod);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tea...");
        servingMethod.prepareCup();
        System.out.println("Add hot water. Sugar: " + sugar);
    }

    @Override
    public void drink() {
        System.out.println("Drinking tea " + servingMethod.getServingType() + "!");
    }

    @Override
    public int getBaseCost() {
        return 10;
    }
}
