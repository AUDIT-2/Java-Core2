/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

public class TeacherTest {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ali Can",1500);
        Teacher teacher2 = new Teacher("Vel Can",1500);
        Teacher teacher3 = new Teacher("Can",1500);

        System.out.println("teacher1.getTeacherId() = " + teacher1.getTeacherId());
        System.out.println("teacher1.getTeacherId() = " + teacher2.getTeacherId());
        System.out.println("teacher1.getTeacherId() = " + teacher3.getTeacherId());

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
    }
}
