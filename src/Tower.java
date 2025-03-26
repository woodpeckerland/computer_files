import java.util.ArrayList;

public class Tower extends Computer {

    private boolean hatGrafikkarte;

    public Tower(String hersteller, String modell, int baujahr, ArrayList<String> gespeicherteDateien, boolean hatGrafikkarte) {
        super(hersteller, modell, baujahr, gespeicherteDateien);
        this.hatGrafikkarte = hatGrafikkarte;
    }

    public boolean isHatGrafikkarte() {
        return hatGrafikkarte;
    }

    public void setHatGrafikkarte(boolean hatGrafikkarte) {
        this.hatGrafikkarte = hatGrafikkarte;
    }

    @Override
    void starten() {
        System.out.println("""

                Dein Tower wird gestartet.
                --->""");
    }

    @Override
    public String toString() {

        return "Modell: " + this.getModell() + "\n"
                + "Hersteller: " + this.getHersteller() + "\n"
                + "Baujahr: " + this.getBaujahr() + "\n"
                + "Grafikkarte: " + this.isHatGrafikkarte() + "\n";
    }
}
