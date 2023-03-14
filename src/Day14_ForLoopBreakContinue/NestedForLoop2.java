package Day14_ForLoopBreakContinue;

public class NestedForLoop2 {
    public static void main(String[] args) {
        System.out.println("Nested for loop...");
        int sayac = 0;

        for (int i = 1; i <= 15; i++) {
            //Outer loop
            System.out.println(i+ " - Outer loop");
            for (int j = 1; j <=2 ; j++) {
                System.out.println(" ---> " + j + "-Inner loop");
                sayac++;
            }
        }
        System.out.println("İç döngünün tekrar sayısı = " + sayac);
    }
}
