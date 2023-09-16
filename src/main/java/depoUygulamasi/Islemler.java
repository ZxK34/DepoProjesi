package depoUygulamasi;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {

    UrunTanimlama urunTanimlama = new UrunTanimlama();

    Scanner input = new Scanner(System.in);

    HashMap<Integer, UrunTanimlama> urunListesi = new HashMap<>();

    public void start() {


        int select;
        do {
            System.out.println("---DEPO UYGULAMASI---");
            System.out.println("Lutfen yapmak istediginiz islemi seciniz" +
                    "\n 1 Urun Tanimlama" +
                    "\n 2 Urun Listeleme" +
                    "\n 3 Urun Girisi" +
                    "\n 4 Urunu Rafa Koy" +
                    "\n 5 Urunu Cikisi" +
                    "\n 0 Cikis");
            select = input.nextInt();

            switch (select) {
                case 1:
                    urunTanimlama(urunTanimlama.getUrunIsmi(), urunTanimlama.getUretici(), urunTanimlama.getBirim());
                    break;
                case 2:

                    break;
                case 3:
                    //Urun Girisi
                    break;
                case 4:
                    //Urun Rafa Koy
                    break;
                case 5:
                    //Urun Cikisi
                    break;
                case 0:
                    //Cikis
                    break;
                default:
                    System.out.println("Yanlis Secim Yaptiniz");
            }

        } while (select != 0);
        System.out.println("Uygulamadan Cikiliyor");
    }

    int urunIdBaslangic = 1000;

    public void urunTanimlama(String urunIsmi, String uretici, String birim) {

        int urunId = urunIdBaslangic++;
        System.out.println("Urun Adini Giriniz");
        urunIsmi = input.next();
        System.out.println("Uretici Giriniz");
        uretici = input.next();
        System.out.println("Uretici Dagitim Birimini Giriniz");
        birim = input.next();
        UrunTanimlama yeniUrun = new UrunTanimlama(urunIsmi, uretici, 0, birim, null);
        urunListesi.put(urunId, yeniUrun);
    }

    public void UrunListesi() {
        System.out.println("Urun ID\tUrun ismi\tUretici\tUrun Miktari\tBirim\tRaf ");
        System.out.println("----------------------------------------------------------");

        for (Integer urunId : urunListesi.keySet()) {

            UrunTanimlama urunTanimlama = urunListesi.get(urunId);

            System.out.println(urunId + "\t" + urunTanimlama.getUrunIsmi() + "\t" + urunTanimlama.getUretici() + "\t" + urunTanimlama.getMiktar()
                    + "\t" + urunTanimlama.getRaf());
        }

    }
}


