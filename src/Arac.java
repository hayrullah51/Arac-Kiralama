import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arac {

    String marka;
    String model;
    String yakitTipi;
    String vites;
    double gunlukUcret;
    static List<String> alinanAraclar=new ArrayList<>();
    static List<Integer> fiyatAraclar=new ArrayList<>();

    public  void  arac (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen marka giriniz");
        this.marka=scan.next();
        System.out.println("Lutfen model giriniz");
        this.model=scan.next();
        System.out.println("Lutfen yakıt tipi giriniz");
        this.yakitTipi=scan.next();
        System.out.println("Lutfen vites turu giriniz");
        this.vites=scan.next();
        alinanAraclar.add(marka);
        fiyatAraclar.add(300);


    }

    public Arac(String marka, String model, String yakitTipi, String vites) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "Aracınız : " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakitTipi : " + yakitTipi +
                "\nvites : " + vites;

    }

    public Arac() {
    }
    public static void arabaYap(){
        String marka;
        String model;
        String yakitTipi;
        String vites;
    }
}
