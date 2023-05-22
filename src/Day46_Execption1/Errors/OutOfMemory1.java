/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Execption1.Errors;

public class OutOfMemory1 {
    public static void main(String[] args) {
        String str = "Ahmet";
        System.out.println(str);

        while (true){
            try {
                str += str;
            }
            catch (OutOfMemoryError e){
                System.out.println("Bir hata oluştu.");
                System.out.println(e.getMessage());
                e.printStackTrace();
                break;
                //System.exit(100);
            }
            catch (Error e){
                System.out.println("Bir hata oluştu.");
            }
        }
    }
}
