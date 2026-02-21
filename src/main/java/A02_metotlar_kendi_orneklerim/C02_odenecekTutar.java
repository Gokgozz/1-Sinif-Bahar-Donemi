// Dışarıdan kahve adedi ve birim fiyatını parametre olarak alıp,
// toplam tutarı hesaplayarak ekrana yazdırmadan geriye döndüren bir metot yaz.

package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;

public class C02_odenecekTutar {
    
    public static double kahveTutarHesapla(int adet, double fiyat){
        
        double toplamTutar = adet*fiyat;
        return toplamTutar;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kahve adetini giriniz : ");
        int kahveAdet = input.nextInt();
        
        System.out.println("Kahve ucretini giriniz : ");
        double kahveUcret = input.nextDouble();
        
        System.out.println("Odemeniz gereken tutar : " + kahveTutarHesapla(kahveAdet,kahveUcret));
    }
    
}
