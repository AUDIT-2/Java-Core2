package Day28_REVIEW_Arrays;

import java.util.Arrays;

public class PassingArrayToMethod {
    public static void buyukHarfeCevir(String[] dizi){
        //Parametre olarak gelen dizininin elemanlarını büyük harfe çevirip ekrana yazar
        System.out.println("buyukHarfeCevir() metodundayım.");
        System.out.println("-----------------------------");
        System.out.println("Parametre olarak gelen dizi = " + Arrays.toString(dizi));

        for (String eleman: dizi ) {
            System.out.println(eleman.toUpperCase());
        }
    }

    public static String[] buyukHarfeCevirReturnet(String[] dizi){
        //Parametre olarak gelen diziyi işleme tabi tutup(herbir elemanını büyük harfe çevirme) geri dizi olarak Return eder.
        String[] result = new String[dizi.length];

        System.out.println("buyukHarfeCevirReturnet() metodundayım.");
        System.out.println("-----------------------------");
        System.out.println("Parametre olarak gelen dizi = " + Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++) {
            result[i] = dizi[i].toUpperCase();
        }
        return result; //İşlemden sonra Return edilen array.
    }

    public static void main(String[] args) {
        System.out.println("----------------------------");
        String[] isimler = {"Ahmet","Mehmet","Fatma"};

        for (String isim : isimler) {
            System.out.println("isim = " + isim);
        }
        buyukHarfeCevir(isimler);
        System.out.println("Dizinin orijinal hali = " + Arrays.toString(isimler));

        String[] buyukHarfli = buyukHarfeCevirReturnet(isimler);
        //isimler = buyukHarfeCevirReturnet(isimler); //orijinal diziyi metoddan gelen diziye dönüştürmek istersek
        System.out.println("Dizinin orijinal hali = " + Arrays.toString(isimler));
        System.out.println("Dizinin yeni hali = " + Arrays.toString(buyukHarfli));

        for (String isim : buyukHarfli) {
            System.out.println("isim = " + isim);
        }
    }
}
