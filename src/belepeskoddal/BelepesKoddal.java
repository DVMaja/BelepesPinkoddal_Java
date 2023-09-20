package belepeskoddal;

import java.util.Random;
import java.util.Scanner;

public class BelepesKoddal {
    
    private static Random rand = new Random();
    //A program indulásakor automatikusan kérje a kódot.
   
    public static void main(String[] args) {
        new BelepesKoddal().Feladat();
       
//        String pinKod = KodBekeresStringel();
//        KodEllenorzesStringel(pinKod);
//         legyen olyan mint a pin pad, de ne sorrenbe legyen
//        int[] kevertTomb = Kever();
//        PinpadKiiratas(kevertTomb);

    }    
    
    public void Feladat(){
        PinKod pin1 = new PinKod();
        pin1.Bekeres();
    }    
}
