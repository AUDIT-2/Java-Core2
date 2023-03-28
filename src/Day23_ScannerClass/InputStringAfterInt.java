package Day23_ScannerClass;

import java.util.Scanner;

public class InputStringAfterInt {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String name;
        int age;

        System.out.print("Lütfen Yaşınızı giriniz : ");
        age = sc.nextInt(); // Enter a bastığımızda nextInt() integer kısmını okur ve "\n" new line karakteri bufferda kalır

        //input olarak sayısal bir değerden sonra String tipinde bir değer okunacaksa klavye bufferının boşaltılması gerekir.
        sc.nextLine(); //Klavye bufferını boşaltır.

        System.out.print("Lütfen Adınızı giriniz : ");
        name = sc.nextLine();

        System.out.println(name + " " + age + " yaşındadır.");
    }
}
