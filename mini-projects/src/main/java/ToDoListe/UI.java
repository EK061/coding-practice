package ToDoListe;
import java.util.List;
import java.util.Scanner;

/**
 * Verantwortlich für die gesamte Benutzereingabe und -ausgabe.
 * Trennt die Darstellung von der Logik.
 */
public class UI {
    private Scanner scanner;

    /**
     * Konstruktor initialisiert den Scanner für Eingaben.
     */
    public UI() {
        scanner = new Scanner(System.in);
    }

    /**
     * Zeigt das Hauptmenü an und liest die Auswahl des Benutzers.
     * @return gewählte Option als int
     */
    public int showMenu() {
        System.out.println("\n--- TODO LISTE ---");
        System.out.println("1. Hinzufügen");
        System.out.println("2. Löschen");
        System.out.println("3. Abhaken");
        System.out.println("4. Anzeigen");
        System.out.println("5. Beenden");
        System.out.print("Wähle eine Option: ");
        return scanner.nextInt();
    }

    /**
     * Liest den Titel eines neuen Items vom Benutzer ein.
     * @return Titel als String
     */
    public String getNewItem() {
        System.out.print("Neues Todo eingeben: ");
        scanner.nextLine(); // Scanner-Korrektur nach nextInt
        return scanner.nextLine();
    }

    /**
     * Liest den Index eines Items vom Benutzer ein.
     * @return Index als int
     */
    public int getIndex() {
        System.out.print("Gib die Nummer des Items ein: ");
        return scanner.nextInt();
    }

    /**
     * Zeigt alle Items in der Liste an.
     * @param items Liste von TodoItem
     */
    public void showItems(List<ToDoItem> items) {
        if (items.isEmpty()) {
            System.out.println("Keine Items in der Liste.");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + ". " + items.get(i));
            }
        }
    }

    /**
     * Zeigt eine Nachricht an den Benutzer an.
     * @param message Nachricht als String
     */
    public void showMessage(String message) {
        System.out.println(message);
    }
}
