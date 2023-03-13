package Day14_ForLoopBreakContinue;

public class ForLoopChronometer {
    public static void main(String[] args) {
        System.out.println("Nested for loop chronometer simulation");
        long bekle = 0;
        for (int saat = 0; saat < 24; saat ++) {
            for (int dakika = 0; dakika < 60; dakika++) {
                for (int saniye = 0; saniye < 60; saniye++) {
                    for (int salise = 0; salise < 100; salise++) {
                        System.out.print("\r" + saat + ":" + dakika + ":" + saniye + ":" + salise );
                        for (int counter = 0; counter < 3_500_0000; counter++) {
                           bekle = bekle + counter; //CPU'yu meşgul etmek için yapılan bir işlem
                        }
                        bekle = 0;
                    }
                }
            }
        }
    }
}
