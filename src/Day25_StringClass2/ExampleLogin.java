/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

import java.util.Scanner;

public class ExampleLogin {
    public static void login(String userName, String password){
        //Vaid Username and password
        String loginUserName = "Ahmet";
        String loginPassword = "Abc1234";

        //Login check
        if((userName.isBlank() || userName.isEmpty()) && (password.isBlank() || password.isEmpty()) ){
            System.out.println("User name and password fields can not be blank or empty!");
        } else if (userName.isBlank() || userName.isEmpty()){
            System.out.println("User name can not be blank or empty");
        } else if (password.isBlank() || password.isEmpty()){
            System.out.println("Password can not be blank or empty");
        } else if (!loginUserName.equals(userName) || !loginPassword.equals(password) ){
            System.out.println("User name or password is not valid!");
        }else System.out.println("You are successfully logged in the system.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = "";
        String password = "";

        System.out.print("Please enter your username : ");
        userName = scanner.nextLine();

        System.out.print("Please enter your password : ");
        password = scanner.nextLine();

        login(userName,password);

        //Testing data
       /* login("","");
        login("Ahmet","");
        login("","xyz1133");
        login("Ali","1234");
        login("Ahmet","Abc1234");*/
    }
}
