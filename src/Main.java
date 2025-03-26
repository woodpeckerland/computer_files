import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> dateienLaptop = new ArrayList<>();
        ArrayList<String> dateienTablet = new ArrayList<>();
        ArrayList<String> dateienTower = new ArrayList<>();
        ArrayList<String> dateienWorkstation = new ArrayList<>();

        Laptop laptop = new Laptop("Apple", "MacBook Pro", 2023, dateienLaptop, 1.2, 10.5);
        Tablet tablet = new Tablet("Apple", "iPad Air", 2025, dateienTablet, 11, false);
        Tower tower = new Tower("LG", "Gram", 2024, dateienTower, true);
        Workstation workstation = new Workstation("Apple", "Mac Pro", 2024, dateienWorkstation, "M2 Ultra");

        laptop.starten();
        System.out.println(laptop);
        laptop.erstelleDatei();
        laptop.transferiereDatei(tablet, "datei.txt");
        laptop.zeigeGespeicherteDateien();

        tablet.starten();
        System.out.println(tablet);
        tablet.erstelleDatei();
        tablet.transferiereDatei(tower, "bild.jpg");
        tablet.zeigeGespeicherteDateien();

        tower.starten();
        System.out.println(tower);
        tower.erstelleDatei();
        tower.transferiereDatei(workstation, "tabelle.xls");
        tower.zeigeGespeicherteDateien();

        workstation.starten();
        System.out.println(workstation);
        workstation.erstelleDatei();
        workstation.zeigeGespeicherteDateien();
    }
}