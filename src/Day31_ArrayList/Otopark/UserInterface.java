package Day31_ArrayList.Otopark;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private OtoparkNEW otopark;

    public UserInterface(OtoparkNEW otopark, Scanner scanner){
        this.otopark=otopark;
        this.scanner=scanner;
    }

    public void start(){
        menu();
    }

    private void menu() {
        int secim;
        menuControl:
        while (true){
            System.out.println("----------------------------------");
            System.out.println(otopark.name);
            System.out.println(otopark.address);
            System.out.println("----------------------------------");
            System.out.println("***** M e n u *****");
            System.out.println("1- Araç girişi");
            System.out.println("2- Araç çıkışı");
            System.out.println("3- Otoparktaki araçların listesi");
            System.out.println("4- LOG listesi");
            System.out.println("5- Boş araç kapasitesi");
            System.out.println("6- Araç bul");
            System.out.println("8- Programdan çıkış");
            System.out.println("----------------------------------");
            System.out.print("Seçiminiz....: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim){
                case 1:
                    System.out.println("Araç giriş menüsü");
                    System.out.println("-----------------");
                    while (true){
                        aracGiris();
                        System.out.println("Devam etmek için 'ENTER' a basınız. Ana menü için 'M' veya 'm' giriniz.");
                        System.out.print("Seçiminiz : ");
                        String karar = scanner.nextLine();
                        if(karar.equals("M") || karar.equals("m") ){
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Araç çıkış menüsü");
                    System.out.println("-----------------");
                    while (true){
                        aracCikis();
                        System.out.println("Devam etmek için 'ENTER' a basınız. Ana menü için 'M' veya 'm' giriniz.");
                        System.out.print("Seçiminiz : ");
                        String karar = scanner.nextLine();
                        if(karar.equals("M") || karar.equals("m") ){
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Araçların listesi");
                    aracListe();
                    System.out.println("*** Ana menüye dönmek için ENTER a basınız ***");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("LOG listesi");
                    aracListeLOG();
                    System.out.println("*** Ana menüye dönmek için ENTER a basınız ***");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Otoparktaki boş kapasite");
                    otoparkKapasite();
                    System.out.println("*** Ana menüye dönmek için ENTER a basınız ***");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Araç kaydı bul");
                    aracBul();
                    break ;

                case 8:
                    System.out.println("Programdan çıkılıyor.");
                    break menuControl;
                default:
                    System.out.println("Yanlış seçim");

            }
        }
    }

    private void aracBul() {
        System.out.println("Araç bilgileri");
        System.out.println("--------------------------------");
        System.out.print("Araç plakasını giriniz : ");
        String plaka = scanner.nextLine();

        otopark.aracListeYaz(otopark.searchByPlateNumber(otopark.parkAreaList, plaka),"Otopark",true);
        otopark.aracListeYaz(otopark.searchByPlateNumber(otopark.parkLogList, plaka),"Otopark(LOG)",false);
    }

    private void aracCikis() {
        String plaka;
        System.out.println("Otopark Araç çıkışı.");
        System.out.println("--------------------");
        System.out.print("Araç plakasını giriniz : ");
        plaka = scanner.nextLine();
        otopark.otoparkCikis(plaka);
        otopark.ucretHesapla(plaka);
    }

    private void aracGiris() {
        String marka;
        String plaka;

        System.out.println("Otopark Araç girişi.");
        System.out.print("Araç markasını giriniz : ");
        marka = scanner.nextLine();

        System.out.print("Araç plakasını giriniz : ");
        plaka = scanner.nextLine();

        if((marka.isBlank() || plaka.isBlank())){
            System.out.println("Boş");
        }else{
            ArabaNEW araba = new ArabaNEW(marka,plaka);
            otopark.otoparkGiris(araba);
        }
    }

    private void otoparkKapasite() {
        System.out.println("Otopark kapasite = " + otopark.maxCapacity);
        otopark.bosAracKapasite();
    }

    private void aracListeLOG() {
       System.out.println("Araç listeleme metodu(LOG)");
       otopark.aracListeYaz(otopark.parkLogList,"OTOPARK(LOG)",true);
    }

    private void aracListe(){
      System.out.println("Araç listeleme metodu");
      otopark.aracListeYaz(otopark.parkAreaList,"OTOPARK",true);
  }

}
