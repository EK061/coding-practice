package ToDoListe;
/**
 * Repräsentiert ein einzelnes To-Do-Item.
 * Jedes Item hat einen Titel und einen Status (abgehakt oder nicht).
 */
public class ToDoItem {
    private String title;      // Titel des Items
    private boolean completed; // Status, ob das Item erledigt ist

    /**
     * Konstruktor erstellt ein neues Item mit einem Titel.
     * Standardmäßig ist das Item noch nicht erledigt.
     * @param title Titel des Items
     */
    public ToDoItem(String title) {
        this.title = title;
        this.completed = false;
    }

    /**
     * Markiert das Item als erledigt.
     */
    public void markCompleted() {
        this.completed = true;
    }

    /**
     * Prüft, ob das Item erledigt ist.
     * @return true, wenn erledigt, sonst false
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Gibt den Titel des Items zurück.
     * @return Titel als String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gibt das Item als String zurück, z. B. "[x] Milch kaufen".
     */
    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + title;
    }
}
