import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musteri {

    String isim;
    String soyIsim;
    String yas;
    String alinacakSehir;





    public static void musteriBilgileri(){
        String isim;
        String soyIsim;
        String yas;
        String alinacakSehir;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        isim=scan.nextLine();
        System.out.println("Lutfen soy isim giriniz");
        soyIsim=scan.next();
        System.out.println("Lutfen yas giriniz");
        yas=scan.nextLine();
        System.out.println("Lutfen alacagınız sehri giriniz");
        alinacakSehir=scan.nextLine();



    }
    public static void kartBilgileri(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kart id giriniz");
        String id=scan.next();
        if (id.length()!=16){
            kartBilgileri();
        }

    }




}
