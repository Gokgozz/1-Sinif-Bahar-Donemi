/*
İçerisi rastgele fiyatlarla doldurulmuş bir diziyi (array) parametre olarak alıp,
döngü yardımıyla içindeki max/min değeri bularak geriye döndüren bir metot yaz.
*/

package A02_metotlar_kendi_orneklerim;

import java.util.Random;

public class C04_metotIleMinMaxDeger {
    
    
    public static void diziyeRastgeleSayiAta(int[] dizi){
        Random rnd = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(100);
        }
    }

    public static int[] MinMaxSayiBul(int[] dizi , int[] minmax){
        int min = dizi[0];
        int max = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(min>dizi[i]){
                min = dizi[i];
            }else if(max<dizi[i]){
                max = dizi[i];
            }
        }
        minmax[0] = min;
        minmax[1] = max;
        return minmax;
    }
    
    
    public static void main(String[] args) {
        
        int[] fiyatlar = new int[10];
        diziyeRastgeleSayiAta(fiyatlar);
        
        int[] minmax = new int[2];
        MinMaxSayiBul(fiyatlar,minmax);
        
        System.out.println("Olusturulan dizi : ");
        for (int i = 0; i < fiyatlar.length; i++) {
            System.out.print(fiyatlar[i] +  ", ");
        }
        
        System.out.println();
        System.out.println("En kucuk sayi : " + minmax[0]);
        System.out.println("En buyuk sayi : " + minmax[1]);
        
        
    }
    
}
