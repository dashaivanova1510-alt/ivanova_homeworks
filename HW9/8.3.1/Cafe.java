public class Cafe {
    public static void main(String[] args) {
        ServingMethod inRest = new InRestaurantServing();
        ServingMethod toGo = new TakeawayServing();

        Beverage order1 = new Coffee(2, 200, 50, inRest); 
        Beverage order2 = new Coffee(0, 150, 0, toGo);   
        Beverage order3 = new Tee(1, toGo);            

        beverageInfo(order1);
        beverageInfo(order2);
        beverageInfo(order3);
    }

    private static void beverageInfo(Beverage beverage) {
        System.out.println("_____________________________");
        beverage.prepare();
        System.out.println("Cost: " + beverage.cost() + " grn");
        beverage.drink();
    }
}
