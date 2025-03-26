import java.util.ArrayList;

public class Workstation extends Computer {

    private String prozessor;

    public Workstation(String hersteller, String modell, int baujahr, ArrayList<String> gespeicherteDateien, String prozessor) {
        super(hersteller, modell, baujahr, gespeicherteDateien);
        this.prozessor = prozessor;
    }

    public String getProzessor() {
        return prozessor;
    }

    public void setProzessor(String prozessor) {
        this.prozessor = prozessor;
    }

    @Override
    void starten() {
        System.out.println("""
                --->
                Ihre Workstation wird gestartet.""");
    }

    @Override
    public String toString() {

        return "Modell: " + this.getModell() + "\n"
                + "Hersteller: " + this.getHersteller() + "\n"
                + "Baujahr: " + this.getBaujahr() + "\n"
                + "Prozessor: " + this.getProzessor() + "\n"
                + "Dateien: " + this.getGespeicherteDateien();
    }
}
