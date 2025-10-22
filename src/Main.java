/**
 * Main di prova
 * @author Greta Maria Brugnatti
 * @version 2025-10-09
 */

public class Main {
    public static void main(String[] args) {

        Cosa libro = new Cosa("Libro di matematica", 2.0, 1.0);
        Cosa tablet = new Cosa("Tablet Samsung", 0.7, 0.5);
        Cosa bottiglia = new Cosa("Bottiglia d'acqua", 1.0, 25);
        Cosa pallone = new Cosa("Pallone da calcio", 5.0, 0.6);


        Zaino zaino = new Zaino("Invicta", "Blu", 20);
        System.out.println("Zaino:\n" + zaino);


        try {
            zaino.inserisciCosa(libro);
            zaino.inserisciCosa(bottiglia);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        System.out.println("Peso dello zaino: " + zaino.getPeso());


        ZainoScolastico zainoScuola = new ZainoScolastico("Seven", "Rosso", 15);
        System.out.println("\nZaino Scolastico:\n" + zainoScuola);


        try {
            zainoScuola.inserisciCosa(libro);
            zainoScuola.inserisciCosa(tablet);
            zainoScuola.inserisciCosa(pallone);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        System.out.println("Peso zaino scolastico: " + zainoScuola.getPeso());
        zainoScuola.esporta("carciofo.json");
    }
}