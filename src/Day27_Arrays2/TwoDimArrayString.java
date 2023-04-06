package Day27_Arrays2;

import java.util.Arrays;

public class TwoDimArrayString {
    public static void main(String[] args) {

        String [] array= new String[] {"Ahmet","Mehmet","Fatma"};
        System.out.println("Printing one dim array with Arrays.ToString()  method");

        System.out.println(Arrays.toString(array));
        System.out.println();

        //Now let's create two dim array of string
        System.out.println("Printing two dim array with Arrays.deepToString()  method");

        String [][] arrayTwoDim = new String[][] {{"Mustafa","Ahmet"},{"Ayşe", "Melek"}};
        System.out.println(Arrays.deepToString(arrayTwoDim));

        System.out.println();
        System.out.println("Printing two dim array with nested For...Loop ");
        for (int i = 0; i < arrayTwoDim.length; i++) {
            for (int j = 0; j < arrayTwoDim[i].length; j++) {
                System.out.print(arrayTwoDim[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
