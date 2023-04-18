/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day32_Constructors1;

public class Circle {
    //Data fields, state, attribute, property
    double radius;
    double height;

    /*Constructor metodlarının temel amacı class lardan oluşturulacak olan nesnelerin
      Data field, attribute, variable, state, properties
      alanlarına başlangıç değerlerini(initial values) atamaktır.
    */
    public Circle(){
        System.out.println("No args constructor invoked/called.");
        this.height = 1;
    }

    /*Constructor metodlarının temel amacı class lardan oluşturulacak olan nesnelerin
      Data field, attribute, variable, state, properties
      alanlarına başlangıç değerlerini(initial values) atamaktır.
    */
    public Circle(double radius, double height){
        System.out.println("Parameterized constructor invoked/called.");
        this.radius = radius; //Constructor'a parametre olarak gönderilen değeri radius değişkenine atama işlemi
        this.height = height; //Constructor'a parametre olarak gönderilen değeri height değişkenine atama işlemi
    }

    //Behavior-method-function-davranış-metod
    public void setRadius(double radius){
        this.radius = radius;
    }
    /*public void getArea(){
       double area = 0.0;
       area = radius * radius * Math.PI;
        System.out.println("Dairenin alanı = " + area);
    }*/
     /*public void getVolume(double height){
        double volume = 0.0;
        volume =  radius * radius * Math.PI * height;
        System.out.println("Silindirin hacmi = " + volume);
    }*/

    //Behavior-method-function-davranış-metod
    public double getArea(){
       return radius * radius * Math.PI;
    }

    //Behavior-method-function-davranış-metod
    public double getVolume(){
       return getArea() * height;
    }

    public String showInfo(){
        String str = "";
        str += "Dairenin yarıçapı = " +this.radius + "\n";
        str += "Dairenin alanı    = " + this.getArea() + "\n";
        str += "Silindirin hacmi  = " + this.getVolume();
        return str;
    }
}
