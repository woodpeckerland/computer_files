import java.util.ArrayList;
import java.util.Scanner;

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

    private void setGespeicherteDateien(ArrayList<String> gespeicherteDateien) {
        this.gespeicherteDateien = gespeicherteDateien;
    }

    abstract void starten();

    public void erstelleDatei() {

        System.out.print("Datei erstellen: ");
        Scanner sc = new Scanner(System.in);
        String dateiname = sc.nextLine();
        this.gespeicherteDateien.add(dateiname);
        setGespeicherteDateien(this.gespeicherteDateien);
    }

    public void transferiereDatei(Computer zielComputer, String dateiname) {

        ArrayList<String> dateienZielComputer = zielComputer.getGespeicherteDateien();
        ArrayList<String> meinComputer = this.getGespeicherteDateien();

        for (String s : meinComputer) {
            if (s.equals(dateiname)) dateienZielComputer.add(dateiname);
        }
    }

    public void loescheDatei() {

        System.out.print("Datei löschen: ");
        Scanner sc = new Scanner(System.in);
        String dateiname = sc.nextLine();
        ArrayList<String> meinComputer = this.getGespeicherteDateien();

        for (String s : meinComputer) {
            if (s.equals(dateiname)) meinComputer.remove(dateiname);
        }
    }

    public void zeigeGespeicherteDateien() {
       System.out.println(this.getGespeicherteDateien());
    }
}
