package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopTerstenSay {
    //Klavyeden girilen tamsayıdan geriye doğru sayan program
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayac = 0;

        System.out.print("Geri sayım için klavyeden bir tam sayı giriniz---> ");
        sayac = klavye.nextInt();

        while (sayac > 0){
           // System.out.print(sayac + "\r"); //"\r" Escape character "BackSpace" geriye silme.
            System.out.println("sayac = " + sayac);
            sayac--; //sayac = sayac - 1
        }
    }
}
