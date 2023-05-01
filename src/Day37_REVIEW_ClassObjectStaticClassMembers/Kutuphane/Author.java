/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Kutuphane;

import java.util.ArrayList;

public class Author {
    private static int id = 9000;
    private int authorNo;
    private String name;

    public Author(String name) {
        id++;
        setAuthorNo(id);
        setName(name);
    }

    public int getAuthorNo() {
        return authorNo;
    }

    public void setAuthorNo(int authorNo) {
        this.authorNo = authorNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Author{" +
                "authorNo=" + authorNo +
                ", name='" + name + '\'' +
                '}';
    }

}
