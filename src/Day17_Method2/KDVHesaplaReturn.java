package Day17_Method2;

public class KDVHesaplaReturn {
    public static double kdvDahilHesapla(double urunFiyati){
        return  urunFiyati = urunFiyati * 1.18;
    }
    public static double kdvHesapla(double urunFiyati){
        return urunFiyati * 0.18;
    }

    public static void kasaFisi(){
        System.out.println("BootFloow Market");
        System.out.println("-----------------");
    }
    public static double kasaFisiHesapla(String urunAdi, double urunFiyati){
        System.out.println(urunAdi + " \t--- " + kdvDahilHesapla(urunFiyati));
        return kdvDahilHesapla(urunFiyati);
    }

    public static void main(String[] args) {
//        System.out.println("KDV'li fiyatı = " + kdvDahilHesapla(100) + " Tl dir.");
//        System.out.println("Ürünün KDV'si = " + kdvHesapla(100));

        String urun1 = "Elma";
        String urun2 = "Peynir";
        String urun3 = "Zeytin";

        kasaFisi();
        double toplam = kasaFisiHesapla(urun1,10)
                + kasaFisiHesapla(urun2,100)
                + kasaFisiHesapla(urun3,75);

        System.out.println("Toplam = \t" + toplam);

    }
}
