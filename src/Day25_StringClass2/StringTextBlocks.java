/*
 *
 *  * Copyright (c) 2023.
 *  * SDET JAVA-11 Java Core
 *  * Armada-prog
 *  * armada.dscrd@gmail.com
 *
 */

package Day25_StringClass2;

public class StringTextBlocks {
    public static void main(String[] args) {

        // Using a literal string
        String literalString = "ahmetahmet";

        // Using a text block
        String textBlockString = """
                ahmetahmet""";

        System.out.println("literalString = " + literalString);
        System.out.println("textBlockString = " + textBlockString);
        System.out.println(literalString.equals(textBlockString)); // true

        // ERROR
        /* String name = """Ahmet Falanca"""; */

        // ERROR
        /* String colors = """red
                 green
                 blue
                 """; */

        // Multiline example
        String oldMultiline = "In the sad moonlight, \n" +
                "she clasped him by the neck, \n" +
                "and laid her face upon his breast. ";
        System.out.println(oldMultiline);

        String newMultiline = """
                In the sad moonlight,
                she clasped him by the neck,
                and laid her face upon his breast.
                """;
        System.out.println(newMultiline);

        // JSON object with text blocks
        System.out.println(getResultAsJson());

        // SQL blocks
        System.out.println(getSQLQuery());

        String str = "Ali";
        String txtStr = """
                Hasan""";
        System.out.println("txtStr = " + txtStr);
        txtStr +=" "  +  str;
        System.out.println("str = " + str);
        System.out.println("txtStr = " + txtStr);


    }

    private static String getSQLQuery() {
        return """
                SELECT *
                FROM customers
                WHERE first_name = 'Hasan'
                ORDER BY last_name ASC;
                """;
    }

    private static String getResultAsJson() {
        return """
                {
                  "id": 1235,
                  "title": "Example Product",
                  "description": "A product which is nothing like apple",
                  "price": 549
                }
                """;
    }

}