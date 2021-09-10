package kincseslada;

import java.util.Scanner;

public class Ladak {

    String[] ladak = {"Arany láda", "Ezüst láda", "Bronz láda"};
    String[] felirat = {"Én rejtem a kincsset.", "Nem én rejtem a kincset.", "Arany láda hazudik."};
    int melyikLada;

    void kezd() {
        for (int i = 0; i < ladak.length; i++) {
            System.out.printf("%26s", ladak[i] + ": " + felirat[i]);
            System.out.println("");
        }
    }

    void melyik() {
        System.out.print("Melyik ládában van a kincs? (arany=1, ezüst=2, bronz=3)");
        Scanner sc = new Scanner(System.in);
        melyikLada = sc.nextInt();
    }

    void talaltE() {
        switch (melyikLada) {
            case 1:
                System.out.println("Nem ebben a ládában van a kincs.");
                break;
            case 2:
                System.out.println("Jól választottál, ebben a ládában van a kincs.");
                break;
            case 3:
                System.out.println("Nem ebben a ládában van a kincs.");
                break;
        }
    }
}
