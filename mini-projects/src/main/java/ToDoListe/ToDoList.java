package ToDoListe;

import java.util.ArrayList;
import java.util.List;

/**
 * Repräsentiert eine To-Do-Liste, die mehrere ToDoItem-Objekte verwaltet.
 * Bietet Methoden zum Hinzufügen, Löschen, Abhaken und Abrufen der Items.
 */
public class ToDoList {
    private List<ToDoItem> items; // Liste aller To-Do-Items

    /**
     * Konstruktor erstellt eine leere To-Do-Liste.
     */
    public ToDoList() {
        items = new ArrayList<>();
    }

    /**
     * Fügt ein neues Item zur Liste hinzu.
     * @param title Titel des neuen Items
     */
    public void addItem(String title) {
        items.add(new ToDoItem(title));
    }

    /**
     * Löscht ein Item anhand des Index.
     * @param index Index des zu löschenden Items
     * @throws IndexOutOfBoundsException bei ungültigem Index
     */
    public void removeItem(int index) throws IndexOutOfBoundsException {
        items.remove(index);
    }

    /**
     * Markiert ein Item anhand des Index als erledigt.
     * @param index Index des Items
     * @throws IndexOutOfBoundsException bei ungültigem Index
     */
    public void completeItem(int index) throws IndexOutOfBoundsException {
        items.get(index).markCompleted();
    }

    /**
     * Gibt die gesamte Liste der Items zurück.
     * @return Liste von TodoItem
     */
    public List<ToDoItem> getItems() {
        return items;
    }
}
