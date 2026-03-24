public class Cacodemon {
    private final String level;

    public Cacodemon(String level) {
        this.level = level;
    }

    public void shoot() {
        System.out.printf("Creature: %s, level %s, action: shoots plasma\n", "Cacodemon", level);
    }
}
