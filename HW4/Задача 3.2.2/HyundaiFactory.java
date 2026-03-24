public class HyundaiFactory implements TransportFactory {
    public Bus createBus() { return new Bus(5_500_000, 20); }
    public Tram createTram() { return new Tram(9_500_000, 6); }
    public Trolleybus createTrolleybus() { return new Trolleybus(7_000_000, 11); }
    public String getBrandName() { return "Hyundai"; }
}
