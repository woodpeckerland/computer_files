import java.util.ArrayList;

public class Main {

    public static void linie() {
        System.out.println("--->");
    }

    public static void main(String[] args) {

        ArrayList<String> dateien = new ArrayList<>();

        Laptop laptop = new Laptop("Apple", "MacBook Pro", 2023, dateien, 1.2, 10.5);
        Tablet tablet = new Tablet("Apple", "iPad Air", 2025, dateien, 11, false);
        Tower tower = new Tower("LG", "Gram", 2024, dateien, true);
        Workstation workstation = new Workstation("Apple", "Mac Pro", 2024, dateien, "M2 Ultra");

        linie();
        laptop.starten();
        System.out.println(laptop);

        linie();
        tablet.starten();
        System.out.println(tablet);

        linie();
        tower.starten();
        System.out.println(tower);

        linie();
        workstation.starten();
        System.out.println(workstation);
    }
}