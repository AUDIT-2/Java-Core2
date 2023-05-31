/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.MAP;

public class PersonKisi {
    int TCKNO;
    String name;
    String address;

    public PersonKisi(int TCKNO, String name, String address) {
        this.TCKNO = TCKNO;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonKisi(toString){" +
                "TCKNO=" + TCKNO +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
