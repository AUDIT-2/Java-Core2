package Day31_ArrayList.Otopark;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OtoparkNEW {
    String name;
    String address;
    int maxCapacity;
    int emptyCapacity;
    final double SAAT_UCRETI = 15.0;
    ArrayList<ArabaNEW> parkAreaList;
    ArrayList<ArabaNEW> parkLogList;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");

    public OtoparkNEW() throws InterruptedException {
        this.name="Belediye otoparkı";
        this.address = "Falanca yerdeki otopark no=12";
        this.maxCapacity = 100;
        parkAreaList = new ArrayList<>();
        parkLogList = new ArrayList<>();

        ArabaNEW araba1 = new ArabaNEW("Honda","06ABC007");
        ArabaNEW araba2 = new ArabaNEW("Audi","FAA345");
        ArabaNEW araba3 = new ArabaNEW("Şahin","38KY123");
        ArabaNEW araba4 = new ArabaNEW("BMW","123-ABC-34");
        ArabaNEW araba5 = new ArabaNEW("BMW","790-XYZ-45");
        ArabaNEW araba6 = new ArabaNEW("Audi","ABC-345");

        this.otoparkGiris(araba1);
        Thread.sleep(1000);

        this.otoparkGiris(araba2);
        Thread.sleep(3000);

        this.otoparkGiris(araba3);
        Thread.sleep(3000);

        this.otoparkGiris(araba4);
        Thread.sleep(5000);

        this.otoparkGiris(araba5);
        Thread.sleep(2000);

        this.otoparkGiris(araba6);
        Thread.sleep(1000);
    }

    public void otoparkGiris(ArabaNEW araba){
        if(araba.marka.isEmpty() || araba.plateNumber.isEmpty() || araba.marka.isBlank() || araba.plateNumber.isBlank()){
            System.out.println("boş geçemez");
        } else {
            for (ArabaNEW araba1: parkAreaList){
                if(araba1.plateNumber.equals(araba.plateNumber)){
                    System.out.println(araba.marka +" Marka " + araba.plateNumber + " plakalı araç otoparkta park halinde. Giriş yapamazsınız!");
                    return;
                }
            }
            parkAreaList.add(araba);
            araba.enterDateTime= LocalDateTime.now();
            System.out.println(araba.plateNumber +" plakalı " + araba.marka.toUpperCase()  + " marka araç" + " otoparka giriş yaptı.\t" + LocalDateTime.now().format(formatter));
        }
    }
    public void otoparkCikis(String plaka){
        if(!searchByPlateNumber(this.parkAreaList,plaka).isEmpty()){
            for(ArabaNEW araba : searchByPlateNumber(this.parkAreaList,plaka)) {
                this.parkAreaList.remove(araba);
                araba.exitDateTime= LocalDateTime.now();
                araba.sureHesapla();
                logYaz(araba);
                System.out.println(araba.plateNumber +" plakalı " + araba.marka.toUpperCase()  + " marka araç" + " otoparktan çıkış yaptı." + LocalDateTime.now().format(formatter));
            }
        }else System.out.println(plaka + " plakalı araç kaydı otopark kayıtlarında yok!");
    }

   public void bosAracKapasite(){
       this.emptyCapacity = this.maxCapacity - parkAreaList.size();
        System.out.println("Otoparkta " + this.emptyCapacity + " araçlık boş alan var.");
    }
    public void logYaz(ArabaNEW araba){
        parkLogList.add(araba);
    }
   public void aracListeYaz(ArrayList<ArabaNEW> list, String mesaj,boolean header){
        if(!list.isEmpty()){
            if (header){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println(this.name.toUpperCase());
                System.out.println(this.address);
                System.out.println(LocalDateTime.now().format(formatter));
                System.out.println("---------------------------------------------------------------------------------------------");
            }

            System.out.println(mesaj + " kayıtlarımızdaki araç bilgileri");
            System.out.println("Sıra No   Markası    Plakası     Giriş tarihi/saati    Çıkış tarihi/saati     Süre");
            System.out.println("-------   ---------- ----------  --------------------  --------------------   ---------------");
            int sayac = 0;
            for (ArabaNEW araba: list){
                sayac++;
                System.out.printf("%-7d   %-10s %-10s  %-10s  %-10s   %-10s%n",sayac,araba.marka,
                                                                araba.plateNumber,
                                                                araba.enterDateTime.format(formatter),
                                                                araba.exitDateTime==null ? "Araç otoparkta" : araba.exitDateTime.format(formatter),
                                                                araba.exitDateTime!=null ? araba.kalisSure / 60 + " saat " + araba.kalisSure % 60 + " dakika ": "");
            }
            System.out.println();
        } else System.out.println(mesaj + " kayıtlarında araç kaydına rastlanılmadı!");
    }


   public ArrayList<ArabaNEW> searchByPlateNumber(ArrayList<ArabaNEW> list,String plaka){
        ArrayList<ArabaNEW> resultList = new ArrayList<>();
        for (ArabaNEW araba : list) {
            if (araba.plateNumber.equals(plaka)) {
                resultList.add(araba);
            }
        }
        return resultList;
    }

    public void ucretHesapla(String plaka) {
        long sure;
        double tutar = 0.0;

        ArrayList<ArabaNEW> arabaList = searchByPlateNumber(parkLogList, plaka);

        if (!arabaList.isEmpty()) {
            ArabaNEW araba = arabaList.get(0);
            sure = araba.kalisSure;

            System.out.println("Otoparkta kalınan süre : ");
            System.out.println("-------------------------");
            System.out.println("    " + sure / 60 + " saat " + sure % 60 + " dakika ");

            if (sure <= 30) {
                System.out.println("* İlk 30 dk ücretsizdir. *");
                sure = 0;
            } else if (sure < 60) {
                sure = 60; //30 ile 60 dk arası da 1 saat ücreti hesaplanıyor.
            }
            tutar = (SAAT_UCRETI * sure) / 60; //Ücretlendirme saat cinsinden olduğundan sure-->dakika
            System.out.println("    TUTAR   = " + tutar + " TL");
            System.out.println("-------------------------");
        }
    }
}
