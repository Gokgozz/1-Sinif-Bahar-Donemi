/*
Bir veri setinde bazen sadece bir kez geçen verileri
(örneğin tek kullanımlık indirim kodları veya benzersiz kullanıcı ID'leri) bulmamız gerekir.

Bir dizi içerisindeki tüm elemanları tek tek inceleyerek,
kendisinden başka eşi olmayan (tekrar etmeyen) sayıların toplam adedini belirleme işlemidir.
 */


package A02_metotlar_kendi_orneklerim;


public class C07_dizideTekAdetOlanlar {
    
    public static int veriKontrol(int[] kontrolEdilecekDizi){
        int benzersizAdet = 0;
        for (int i = 0; i < kontrolEdilecekDizi.length; i++) {
            int sayac = 0;
            for (int j = 0; j < kontrolEdilecekDizi.length; j++) {
                if(kontrolEdilecekDizi[i] == kontrolEdilecekDizi[j]){
                    sayac++;
                }
            }
            if(sayac == 1){ //sayaç 1e eşitse o sayıdan 1 adet vardır yoksa sayaç 1den buyuk olurdu o yuzden sonradan sayacı sıfırlıyoruz
                benzersizAdet++;
            }
        }
        return benzersizAdet;
    }

    public static void main(String[] args) {
        
        int[] veriler = {001,012,123,123,748,55,14,14,14,3,001,245,176,865,1,1,1};
        int esiOlmayanSayiAdet = veriKontrol(veriler);
        System.out.println("Dizide esi olmayan sayi adeti : " + esiOlmayanSayiAdet);
        
    }
    
}
