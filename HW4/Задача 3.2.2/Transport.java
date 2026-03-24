public abstract class Transport {
    private final long cost;
    private final int usageCost;

    protected Transport(long cost, int usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public long getCost() { return cost; }
    public int getUsageCost() { return usageCost; }
    public abstract void move();
}


class Bus extends Transport {
    public Bus(long cost, int usageCost) { super(cost, usageCost); }
    public void move() { System.out.println("Bus runs!"); }
}

class Tram extends Transport {
    public Tram(long cost, int usageCost) { super(cost, usageCost); }
    public void move() { System.out.println("Tram runs on rails!"); }
}

class Trolleybus extends Transport {
    public Trolleybus(long cost, int usageCost) { super(cost, usageCost); }
    public void move() { System.out.println("Trolleybus runs by wires!"); }
}
