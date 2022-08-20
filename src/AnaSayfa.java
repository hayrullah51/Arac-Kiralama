import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaSayfa {
    static int secim;
   static boolean devamMi = false;
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("..........DEDELER GALERİ..........");
        System.out.println("----------------------------------");
        System.out.println("************HOSGELDİNİZ***********");
        System.out.println("Size yardımcı olmak istiyorum");

        do {
            System.out.println("Lutfen secim yapiniz...");
            System.out.println("1-->OPEL");
            System.out.println("2-->TOYATA");
            System.out.println("3-->VOLVO");
            System.out.println("4--> KENDİNİZ OLUSTURUN");
            secim = scan.nextInt();
            if (secim < 0 || secim > 4) {
                System.out.println("Lutfen gecerli no giriniz");
            } else {

                switch (secim) {
                    case 1:

                        Arac araba1 = new Arac("Opel", "Astra", "LPG", "Manuel");
                        System.out.println(araba1);
                        Arac.alinanAraclar.add(araba1.marka);
                        Arac.fiyatAraclar.add(100);
                        anaSayfaDongusu();
                        break;
                    case 2:
                        Arac araba2 = new Arac("Toyata", "Coralla", "Dizel", "Manuel");
                        System.out.println(araba2);
                        Arac.alinanAraclar.add(araba2.marka);
                        Arac.fiyatAraclar.add(120);
                        anaSayfaDongusu();
                        break;
                    case 3:
                        Arac araba3 = new Arac("Volvo", "S90", "Benzin", "Otomatik");
                        System.out.println(araba3);
                        Arac.alinanAraclar.add(araba3.marka);
                        Arac.fiyatAraclar.add(150);
                        anaSayfaDongusu();
                        break;
                    case 4:
                        Arac araba4 = new Arac();
                        System.out.println("Lutfen marka giriniz");
                        araba4.marka = scan.next();
                        System.out.println("Lutfen model giriniz");
                        araba4.model = scan.next();
                        System.out.println("Lutfen yakıt tipi giriniz");
                        araba4.yakitTipi = scan.next();
                        System.out.println("Lutfen vites turu giriniz");
                        araba4.vites = scan.next();
                        System.out.println(araba4);
                        Arac.fiyatAraclar.add(300);
                        anaSayfaDongusu();
                }


            }
        } while (!devamMi);

        Odeme.Odeme();


    }

    public static void anaSayfaDongusu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Baska arac kiralamak icin E 'ye basınız\nOdeme yapmak icin baska bir tusa basınız...");
        String dongu=scan.next();
        if (dongu.equalsIgnoreCase("E")){
            devamMi=false;
        }else {
            devamMi=true;
        }
    }
}