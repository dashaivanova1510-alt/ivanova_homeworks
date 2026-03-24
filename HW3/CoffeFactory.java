public class CoffeeFactory {
    public Coffee createCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO: return new Espresso();
            case AMERICANO: return new Americano();
            case CAPPUCCINO: return new Cappuccino();
            case LATTE: return new Latte();
            case FLAT_WHITE: return new FlatWhite();
            default: throw new IllegalArgumentException("Невідомий тип кави: " + type);
        }
    }
}
