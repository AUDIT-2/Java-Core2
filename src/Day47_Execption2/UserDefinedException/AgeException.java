/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Execption2.UserDefinedException;

public class AgeException extends RuntimeException{//Unchecked

    public AgeException(String message) {
        super(message);
    }
}
