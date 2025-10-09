/**
 * Classe che rappresenza una semplice Cosa
 * @author Greta Maria Brugnatti
 * @version 2025-10-09
 */

public class Cosa implements Pesabile{
    private String descrizione;
    private double volumeLitri;
    private double pesoKg;

    /**
     * Costruttore della classe cosa
     * @param descrizione
     * @param volumeLitri
     * @param pesoKg
     */
    public Cosa(String descrizione, double volumeLitri, double pesoKg) {
        //Aggiungere controlli
        this.descrizione = descrizione;
        this.volumeLitri = volumeLitri;
        this.pesoKg = pesoKg;
    }

    //Metodi getter
    public String getDescrizione() {
        return descrizione;
    }

    public double getVolumeLitri() {
        return volumeLitri;
    }

    public double getPeso() {
        return pesoKg;
    }

    @Override
    public String toString() {
        return "Descrizione: " + descrizione + "\nVolume (L): " +  volumeLitri + "\nPeso (kg): " + pesoKg;
    }
}
