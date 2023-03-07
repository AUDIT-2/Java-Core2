package Day14_ForLoopBreakContinue;

public class ForLoopCarpimTablosu1 {
    public static void main(String[] args) {
        System.out.println("For .... loop");
        System.out.println("Çarpım tablosu");
        System.out.println("--------------");
        System.out.println();
        int sonuc;
        for (int i = 1; i <= 10; i++) {
            if (i==6 || i==9 || i==10){
                System.out.println( i + "'lar........");
            }else  System.out.println( i + "'ler........");

            for (int j = 1; j <= 10; j++) {
                sonuc = i * j;
                System.out.println("Sonuç = " + i + "*" + j + "=" + sonuc);
            }
            System.out.println();
        }
    }
}
