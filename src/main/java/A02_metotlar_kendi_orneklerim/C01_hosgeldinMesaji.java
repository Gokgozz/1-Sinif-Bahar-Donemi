package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;

public class C01_hosgeldinMesaji {
    
    public static void hosgeldinMesaji(String isim){
        System.out.print("Selam! " + isim + " MAKU kafeteryasina hosgeldiniz...");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lutfen isminizi giriniz : ");
        String isim = input.nextLine();
        hosgeldinMesaji(isim);
    }
    
}
