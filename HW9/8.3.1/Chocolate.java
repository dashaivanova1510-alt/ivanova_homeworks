public class Chocolate extends Beverage {
    public Chocolate(int sugar, ServingMethod servingMethod) {
        super(sugar, servingMethod);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing chocolate...");
        servingMethod.prepareCup();
    }

    @Override
    public void drink() {
        System.out.println("Drinking chocolate " + servingMethod.getServingType() + "!");
    }

    @Override
    public int getBaseCost() {
        return 20;
    }
}
