public class Einwohner {
    private String name;
    private int einkommen;

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int zuVersteuern() {
        return einkommen;
    }

    public int steuer() {
        int zuVersteuerndesEinkommen = zuVersteuern();
        // 1: (int) = int-Konvertierung oder auch int-casting genannt, dabei wird, der double Wert in einen int-Wert konveniert
        //     Achtung: Es können hierbei Daten verloren gehen, wenn der ursprüngliche Wert nicht in den Wert des int-Datentyps passt
        //     besser wäre diese Variante: int steuerbetrag = zuVersteuerndesEinkommen *10 / 100;
        //     mit dem Java Math.floor-Package wird das Ergebnis in eine Ganzzahl umgewandelt
        int steuerbetrag = (int) Math.floor(zuVersteuerndesEinkommen * 0.1);
        if (steuerbetrag < 1) {
            steuerbetrag = 1;
        }
        return steuerbetrag;
    }
}