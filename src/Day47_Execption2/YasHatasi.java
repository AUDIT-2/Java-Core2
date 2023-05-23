/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Execption2;

//User defined exception.
public class YasHatasi extends RuntimeException {//RunTimeException-Unchecked
    public YasHatasi(String message) {
        super(message);
    }
}
