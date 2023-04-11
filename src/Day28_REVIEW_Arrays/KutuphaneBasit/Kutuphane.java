package Day28_REVIEW_Arrays.KutuphaneBasit;

import java.util.Scanner;

public class Kutuphane {
    public static void main(String[] args) {
        Book[] kitaplar = new Book[3];

     /*   kitaplar[0] = new Book();
        kitaplar[1] = new Book();
        kitaplar[2] = new Book();

        kitaplar[0].name = "Suç ve Ceza";
        kitaplar[0].author = "Dostoyevski";
        kitaplar[0].isbn = 12344533;
        kitaplar[0].dateofPublish = 1870;

        kitaplar[1].name = "Sefiller";
        kitaplar[1].author = "Victor Hugo";
        kitaplar[1].isbn = 9865433;
        kitaplar[1].dateofPublish = 1862;*/

        Scanner veriGir = new Scanner(System.in);

        for (int i = 0; i < kitaplar.length; i++) {
            kitaplar[i] = new Book();

            System.out.print("KitapNEW adını giriniz : ");
            kitaplar[i].name =  veriGir.nextLine().trim();
            System.out.print("YazarNEW adını giriniz : ");
            kitaplar[i].author = veriGir.nextLine().trim();
            System.out.print("Basım tarihi : ");
            kitaplar[i].dateofPublish = veriGir.nextInt();

            String devammi = "";
            if (i < kitaplar.length-1){ //son kitaptan sonra devam edip etmeyeceğimizi sorma
                System.out.print("KitapNEW eklemeye devam edecek misiniz? ");
                veriGir.nextLine(); //.nextInt() metodundan sonra bufferda kalanları boşaltmak için
                devammi = veriGir.nextLine().trim();
                if (devammi.equals("hayır")){
                    break;
                }
            }

        }
        System.out.println();
        System.out.println("KitapNEW listesi");
        System.out.println("--------------");
        for (Book kitap: kitaplar) {
           if(kitap != null){ //Oluşturulmuş kitapları listele
                System.out.println("kitap.name = " + kitap.name);
                System.out.println("kitap.author = " + kitap.author);
            }

          /*
          if(kitap == null) continue; //kitap nesnesi oluşturulmamışsa döngünün başına git.
            System.out.println("kitap.name = " + kitap.name);
            System.out.println("kitap.author = " + kitap.author);
            */
        }

    }

}
