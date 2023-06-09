/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
           Java'da sekiz ilkel(primitive) veri türü vardır:
            1  byte = 8 bit

            Data Type	Size	    Description
            _________   ________    _____________________________________________________
            byte	    1 byte	    Tam sayılar	-128 to 127
            short	    2 bytes	    Tam sayılar	-32,768 to 32,767
            int	        4 bytes	    Tam sayılar	-2,147,483,648 to 2,147,483,647
            long	    8 bytes	    Tam sayılar	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	    4 bytes	    Küsüratlı sayılar. Sufficient for storing 6 to 7 decimal digits
            double	    8 bytes	    Küsüratlı sayılar. Sufficient for storing 15 decimal digits
            boolean	    1 bit	    Stores true or false values
            char	    2 bytes	    Stores a single character/letter: ASCII or Unicode values
         */

        byte myByte = 127;
        short myShort = 15828;
        int myInt = 2146888888;
        long myLong = 1111323423567889012L;
        float myFloat = 11234455666234244423424424564566759999.67879999999999999999999999999999999999999999F;
        double myDouble = 123123123189472489214981258925094281948345389723415929999999999999999168248724787245.999999999999999999999999999999999999999999999999999999d;
        char harf = 'A';
        boolean isOn = false;
    }
}
