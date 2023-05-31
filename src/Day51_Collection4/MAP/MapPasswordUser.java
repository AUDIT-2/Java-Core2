/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapPasswordUser {
    public static void main(String[] args) {
        //<Key,Value>
        // <UserName,Password>
        Map<String,String> userPasswordList = new HashMap<>();

        userPasswordList.put("ahmet","ahmet12345");
        userPasswordList.put("kadir","ahmet12345");
        userPasswordList.put("mehmet","12345");
        userPasswordList.put("mery","Qwerty");

        String userName = "mehmet";
        String passWord = "12345";

        for (Map.Entry<String,String> userEntry : userPasswordList.entrySet()){
            if(userName.equals(userEntry.getKey()) && (passWord.equals(userEntry.getValue()))){
                System.out.println("userEntry = " + userEntry);
                System.out.println("Login is successful.");
            } else {
                System.out.println("userEntry = " + userEntry);
                System.out.println("Username or password is not match!!!");
            }
        }



    }
}
