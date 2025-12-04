package taschenrechner;
import java.util.Scanner;

/**
 * Die Benutzeroberfläche, welche die Ausgaben auf der Konsole bestimmt
 */
public class UI {
    Scanner scanner= new Scanner(System.in);
    Taschenrechner calc= new Taschenrechner();

    /**
     * einfache startanzeige
     */
    public void printWelcome(){
        System.out.println("===============================" +
                "\n       Taschenrechner      " +
                "\n===============================");
    }

    /**
     * Registrierung, sowie verarbeitung der eingegebenen Zahlen
     */
    public void zahleneingabe(){
        System.out.println("Bitte gib die erste Zahl ein:");
        double a = scanner.nextDouble();
        System.out.println("Bitte gib die zweite Zahl ein:");
        double b = scanner.nextDouble();
        System.out.println("Operator wählen (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        try {
            double result;
            switch (op) {
                case '+': result = calc.add(a, b); break;
                case '-': result = calc.subtract(a, b); break;
                case '*': result = calc.multiply(a, b); break;
                case '/': result = calc.divide(a, b); break;
                default:
                    System.out.println("Fehler: Ungültiger Operator!");
                    return;
            }
            System.out.println("Ergebnis: " + result);
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }

    /**
     * zusammenfassende Klasse "starte()" zur verwendung in der Main Klasse
     */
    public void starte(){
        printWelcome();
        zahleneingabe();
    }
}
