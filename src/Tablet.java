import java.util.ArrayList;

public class Tablet extends Computer {

    private double displayGroesse;
    private boolean hatStift;

    public Tablet(String hersteller, String modell, int baujahr, ArrayList<String> gespeicherteDateien, double displayGroesse, boolean hatStift) {
        super(hersteller, modell, baujahr, gespeicherteDateien);
        this.displayGroesse = displayGroesse;
        this.hatStift = hatStift;
    }

    public double getDisplayGroesse() {
        return displayGroesse;
    }

    public void setDisplayGroesse(double displayGroesse) {
        this.displayGroesse = displayGroesse;
    }

    public boolean isHatStift() {
        return hatStift;
    }

    public void setHatStift(boolean hatStift) {
        this.hatStift = hatStift;
    }

    @Override
    void starten() {
        System.out.println("Ihr Tablet wird gestartet.");
    }

    @Override
    public String toString() {

        return "Modell: " + this.getModell() + "\n"
                + "Hersteller: " + this.getHersteller() + "\n"
                + "Baujahr: " + this.getBaujahr() + "\n"
                + "Displaygröße: " + this.getDisplayGroesse() + " inches\n"
                + "Stift: " + this.isHatStift() + "\n"
                + "Dateien: " + this.getGespeicherteDateien();
    }
}
