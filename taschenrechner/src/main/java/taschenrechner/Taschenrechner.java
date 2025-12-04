package taschenrechner;

/**
 * Klasse Taschenrechner, welche Objekte zur berechnung beinhaltet.
 */
public class Taschenrechner {
    /**
     * Objekt zur Addition
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Objekt zur Subtraktion
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Objekt zur Multiplikation
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Objekt zur Division
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt!");
        }
        return a / b;
    }
}
