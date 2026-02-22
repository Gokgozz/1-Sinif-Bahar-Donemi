/*
Bir e-ticaret sitesinde veya kütüphane sisteminde kullanıcı bir şey aradığında,
sistemin o elemanı binlerce verinin içinde bulması gerekir. Şimdi bunun en temel versiyonunu yazacağız.
*/

package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;

public class C06_SayiMevcutMu {
    
    public static boolean arananSayiMevcutMu(int[] dizi ,int sayi){
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] == sayi){
                return true; //return döngüyü bitirdiği için daha sonra false olmuyor.
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] sayilar = {1,5,6,2,8,9,24,15,12,36,45,22,66};
        System.out.println("Hangi sayiyi aratmak istiyorsunuz? : ");
        int arananSayi = input.nextInt();
        
        boolean sonuc = arananSayiMevcutMu(sayilar,arananSayi);
        if(sonuc){
            System.out.println("Evet mevcut.");
        }else{
            System.out.println("Hayir mevcut degil.");
        }
    }
    
}
