/**
 * Questa interfaccia rappresenta degli oggetti archiviabili cioè
 * salvabili su file JSON
 * @author Greta Maria Brugnatti
 * @version 22-10-2025
 */

public interface Archivable {
    public void esporta(String fileName);
    //L'ho messo in italiano perchè mi creava problemi in inglese
    public void importa(String fileName);
    public void load(String fileName);
}
