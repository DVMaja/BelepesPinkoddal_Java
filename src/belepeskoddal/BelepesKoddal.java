package belepeskoddal;

import java.util.Scanner;

public class BelepesKoddal {

    private static Scanner sc = new Scanner(System.in);
    private static int szamlalo;

    public static void main(String[] args) {
        int kapottPin = KodBekeres();
        KodEllenorzes(kapottPin);

    }

    private static int KodBekeres() {
        System.out.print("Kérem adja meg a pinkódot: ");
        int pin = sc.nextInt();
        System.out.println("Kód elmentve!");
        return pin;
    }

    private static void KodEllenorzes(int kapottPin) {
        szamlalo = 1;
        int kod;

        do {
            System.out.printf("Kérem a belépési kódot(%d/3):", szamlalo);
            kod = sc.nextInt();
            System.out.println("");
            szamlalo++;

        } while (kod != kapottPin && szamlalo <= 3);
        
        if (szamlalo < 4) {
            System.out.println("Rendben sikeres belépés!");
        }else{
            System.out.println("Belépés megtagadva!");
        }
    }

}
