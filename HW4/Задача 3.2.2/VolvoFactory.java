public class VolvoFactory implements TransportFactory {
    public Bus createBus() { return new Bus(6_000_000, 20); }
    public Tram createTram() { return new Tram(10_000_000, 7); }
    public Trolleybus createTrolleybus() { return new Trolleybus(7_000_000, 13); }
    public String getBrandName() { return "Volvo"; }
}
