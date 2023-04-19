/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day33_Constructors2;

public class Ogrenci {
    //Data members--> properties, attributes, fields, states
    int number;
    String name;
    int age;
    String country;
    String city;

    public Ogrenci() {
        System.out.println("No args-default constructor called.");
    }

    public Ogrenci(int number, String name, int age, String country, String city) {
       /* this.number = number;
        this.name = name;*/
        this(number,name); //Constructor chaining---> calling a constructor from inside the other constructor
        this.age = age;
        this.country = country;
        this.city = city;

        System.out.println("All properties passed to this constructor.");
    }

    public Ogrenci(String name) {
        this.name = name;
        this.age = 15;
        this.country = "ülke bigisi yok";
        this.city = "şehir bilgisi yok.";
        System.out.println("Only name property passed to this constructor.");
    }
    public Ogrenci(int number, String name) {
        this(name); //Constructor chaining---> calling a constructor from inside the other constructor
        this.number = number;
       /* this.name = name;*/
        System.out.println("number and name properties passed to this constructor.");
    }

    public Ogrenci(String name, String country) {
        this.name = name;
        this.country = country;
        System.out.println("name and country properties passed to this constructor.");
    }

    public String ogrenciListeFormatted(){
       //System.out.printf("%-10d %-15s %-25s %-25s %n",number,name,city,country);
        String strFormat = "%-10d %-15s %-25s %-25s %n";
        return String.format(strFormat,number,name,city,country);
    }
    @Override
    public String toString() {
        if(name == null) name ="Boş";
        if(country == null) country ="Boş";
        if(city == null) city ="Boş";
        return  "Ogrenci no  : " + number + "\n" +
                "Öğrenci ad  : " + name + " \n" +
                "Öğrenci Yaşı: " + age + " \n" +
                "Country     : " + country + " \n" +
                "City        : " + city + "\n";
    }
}
