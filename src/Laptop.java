import java.util.ArrayList;

public class Laptop extends Computer {

    private double gewicht;
    private double akkulaufzeit;

    public Laptop(String hersteller, String modell, int baujahr, ArrayList<String> gespeicherteDateien, double gewicht, double akkulaufzeit) {
        super(hersteller, modell, baujahr, gespeicherteDateien);
        this.gewicht = gewicht;
        this.akkulaufzeit = akkulaufzeit;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getAkkulaufzeit() {
        return akkulaufzeit;
    }

    public void setAkkulaufzeit(double akkulaufzeit) {
        this.akkulaufzeit = akkulaufzeit;
    }

    @Override
    void starten() {
        System.out.println("""
                --->
                Ihr Laptop wird gestartet.""");
    }

    @Override
    public String toString() {

        return "Modell: " + this.getModell() + "\n"
                + "Hersteller: " + this.getHersteller() + "\n"
                + "Baujahr: " + this.getBaujahr() + "\n"
                + "Gewicht: " + this.getGewicht() + " kg\n"
                + "Akkulaufzeit: " + this.getAkkulaufzeit() + " h\n"
                + "Dateien: " + this.getGespeicherteDateien();
    }
}
