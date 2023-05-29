/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception2.UserDefinedException;

//Checked exception olduğundan bu exception ı throw eden metodları çağıranlar compile-time da handling mekanızması kurmak zorundadır.
public class NameException extends Exception{//Checked exception

    public NameException(String message) {
        super(message);
    }
}
