package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;
import java.util.Random;

public class C08_MatrisSatirSutunToplamlari {
    
    public static int[] matrisSatirToplam(int[][] dizi, int[] satirToplam){
        
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                satirToplam[i] += dizi[i][j];
            }
        }
        return satirToplam;
    }
    
    public static int[] matrisSutunToplam(int[][] dizi, int[] sutunToplam){
        
        for (int i = 0; i < dizi[0].length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                sutunToplam[i] += dizi[j][i];
            }
        }
        return sutunToplam;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("Matrisin satir uzunlugu : ");
        int satir = input.nextInt();
        System.out.println("Matrisim sutun uzunlugu : ");
        int sutun = input.nextInt();
        int[][] matris = new int[satir][sutun];
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = rnd.nextInt(100);
            }
        }
        
        int[] satirToplam = new int[satir];
        int[] sutunToplam = new int[sutun];
        matrisSatirToplam(matris,satirToplam);
        matrisSutunToplam(matris,sutunToplam);
        
        for (int i = 0; i < satir; i++) { // burada matrisi yazdırdım.
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 0; i < satirToplam.length; i++) {
            System.out.println((i+1) + ". Satir toplami : " + satirToplam[i]);
        }
        for (int i = 0; i < sutunToplam.length; i++) {
            System.out.println((i+1) + ". Sutun toplami : " + sutunToplam[i]);
        }
        
        
    }
    
}
