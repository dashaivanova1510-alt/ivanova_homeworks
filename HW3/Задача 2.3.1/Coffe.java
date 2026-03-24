public abstract class Coffee {
    private String name;
    private double costPrice;    // Собівартість
    private double sellingPrice; // Ціна продажу

    public Coffee(String name, double costPrice, double sellingPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() { return name; }
    public double getCostPrice() { return costPrice; }
    public double getSellingPrice() { return sellingPrice; }
    
    // Метод для розрахунку чистого прибутку з однієї чашки
    public double getProfit() {
        return sellingPrice - costPrice;
    }
}
