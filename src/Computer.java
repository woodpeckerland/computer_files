import java.util.ArrayList;

public abstract class Computer {

    private String hersteller;
    private String modell;
    private int baujahr;
    private ArrayList<String> gespeicherteDateien;

    public Computer(String hersteller, String modell, int baujahr, ArrayList<String> gespeicherteDateien) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
        this.gespeicherteDateien = gespeicherteDateien;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public ArrayList<String> getGespeicherteDateien() {
        return gespeicherteDateien;
    }

    public void setGespeicherteDateien(ArrayList<String> gespeicherteDateien) {
        this.gespeicherteDateien = gespeicherteDateien;
    }

    abstract void starten();

    /* todo
    ArrayList<String> erstelleDatei(String dateiname) {
        return;
    }
     */

    /* todo
    ArrayList<String> transferiereDatei(Computer zielComputer, String dateiname) {
        return;
    }
     */

    /* todo
    void zeigeGespeicherteDateien() {
        return;
    }
     */
}
