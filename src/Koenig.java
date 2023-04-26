public class Koenig extends Einwohner {
    public Koenig(String name) {
        super(name, 0); // Der König hat kein Einkommen
    }

    @Override
    public int zuVersteuern() {
        return 0;
    }

    @Override
    public int steuer() {
        return 1; // Der König zahlt immer 1 Taler Steuer
    }
}