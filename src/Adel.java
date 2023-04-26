public class Adel extends Einwohner {
    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer() {
        // super ruft die Oberklasse Einwohner -> steuer-methode auf
        int steuerbetrag = super.steuer();
        if (steuerbetrag < 20) {
            steuerbetrag = 20;
        }
        return steuerbetrag;
    }
}

