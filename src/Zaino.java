import java.util.ArrayList;

/**
 * Rappresentazione di uno Zaino
 * @author Greta Maria Brugnatti
 * @version 2025-10-09
 */

public class Zaino implements Pesabile{
    private String marca;
    private String colore;
    private double capacitaLitri;
    private boolean impermeabile;
    private int numeroScomparti;
    private double capacitaOccupata; //Capacità in litri occupata dagli oggetti presenti all'interno
    private double pesoKg;
    private ArrayList<Cosa> contenuto; //Array contenente gli oggetti Cosa

    /**
     * Costruttore della classe Zaino dati tutti gli attributi
     * @param m Marca
     * @param c Colore
     * @param cL Capacità dello zaino in litri
     * @param i True: Impermeabile
     *          False: Non impermeabile
     *
     * @param nS Numero di scomparti o tasche
     * @param p Peso dello zaino in chilogrammi
     */

    public Zaino (String m, String c, double cL, boolean i, int nS, double p){
        //Aggiungere controlli
        marca = m;
        colore = c;
        capacitaLitri = cL;
        impermeabile = i;
        numeroScomparti = nS;
        capacitaOccupata = 0;
        pesoKg = p;
        contenuto = new ArrayList<Cosa>();
    }


    /**
     * Costruttore della classe Zaino
     * @param m Marca
     * @param c Colore
     * @param cL Capacità in litri
     */
    public Zaino (String m, String c, double cL){
        //Aggiungere controlli
        marca = m;
        colore = c;
        capacitaLitri = cL;
        impermeabile = false;
        numeroScomparti = 2;
        capacitaOccupata = 0;
        pesoKg = 4.5;
        contenuto = new ArrayList<Cosa>();
    }

    //Metodi getter
    public String getMarca() {
        return marca;
    }

    public String getColore() {
        return colore;
    }

    public double getCapacitaLitri() {
        return capacitaLitri;
    }

    public boolean isImpermeabile() {
        return impermeabile;
    }

    public int getNumeroScomparti() {
        return numeroScomparti;
    }

    public double getCapacitaOccupata() {
        return capacitaOccupata;
    }

    public double getPeso(){
        return pesoKg + capacitaOccupata;
    }

    //Metodi setter
    public void setColore(String colore) {
        //Aggiungere controlli
        this.colore = colore;
    }

    public void setImpermeabile(boolean impermeabile) {
        //Aggiungere controlli
        this.impermeabile = impermeabile;
    }

    public void setNumeroScomparti(int numeroScomparti) {
        //Aggiungere controlli
        this.numeroScomparti = numeroScomparti;
    }


    /**
     * Metodo che aggiunge uno scomparto a quelli già esistenti
     */
    public void addScomparto(){
        numeroScomparti++;
    }

    /**
     * Metodo che rimuove uno scomparto a quelli già esistenti
     * Lo zaino non può avere meno di uno scomparto
     */

    public void removeScomparto(){
        if(numeroScomparti>1){
            numeroScomparti--;
        } else {
            System.out.println("Il numero di scomparti non può essere minore di 0!");
        }
    }


    @Override
    public String toString(){
        return "Marca: " + marca + "\nColore: " + colore + "\nCapacità (L): " + capacitaLitri + "\nImpermeabile: " + impermeabile + "\nNumero Scomparti: " + numeroScomparti;
    }

    /**
     * Metodo che verifica se lo zaino corrente è uguale all'obj
     * Si definisce che due zaini uguali sono due Zaino dalla stessa marca e capacità
     * @param obj   Oggetto da comparare
     * @return      true: Se sono uguali
     *              false: Se sono diversi
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Zaino){
            Zaino z = (Zaino)obj;
            return z.getMarca().equals(marca) && z.getCapacitaLitri() == capacitaLitri;
        }
        return false;
    }

    /**
     * Metodo che permette di confrontare la capacità di due zaini
     *
     * @param altroZaino Zaino da confrontare
     *
     * @return  0 La capacità è uguale
     *          1 La capacità dello zaino corrente è maggiore
     *          -1 La capacità dello zaino corrente è minore
     */
    public int confrontaCapacita(Zaino altroZaino){
        if(capacitaLitri == altroZaino.getCapacitaLitri()){
            return 0;
        }
        if(capacitaLitri > altroZaino.getCapacitaLitri()){
            return 1;
        }
        return -1;
    }

    /**
     * Permette di aggiungere un oggetto Cosa nello Zaino
     * Lo zaino non deve superare i 25kg
     * @param c Cosa d'aggiungere allo Zaino
     */
    public void inserisciCosa(Cosa c) throws IllegalArgumentException{
        if(pesoKg + c.getPeso() <= 25 && capacitaOccupata + c.getVolumeLitri() <= capacitaLitri){
            contenuto.add(c);
        } else {
            throw new IllegalArgumentException("La cosa è troppo pesante o troppo grande per stare nello zaino!");
        }
    }
}
