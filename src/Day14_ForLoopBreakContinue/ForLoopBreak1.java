package Day14_ForLoopBreakContinue;

import java.util.Random;

public class ForLoopBreak1 {
    public static void main(String[] args) {
        Random rastgeleSayi = new Random();
        int randomSayi=0;
        randomSayi = rastgeleSayi.nextInt(100);

        for (int i = 0; i < 100; i++) {
            if(i == randomSayi){
                System.out.println("Rastgele sayıyı buldunuz!");
                System.out.println("Tuttuğum rastgele sayı = " + randomSayi);
                break;
             }
            System.out.println("Döngünün i değeri = " + i);
        }
    }
}
