package Day46_Execption1.Exceptions;

import java.util.Scanner;

public class MultipleExceptions1 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        try {
            System.out.print("Lütfen bir tam sayı giriniz : ");
            int sayi = Integer.parseInt(klavye.nextLine());

            System.out.print("Lütfen bölen olarak bir tam sayı giriniz : ");
            int bolen = Integer.parseInt(klavye.nextLine());
            System.out.println("Sayı  : " + sayi);
            System.out.println("Bölen : " + bolen);

            int islem = sayi / bolen; //bolen = 0 olursa ArithmeticException hatası yanı 0'a bölünme hatası oluşacak.

            String str = null;
            System.out.println(str.charAt(0)); //Hata: null olan bir String in ilk karakterini okumaya çalışıyoruz.
        }
        catch (NumberFormatException e){
           // e.printStackTrace();
            System.out.println("NumberFormatException has occurred.");
            System.err.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
            System.err.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException has occurred.");
            System.out.println("O a bölünme hatası.");
            System.err.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
            System.err.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
            System.out.println(e);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException has occurred.");
            System.out.println("String değeri null olduğu için hata oluştu.");
            System.err.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
            System.err.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
        }
        catch (Exception e){
            System.out.println("Exception has occurred.");
            e.printStackTrace();
            System.out.println("Bir hata oluştu.");
        }
    }
}
