package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;
import java.util.Random;

public class C09_satirdakiMinMaxSayi {
    
    public static int[] satirMinSayi(int[][] dizi){
        int[] minSayilar = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            int min = dizi[i][0];
            for (int j = 0; j < dizi[0].length; j++) {
                if(min>dizi[i][j]){
                    min = dizi[i][j];
                }
            }
            minSayilar[i] = min;
        }
        return minSayilar;
    }
    
    public static int[] satirMaxSayi(int[][] dizi){
        int[] maxSayilar = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            int max = dizi[i][0];
            for (int j = 0; j < dizi[0].length; j++) {
                if(dizi[i][j]>max){
                    max = dizi[i][j];
                }
            }
            maxSayilar[i] = max;
        }
        return maxSayilar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Satir sayisi : ");
        int satir = input.nextInt();
        System.out.println("Sutun sayisi : ");
        int sutun = input.nextInt();
        int[][] matris = new int[satir][sutun];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j] = rnd.nextInt(100);
            }
        }
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + ", \t");
            }
            System.out.println();
        }
        
        
        int[] minSayiSatir = satirMinSayi(matris);
        for (int i = 0; i < matris.length; i++) {
            System.out.println((i+1) + ". satir min sayi : " + minSayiSatir[i] );
        }
        
        int[] maxSayiSatir = satirMaxSayi(matris);
        for (int i = 0; i < matris.length; i++) {
            System.out.println((i+1) + ". satir max sayi : " + maxSayiSatir[i] );
        }
        
        
    }
    
}
