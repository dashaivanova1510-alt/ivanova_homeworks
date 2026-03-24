public abstract class Coffee {
    protected String name;
    protected double ingredientCost; 
    protected double salePrice;     

    public double getProfitPerCup() {
        return salePrice - ingredientCost;
    }

    public String getName() {
        return name;
    }
}

class Espresso extends Coffee {
    public Espresso(double cost, double price) {
        this.name = "Еспресо";
        this.ingredientCost = cost;
        this.salePrice = price;
    }
}

class Americano extends Coffee {
    public Americano(double cost, double price) {
        this.name = "Американо";
        this.ingredientCost = cost;
        this.salePrice = price;
    }
}

class Cappuccino extends Coffee {
    public Cappuccino(double cost, double price) {
        this.name = "Капучино";
        this.ingredientCost = cost;
        this.salePrice = price;
    }
}

class Latte extends Coffee {
    public Latte(double cost, double price) {
        this.name = "Лате";
        this.ingredientCost = cost;
        this.salePrice = price;
    }
}
