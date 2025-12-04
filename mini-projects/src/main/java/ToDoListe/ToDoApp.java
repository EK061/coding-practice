package ToDoListe;

/**
 * Steuert die gesamte App: verbindet ToDoList und TodoUI.
 * Enthält die Run-Schleife der Anwendung.
 */
public class ToDoApp {
    private ToDoList todoList; // Die Logik der To-Do-Liste
    private UI ui;         // Die Benutzeroberfläche

    /**
     * Konstruktor initialisiert TodoList und UI.
     */
    public ToDoApp() {
        todoList = new ToDoList();
        ui = new UI();
    }

    /**
     * Startet die Anwendung und führt die Endlos-Schleife mit Benutzerinteraktion aus.
     */
    public void run() {
        boolean running = true;
        while (running) {
            int choice = ui.showMenu();
            switch (choice) {
                case 1 -> {
                    String title = ui.getNewItem();
                    todoList.addItem(title);
                    ui.showMessage("Item hinzugefügt!");
                }
                case 2 -> {
                    ui.showItems(todoList.getItems());
                    int delIndex = ui.getIndex();
                    try {
                        todoList.removeItem(delIndex);
                        ui.showMessage("Item gelöscht!");
                    } catch (IndexOutOfBoundsException e) {
                        ui.showMessage("Ungültiger Index!");
                    }
                }
                case 3 -> {
                    ui.showItems(todoList.getItems());
                    int compIndex = ui.getIndex();
                    try {
                        todoList.completeItem(compIndex);
                        ui.showMessage("Item abgehakt!");
                    } catch (IndexOutOfBoundsException e) {
                        ui.showMessage("Ungültiger Index!");
                    }
                }
                case 4 -> ui.showItems(todoList.getItems());
                case 5 -> {
                    ui.showMessage("Tschüss!");
                    running = false;
                }
                default -> ui.showMessage("Ungültige Auswahl!");
            }
        }
    }
}
