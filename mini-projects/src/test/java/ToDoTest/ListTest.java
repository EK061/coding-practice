package ToDoTest;

import ToDoListe.ToDoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit-Tests für die TodoList-Klasse.
 * Testet das Hinzufügen, Löschen, Abhaken von Items
 * sowie das Verhalten bei ungültigen Indizes.
 */
class ListTest {
    private ToDoList todoList;
    /**
     * Vor jedem Test wird eine neue To-Do-Liste erstellt,
     * damit die Tests unabhängig voneinander sind.
     */
    @BeforeEach
    void setUp() {
        todoList = new ToDoList();
    }
    /**
     * Testet das Hinzufügen eines Items.
     * Prüft, ob die Liste danach genau ein Item enthält,
     * der Titel korrekt ist und das Item noch nicht erledigt ist.
     */
    @Test
    void testAddItem() {
        todoList.addItem("Milch kaufen");
        assertEquals(1, todoList.getItems().size());
        assertEquals("Milch kaufen", todoList.getItems().get(0).getTitle());
        assertFalse(todoList.getItems().get(0).isCompleted());
    }
    /**
     * Testet das Löschen eines Items.
     * Prüft, dass das richtige Item entfernt wird und die Liste korrekt bleibt.
     */
    @Test
    void testRemoveItem() {
        todoList.addItem("Milch kaufen");
        todoList.addItem("Brot kaufen");

        todoList.removeItem(0);
        assertEquals(1, todoList.getItems().size());
        assertEquals("Brot kaufen", todoList.getItems().get(0).getTitle());
    }
    /**
     * Testet das Abhaken eines Items.
     * Prüft, dass der Status korrekt auf erledigt gesetzt wird.
     */
    @Test
    void testCompleteItem() {
        todoList.addItem("Milch kaufen");
        todoList.completeItem(0);

        assertTrue(todoList.getItems().get(0).isCompleted());
    }
    /**
     * Testet das Verhalten beim Löschen mit ungültigem Index.
     * Erwartet eine IndexOutOfBoundsException.
     */
    @Test
    void testRemoveItemInvalidIndex() {
        todoList.addItem("Milch kaufen");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            todoList.removeItem(5);
        });
    }
    /**
     * Testet das Verhalten beim Abhaken eines Items mit ungültigem Index.
     * Erwartet eine IndexOutOfBoundsException.
     */
    @Test
    void testCompleteItemInvalidIndex() {
        todoList.addItem("Milch kaufen");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            todoList.completeItem(3);
        });
    }
}
