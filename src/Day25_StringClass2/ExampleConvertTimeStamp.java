/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class ExampleConvertTimeStamp {
    public static String timeStamp(String date){
        date = date.replace("/","");
        date = date.replace(" ","");
        date = date.replace(":","");
        return date;
    }

    public static String timeStamp(String date,String special){
        for (int i = 0; i < special.length(); i++) {
            date = date.replace((special.charAt(i) + ""),"");
        }
        return date;
    }
    public static void main(String[] args) {
        String date = "30/12/2021 17:35:00";

        System.out.println(timeStamp(date));

        System.out.println("timeStamp(date,\"/ :\") = " + timeStamp(date, "/ :"));

    }
}
