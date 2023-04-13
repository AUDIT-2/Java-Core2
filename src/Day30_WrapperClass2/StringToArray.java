package Day30_WrapperClass2;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String str = "Ahmet-Mehmet-Hasan-Hatice";
        String[] strArray = str.split("-");

        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));

        System.out.println("strArray[2] = " + strArray[2]);
        System.out.println("strArray[1] = " + strArray[1]);
    }
}
