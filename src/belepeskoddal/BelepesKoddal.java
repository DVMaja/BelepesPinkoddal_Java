package belepeskoddal;

import java.util.Random;
import java.util.Scanner;

public class BelepesKoddal {

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();
    private static int szamlalo;

    public static void main(String[] args) {
        //int kapottPin = KodBekeres();
        //KodEllenorzes(kapottPin);

        //String pinKod = KodBekeresStringel();
        //KodEllenorzesStringel(pinKod);
        // legyen olyan mint a pin pad, de ne sorrenbe legyen
        int[] kevertTomb = Kever();
        PinpadKiiratas(kevertTomb);

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

            if (kod != kapottPin) {
                System.out.println("\nHibás pin kód!");
                szamlalo++;
            }

        } while (kod != kapottPin && szamlalo <= 3);

        if (szamlalo <= 3) {
            System.out.println("Rendben sikeres belépés!");
        } else {
            System.out.println("Belépés megtagadva!");
        }
    }

    private static String KodBekeresStringel() {
        String pin = "";

        do {
            System.out.print("Kérem adja meg a pinkódot: ");
            pin = sc.nextLine();

            if (!(pin.length() >= 4 && pin.length() <= 6)) {
                System.out.println("Nem megfelelő formátum, minimum 4\nmaximum 6 szmjegy legyen!");
            }

        } while (!(pin.length() >= 4 && pin.length() <= 6));

        return pin;
    }

    private static void KodEllenorzesStringel(String pinKod) {
        szamlalo = 1;
        String kod;

        do {
            System.out.printf("Kérem a belépési kódot(%d/3):", szamlalo);
            kod = sc.nextLine();

            if (!kod.equals(pinKod)) {
                System.out.println("\nHibás pin kód!");
                szamlalo++;
            }

        } while (!kod.equals(pinKod) && szamlalo <= 3);

        if (szamlalo <= 3) {
            System.out.println("Rendben sikeres belépés!");
        } else {
            System.out.println("Belépés megtagadva!");
        }

    }

    private static int[] Kever() {
        //meg kell kevernie a pinpadra kiírt számokat        
        int[] szamTomb = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int index = 0; index < szamTomb.length; index++) {
            int helytarto = szamTomb[index];
            int velszam = rand.nextInt(szamTomb.length);
            szamTomb[index] = szamTomb[velszam];
            szamTomb[velszam] = helytarto;
        }
        return szamTomb;
    }

    private static void PinpadKiiratas(int[] kevertTomb) {
        /*Így kell elnevezni
        2 5 8
        0 1 3
        4 6 7
            3
         */
        for (int szamlalo = 0; szamlalo < kevertTomb.length ; szamlalo++) {
            System.out.printf("%-5d", kevertTomb[szamlalo]);
            if (szamlalo % 3 == 0) {
                System.out.println("");
            }
        }
    }

}
