package A01_metotlar;

import java.util.Random;

public class A07_n_boyutlu_diziyi_döndürme {
    
    public static int[] array_creator(int N){
        Random rnd = new Random();
        int[] dizi = new int[N];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50);
            
        }
        return dizi;
    }


    public static void main(String[] args) {
        
        
    }
    
}
