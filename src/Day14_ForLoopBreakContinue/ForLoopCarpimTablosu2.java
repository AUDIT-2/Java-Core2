package Day14_ForLoopBreakContinue;

public class ForLoopCarpimTablosu2 {
    public static void main(String[] args) {
        System.out.println("\t\tBir başka gösterimle Çarpım Tablosu");
        int altcizgi, i, j;
        System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10 ");

        for(altcizgi=1; altcizgi<=50; altcizgi++) //döngüyle uzunca bir çizgi çizelim
        {
            System.out.print("-");
        }
        System.out.println();
        for (i =1; i<=10; i++)
        {
            System.out.print(i + "\t|\t");
            for (j=1 ; j<=10 ; j ++)
            {
                System.out.print(i * j +"\t"); //Çarpım işlemi
            }
            System.out.println();
        }
    }
}
