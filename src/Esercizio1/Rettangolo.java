package Esercizio1;

public class Rettangolo {

    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }


    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }


    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }


    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Dettagli del primo rettangolo:");
        stampaRettangolo(r1);

        System.out.println("Dettagli del secondo rettangolo:");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }


    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 7);
        Rettangolo r2 = new Rettangolo(3, 8);

        System.out.println("Primo rettangolo:");
        stampaRettangolo(r1);

        System.out.println("\nSecondo rettangolo:");
        stampaRettangolo(r2);

        System.out.println("\nConfronto dei due rettangoli:");
        stampaDueRettangoli(r1, r2);
    }
}
