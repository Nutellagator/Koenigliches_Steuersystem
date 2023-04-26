public class Leibeigen extends Bauer {
    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        int zuVersteuerndesEinkommen = super.zuVersteuern() - 12;
        // wird auf 0 gesetzt da negativ Werte immer schlecht
        if (zuVersteuerndesEinkommen < 0) {
            zuVersteuerndesEinkommen = 0;
        }
        return zuVersteuerndesEinkommen;
    }
}