/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day30_WrapperClass2;

import java.util.Scanner;

public class WrapperPasswordCheck {

    public static void main(String[] args) {
        System.out.println("Finding Letters, Digits and, Special Chars in a String");
        String str ="AbcŞxyz";

        Scanner veriGir = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz(10) : ");
        str = veriGir.nextLine();

        String letters = "";
        String digits = "";
        String specialChars = "";

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        int countDigits = 0;
        int countLetters = 0;
        int countSpecials = 0;

        if(str.length() >= 10){
            for (int i = 0; i < str.length(); i++) {
                //Collect the Letters
                if(Character.isLetter(str.charAt(i))){
                    letters += str.charAt(i);
                    hasLetter = true;
                    countLetters++;
                } else if(Character.isDigit(str.charAt(i))){//Collect the digits-numbers
                    digits += str.charAt(i);
                    hasDigit = true;
                    countDigits++;
                } else {//Collect the special chars
                    specialChars += str.charAt(i);
                    hasSpecial = true;
                    countSpecials++;
                }
            }
            System.out.println("str = " + str);
            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);
            System.out.println("specialChars = " + specialChars);

            System.out.println();
            //is String valid for password or not
            if(hasLetter && hasDigit && hasSpecial){
                if(countLetters >= 3 && countDigits >= 3 && countSpecials >= 3) {
                    System.out.println(str + " pasword is valid.");
                }else {
                    System.out.println(str  + " pasword is not valid!!!");}
            }else {
                System.out.println(str  + " pasword is not valid!!!");
                if(!hasLetter){
                    System.out.println("Password does not have any Letters.");
                }
                if(!hasDigit){
                    System.out.println("Password does not have any Digits.");
                }
                if(!hasSpecial){
                    System.out.println("Password does not have any Special chars.");
                }
            }
        }else System.out.println("Password must be at least 8 chars!!!");

    }
}
