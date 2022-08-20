import java.util.Scanner;

public class Odeme {


     public static void Odeme(){
         Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bilgilerinizi Giriniz...");
        Musteri.musteriBilgileri();
        Musteri.kartBilgileri();
         System.out.println("Lutfen kullanacagınız gun sayisi giriniz");
         int kullanilacakGun=scan.nextInt();
        int toplamTutar=0;

         for (int i = 0; i < Arac.fiyatAraclar.size(); i++) {

            toplamTutar+=Arac.fiyatAraclar.get(i);
         }
         toplamTutar*=kullanilacakGun;
         System.out.println("odemeniz gereken toplam tutar : "+toplamTutar);
         System.out.println("Tebrikler odemeniz tamamlandı :)");
         System.out.println("Kiraladıgınız araclar : "+Arac.alinanAraclar);
         System.out.println(":::::IYI GUNLER DİLERİZ:::::");

    }

}
