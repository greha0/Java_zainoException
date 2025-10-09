import java.util.Locale;

/**
 * Classe che rappresenza uno zaino di scuola
 * @author Greta Maria Brugnatti
 * @version 2025-10-09
 */
public class ZainoScolastico extends Zaino {
    private boolean hasScompartoPerTablet; //True: ha uno scomparto riservato al tablet
                                           //False: non ha uno scomparto riserveto al tablet

    /**
     * Costruttore della classe ZainoScolastico
     * @param marca Marca dello zaino
     * @param colore Colore dello zaino
     * @param volumeLitri Capacità dello zaino in litri
     */
    public ZainoScolastico(String marca, String colore, double volumeLitri) {
        super(marca, colore, volumeLitri);
        hasScompartoPerTablet = false;
    }

    /**
     * Costruttore della classe ZainoScolastico con tutti gli attributi
     * @param m Marca
     * @param c Colore
     * @param cL Capacità in litri
     * @param i true: impermeabile
     *          false: non impermeabile
     * @param nS numero degli scomparti o tasche
     * @param p Peso dello zaino in chilogrammi
     * @param hS true: ha uno scomparto riservato al tablet
     *           false: non ha uno scomparto riserveto al tablet
     */
    public ZainoScolastico(String m, String c, double cL, boolean i, int nS, double p, boolean hS) {
        super(m, c, cL, i, nS, p);
        hasScompartoPerTablet = hS;
    }


    /**
     * Metodo getter
     * @return true: ha uno scomparto riservato al tablet
     *         false: non ha uno scomparto riserveto al tablet
     */
    public boolean getHasScompartoPerTablet() {
        return hasScompartoPerTablet;
    }

    /**
     * Metodo che aggiunge una Cosa allo zaino
     * @param c Cosa d'aggiungere allo Zaino
     * @throws IllegalArgumentException Lo zaino non può superare i 25kg
     */
    @Override
    public void inserisciCosa(Cosa c) throws IllegalArgumentException {
        String descrizione = c.getDescrizione();
        if(descrizione.toLowerCase(Locale.ROOT).contains("libro") || descrizione.toLowerCase(Locale.ROOT).contains("tablet") || descrizione.toLowerCase(Locale.ROOT).contains("quaderno")){
                super.inserisciCosa(c);
        }else{
            System.out.println("Non puoi inserire oggetti al di fuori del contesto scolastico");
        }
    }
}
