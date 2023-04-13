package Day30_WrapperClass2;

public class WrapperAlisVerisSepeti {
    public static void main(String[] args) {
        String urunAdi;
        double miktar = 0.0;
        double fiyat = 0.0;
        boolean indirimVarMi = false;
        int indirimOrani = 0;

        double urunTutari = 0.0;
        double urunIndirimliTutar = 0.0;
        double fisTutari = 0.0;
        double toplamTutar = 0.0;
        double toplamIndirimTutari = 0.0;

        String[] sepet = new String[3]; //Alış-veriş sepeti

        //Ürünler veri-yapısı {urunAdi,miktari,fiyat,indirimVarMi,indirimOrani}
        String urun1 = "Elma,1.5,10.0,true,10";
        String urun2 = "Peynir,2.5,120,false,10";
        String urun3 = "Zeytin,1.5,65,true,25";

        //Sepete eklenmiş ürünler
        sepet[0]=urun1;
        sepet[1]=urun2;
        sepet[2]=urun3;

/*
        String[] sepet ={new String("Elma,1.5,10.0,true,10"),
                new String("Armut,2.5,15.0,true,12"),
                new String("Peynir,1.0,100.0,true,10"),
                new String("Zeytin,1.5,80.0,true,15"),
                new String("Süt,1.0,25.0,false,10"),
        };
*/
        //Sepetteki ürünlerin hesaplanması
        for (String urun: sepet) {
            String[] str = urun.split(","); //Ürünlerin parse edilerek diziye alınması ve ilgili veri tiplerine dönüştürülmesi
            urunAdi = str[0];
            miktar = Double.parseDouble(str[1]);
            fiyat =  Double.parseDouble(str[2]);
            indirimVarMi = Boolean.parseBoolean(str[3]);
            indirimOrani = Integer.parseInt(str[4]);

            //Ürünün indirimsiz tutarının hesaplanması
            urunTutari = miktar * fiyat;

            //Ürününlerin indirimsiz toplam tutarı
            toplamTutar += urunTutari;

            //İndirimli ürünlerin indirim tutarlarının hesaplanması
            if(indirimVarMi){
                urunIndirimliTutar = urunTutari - (urunTutari * indirimOrani) / 100;
                toplamIndirimTutari += urunIndirimliTutar;
            } else  urunIndirimliTutar = urunTutari;

            //Her bir ürünün bilgierini yazacak metodun çağrılması
            alisVerisFisPrint(urunAdi, miktar, fiyat, indirimVarMi, urunTutari, urunIndirimliTutar, indirimOrani);
        }
            fisTutari = toplamTutar - toplamIndirimTutari;
            System.out.println("Toplam ürün tutarı         : " + toplamTutar + " TL");
            System.out.println("Toplam indirim tutarı      : " + toplamIndirimTutari + " TL");
            System.out.println("Alış-veriş toplam tutarı   : " + fisTutari + " TL");
            System.out.println("----------------------------------------");
        }

    //Alış-veriş fiş yazdırma metodu.
    private static void alisVerisFisPrint(String urunAdi, double miktar, double fiyat, boolean indirimVarMi, double urunTutari, double urunIndirimliTutar, int indirimOrani) {
        //Alış-veriş fişinin yazdırılması
        System.out.println("Ürünün adı      : " + urunAdi);
        System.out.println("Miktarı         : " + miktar);
        System.out.println("Fiyatı          : " + fiyat);
        System.out.println("İndirimde mi?   : " + (indirimVarMi ? "Evet" : "Hayır"));
        System.out.println("İndirim oranı(%): " + indirimOrani + " (%)");
        System.out.println("Ürün Tutarı     : " + urunTutari + " TL");
        System.out.println("İndirimli Tutar : " + urunIndirimliTutar + " TL");
        System.out.println("----------------------------------------");
    }

}

