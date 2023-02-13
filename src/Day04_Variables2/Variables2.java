package Day04_Variables2;

public class Variables2 {
    public static void main(String[] args) {
        System.out.println("Variables-2 in Java.");
        System.out.println("Değişkenleri öğreniyoruz.");

        //Variable declaration
        //Yaş, kilo ve boy bilgilerini tutacak değişkenler

        /*
        Multi line comment- Çok satırlı yorum- açıklama bloğu
        -1. Yorum satırı
        -2. Yorum satırı
         */

        byte yas = 45;
        short kilo;
        float boy;

        kilo = 98; //Kilogram cinsinden
        boy = 1.78F; //Metre cinsinden veri ataması

        System.out.println(); //Ekrana-consola boş bir satır yazar.

        System.out.println("Yaşınız : " + yas); //Concatenation- birleştirme, yanyana getirme, yapıştırma
        System.out.println("Kilonuz : " + kilo);
        System.out.println("Boyunuz : " + boy);

        System.out.println("Yaşınız : " + yas + " , " + "Kilonuz : " + kilo + " , " + "Boyunuz : " + boy);

        System.out.println("Mehmet" + " Ali");
        System.out.println(3 + 5); //Aritmetik işlem-toplama

        System.out.println("3 + 5 = " + 3 + 5); // + operatörü işlem önceliği açısından soldan sağa hesaplama yapar
        //Ekran çıktısı..... 3 + 5 = 35 ---Concatenation

        System.out.println("3 + 5 = " + (3 + 5)); // Önce aritmetik (3+5)=8 parantez içerisi öncelik gereği işleme tabi olur.

        System.out.println("Ankara " + "başkenttir"); //Concatenation

        System.out.println( 4 + 5 + " sonuc.");
        // 4 + 5 ---> 9 aritmetik toplama işlemi
        // 9 + sonuc.  ---> concatenation

        System.out.println("Ankara" + "gücü");
        System.out.println("Ankara'nın plakası " + "06" + " dır.");
        System.out.println("Fener" + "bahçe");

        char harf; //tamsayı
        harf =65;
        System.out.println(harf + 5);
        harf = 70;
        System.out.println(harf);
    }

}
