package A02_metotlar_kendi_orneklerim;

import static A02_metotlar_kendi_orneklerim.C09_satirdakiMinMaxSayi.satirMinSayi;
import java.util.Scanner;
import java.util.Random;

public class C10_sutundakiMinMaxSayi {
    
    public static int[] sutunMinSayi(int[][] dizi){
        int[] sutunMinSayi = new int[dizi[0].length];
        for (int i = 0; i < dizi[0].length; i++) {
            int min = dizi[0][i];
            for (int j = 0; j < dizi.length; j++) {
                if(min>dizi[j][i]){
                    min = dizi[j][i];
                }
            }
            sutunMinSayi[i] = min;
        }
        return sutunMinSayi;
    }
    
    public static int[] sutunMaxSayi(int[][] dizi){
        int[] sutunMaxSayi = new int[dizi[0].length];
        for (int i = 0; i < dizi[0].length; i++) {
            int max = dizi[0][i];
            for (int j = 0; j < dizi.length; j++) {
                if(max<dizi[j][i]){
                    max = dizi[j][i];
                }
            }
            sutunMaxSayi[i] = max;
        }
        return sutunMaxSayi;
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
                System.out.print(matris[i][j] + " , \t");
            }
            System.out.println();
        }
        
        int[] minSayiSutun = sutunMinSayi(matris);
        for (int i = 0; i < matris[0].length; i++) {
            System.out.println((i+1) + ". sutun min sayi : " + minSayiSutun[i] );
        }
        
        int[] maxSayiSutun = sutunMaxSayi(matris);
        for (int i = 0; i < matris[0].length; i++) {
            System.out.println((i+1) + ". sutun max sayi : " + maxSayiSutun[i] );
        }
    }
    
}
