package Day46_Exception1.Errors;

import java.util.ArrayList;

public class OutOfMemoryErrorHeap {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        int sayac = 0;

        while (true){
            try{
                strArrList.add("Out of Memory Error-Java heap space.");
                sayac++;
            } catch (OutOfMemoryError error){
                System.out.println("HEAP hafıza alanı yetersiz.");
                error.printStackTrace();

                //strArrList.removeAll(strArrList);
                break;
            }
            if(sayac % 10000 == 0){
                System.out.println("Array size             : " +  strArrList.size());
                System.out.println("Avaliable total memory : " + Runtime.getRuntime().totalMemory());
                System.out.println("Avaliable free memory  : " + Runtime.getRuntime().freeMemory());
                System.out.println();
            }
        }
    }
}
