/*
Dışarıdan bir kelimeyi (String) parametre olarak alıp,
bu kelimenin tersten okunuşu kendisine eşitse (palindrom ise) geriye true,
değilse false döndüren bir metot yaz.
*/

package A02_metotlar_kendi_orneklerim;

import java.util.Scanner;

public class C05_palindromMetinKontrolMetot {
    
    
    public static boolean palindromKelimeKontrol(String originalWord){
        boolean palindrom = false;
        String tersKelime = "";
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            tersKelime = tersKelime + originalWord.charAt(i); // buraya dikkat
        }
        if(tersKelime.equalsIgnoreCase(originalWord)){
            palindrom = true;
        }
        return palindrom;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lutfen bir kelime giriniz : ");
        String girilenKelime = input.nextLine().trim(); //trim girilen kelimenin başındaki ve sonundaki boşluklerı siler
        
        boolean sonuc = palindromKelimeKontrol(girilenKelime); //Metottan dönen cevabı yakaladık ve bir değişkene koyduk!
        if(sonuc == true){
            System.out.println("Bu bir palindrom kelimedir.");
        } else {
            System.out.println("Palindrom kelime degildir.");
        }
    }
    
}
