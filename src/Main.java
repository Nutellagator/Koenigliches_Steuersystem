import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Folgende Bevölkerungsgruppen stehen zur Auswahl:");
            System.out.println("-> König");
            System.out.println("-> Adel");
            System.out.println("-> Bauer");
            System.out.println("-> Leibeigener");
            System.out.println("Deine Eingabe: ");
            String bevGruppe = scanner.nextLine().toLowerCase();

            if (!bevGruppe.equals("könig") &&
                !bevGruppe.equals("adel") &&
                !bevGruppe.equals("bauer") &&
                !bevGruppe.equals("leibeigener")) {
                System.out.println("Ungültige Eingabe. Bitte wählen Sie aus: König, Adel, Bauer oder Leibeigener.");
                continue;
            }

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Einkommen: ");
            int einkommen = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            Einwohner einwohner;
            switch (bevGruppe) {
                case "könig":
                    einwohner = new Koenig(name);
                    break;
                case "adel":
                    einwohner = new Adel(name, einkommen);
                    break;
                case "bauer":
                    einwohner = new Bauer(name, einkommen);
                    break;
                case "leibeigener":
                    einwohner = new Leibeigen(name, einkommen);
                    break;
                default:
                    einwohner = null;
                    break;
            }

            if (einwohner != null) {
                int steuerbetrag = einwohner.steuer();
                System.out.println("");
                System.out.println(name + " muss " + steuerbetrag + " Taler Steuer zahlen.");
                System.out.println("");
            } else {
                System.out.println(" ---> Bitte gebe einen gültigen Einwohner an. <---");
            }
        }
    }
}