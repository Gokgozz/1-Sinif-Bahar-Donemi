// kahveyi 50 TL, cheesecake'i 80 TL üzerinden hesaplayan,
// eğer müşteri öğrenciyse toplam tutara %10 indirim uygulayıp
// ödenecek son tutarı geriye döndüren bir metot yaz.
package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;

public class C03_odenecekTutarV2 {

    public static int odenecekTutar(int kahve, int kek, boolean ogrenci) {
        int toplamTutar = 50 * kahve + 80 * kek;
        if (ogrenci) {
            toplamTutar = toplamTutar - ((toplamTutar * 10) / 100);
        }
        return toplamTutar;
    }

    public static double indirimHesapla(int tutar) { //SADECE %10 İNDİRİM HESAPLIYOR
        double indirimliHali = tutar - (tutar * 10 / 100);
        return indirimliHali;
    }

    public static double indirimHesapla(int tutar, int oran) { // GİRİLEN ORAN KADAR İNDİRİM HESAPLIYOR
        double indirimliHali = tutar - (tutar * oran / 100);
        return indirimliHali;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ogrenciMi = false;
        System.out.println("Ogrenci misiniz? (EVET/HAYIR) : ");
        String ogrenciMiYanit = input.nextLine();
        if (ogrenciMiYanit.equalsIgnoreCase("EVET")) {
            ogrenciMi = true;
        }

        System.out.println("Kac adet kahve ictiniz ? : ");
        int kahveAdet = input.nextInt();
        System.out.println("Kac adet kek yediniz ? : ");
        int kekAdet = input.nextInt();

        int anaTutar = odenecekTutar(kahveAdet, kekAdet, ogrenciMi);
        System.out.println("Toplam tutar : " + anaTutar);
        System.out.println("Sabit %10 indirim uygulanmis hali : " + indirimHesapla(anaTutar));
        System.out.println("%25 ozel indirimli hali : " + indirimHesapla(anaTutar, 25));

    }

}
