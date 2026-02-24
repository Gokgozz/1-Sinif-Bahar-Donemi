/*

+ iki boyutlu dizileri yazdırma işlemi
+ iki boyutlu dizileri m*n boyutunda rastgele sayılardan oluşturup döndüreceksinizi
+ iki boyutlu dizileri topla
+ iki boyutlu dizideki her satırdaki en küçük elemanları yazdıracaksınız
+ iki boyutlu dizideki her sütundaki en küçük elemanları yazdır
+ iki boyutlu dizideki her satırdaki en lüçük elemanların indislerini bir diziye atıp o diziyi döndür
+ iki boyutlu dizideki her sütundaki en küçük elemanların indislerini bir diziye aktarıp döndür
+ iki boyutlu dizideki her satırın ortalamasını bul ve döndür
+ iki boyutlu dizideki her sütundaki elemanların ortalamasını bulup döndür. (birden fazla eleman var diziyi aktarıp döndür)

hepsini aynı class içinde yap.

 */

package A01_metotlar;

import java.util.Random;
import java.util.Scanner;

public class A09_odev {

    public static int[][] ikiBoyutRandomDiziOlustur(int satir, int sutun) {
        Random rnd = new Random();
        int[][] dizi = new int[satir][sutun];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                dizi[i][j] = rnd.nextInt(100);
            }
        }
        return dizi;
    }

    public static int[][] ikiBoyutDiziYazdir(int[][] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.print(dizi[i][j] + " " + "\t");
            }
            System.out.println();
        }
        return dizi;
    }

    public static int[][] ikiBoyutDiziTopla(int[][] dizi1, int[][] dizi2) {
        int[][] toplam = new int[dizi1.length][dizi1[0].length];
        for (int i = 0; i < toplam.length; i++) {
            for (int j = 0; j < toplam[0].length; j++) {
                toplam[i][j] = dizi1[i][j] + dizi2[i][j];
            }
        }
        return toplam;
    }

    public static int[] herSatirMinSayi(int[][] dizi) {
        int[] minSatir = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            int min = dizi[i][0];
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] < min) {
                    min = dizi[i][j];
                }
            }
            minSatir[i] = min;
        }
        return minSatir;
    }

    public static int[] herSutunMinSayi(int[][] dizi) {
        int[] minSutun = new int[dizi[0].length];
        for (int i = 0; i < dizi[0].length; i++) {
            int min = dizi[0][i];
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j][i] < min) {
                    min = dizi[j][i];
                }
            }
            minSutun[i] = min;
        }
        return minSutun;
    }

    public static int[] herSatirMinIndex(int[][] dizi) {
        int[] minIndex = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            int min = dizi[i][0];
            int indis = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j] < min) {
                    min = dizi[i][j];
                    indis = j;
                }
            }
            minIndex[i] = indis;
        }
        return minIndex;
    }

    public static int[] herSutunMinIndex(int[][] dizi) {
        int[] minIndex = new int[dizi[0].length];
        for (int i = 0; i < dizi[0].length; i++) {
            int min = dizi[0][i];
            int indis = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j][i] < min) {
                    min = dizi[j][i];
                    indis = j;
                }
            }
            minIndex[i] = indis;
        }
        return minIndex;
    }

    public static double[] herSatirOrtalamasi(int[][] dizi) {
        double[] ortalama = new double[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            int toplam = 0;
            for (int j = 0; j < dizi[i].length; j++) {
                toplam += dizi[i][j];
            }
            ortalama[i] = (double) toplam / dizi[i].length;
        }
        return ortalama;
    }
    
    public static double[] herSutunOrtalamasi(int[][] dizi){
        double[] ortalama = new double[dizi[0].length];
        
        for (int i = 0; i < dizi[0].length; i++) {
            int toplam = 0;
            for (int j = 0; j < dizi.length; j++) {
                toplam += dizi[j][i];
            }
            ortalama[i] = (double) toplam / dizi.length;
        }
        return ortalama;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kac satir olsun? : ");
        int satir = input.nextInt();
        System.out.println("Kac sutun olsun? : ");
        int sutun = input.nextInt();

        System.out.println("+-- Olusturulan 1. dizi --+");
        int[][] matris1 = ikiBoyutRandomDiziOlustur(satir, sutun);
        ikiBoyutDiziYazdir(matris1);

        System.out.println();
        System.out.println("+-- olusturulan 2. dizi --+");
        int[][] matris2 = ikiBoyutRandomDiziOlustur(satir, sutun);
        ikiBoyutDiziYazdir(matris2);

        System.out.println();
        System.out.println("Olusturulan dizilerin toplami : ");
        int[][] matrisToplam = ikiBoyutDiziTopla(matris1, matris2);
        ikiBoyutDiziYazdir(matrisToplam);
        
        System.out.println();
        int[] minIndexSatir = herSatirMinIndex(matrisToplam);
        int[] minSatir = herSatirMinSayi(matrisToplam);
        for (int i = 0; i < minSatir.length; i++) {
            System.out.println((i + 1) + ". satirdaki min sayi = " + minSatir[i] + " , Bulundugu indis = " + minIndexSatir[i]);
        }
        
        System.out.println();
        int[] minIndexSutun = herSutunMinIndex(matrisToplam);
        int[] minSutun = herSutunMinSayi(matrisToplam);
        for (int i = 0; i < minSutun.length; i++) {
            System.out.println((i + 1) + ". sutundaki min sayi = " + minSutun[i] + " , Bulundugu indis = " + minIndexSutun[i]);
        }
        
        System.out.println();
        double[] satirOrtalama = herSatirOrtalamasi(matrisToplam);
        for (int i = 0; i < satirOrtalama.length; i++) {
            System.out.println((i + 1) + ". satir ortalamasi : " + satirOrtalama[i]);
        }
        
        System.out.println();
        double[] sutunOrtalama = herSutunOrtalamasi(matrisToplam);
        for (int i = 0; i < sutunOrtalama.length; i++) {
            System.out.println((i + 1) + ". sutun ortalamasi : " + sutunOrtalama[i]);
        }

    }

}