/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

public class TreeDimArray {
    public static void main(String[] args) {

        // int[][][] ogrNotlari = new int[3][2][2]; //3 öğrencinin 2 dersine ait her bir ders için 2 ders notu
        int[][][] ogrNotlari = {
                {{75, 45}, {95, 60}},
                {{60, 80}, {70, 50}},
                {{50, 85}, {40, 70}}
        };

        /*ogrNotlari[0][0][0] = 75; //1. öğrencinin birinci dersinin birinci notu
        ogrNotlari[0][0][1] = 45; //1. öğrencinin birinci dersinin ikinci notu
        ogrNotlari[0][1][0] = 95; //1. öğrencinin ikinci dersinin birinci notu
        ogrNotlari[0][1][1] = 60; //1. öğrencinin ikinci dersinin ikinci notu

        ogrNotlari[1][0][0] = 60; //2. öğrencinin birinci dersinin birinci notu
        ogrNotlari[1][0][1] = 80; //2. öğrencinin birinci dersinin ikinci notu
        ogrNotlari[1][1][0] = 70; //2. öğrencinin ikinci dersinin birinci notu
        ogrNotlari[1][1][1] = 50; //2. öğrencinin ikinci dersinin ikinci notu

        ogrNotlari[2][0][0] = 50; //3. öğrencinin birinci dersinin birinci notu
        ogrNotlari[2][0][1] = 85; //3. öğrencinin birinci dersinin ikinci notu
        ogrNotlari[2][1][0] = 40; //3. öğrencinin ikinci dersinin birinci notu
        ogrNotlari[2][1][1] = 70; //3. öğrencinin ikinci dersinin ikinci notu*/

        for (int ogrNo = 0; ogrNo < ogrNotlari.length; ogrNo++) {//Herbir öğrenciyi dolaşır--
            System.out.println("--------------------");
            System.out.println("Öğrenci numarası : " + (ogrNo + 1));
            for (int ders = 0; ders < ogrNotlari[ogrNo].length; ders++) {
                System.out.println("--------------------");
                System.out.println("Ders no : " + (ders + 1));
                System.out.println("Notlar : ");
                for (int notlar = 0; notlar < ogrNotlari[ogrNo][ders].length; notlar++) {
                    System.out.println(("   " + (notlar + 1) + ".not : " + ogrNotlari[ogrNo][ders][notlar]));
                }
            }
            System.out.println("*********************************");
        }
    }
}
