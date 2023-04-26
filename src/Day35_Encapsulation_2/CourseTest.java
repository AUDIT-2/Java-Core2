/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

public class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("SDET",100);
        Course course2 = new Course("Software Development",150);

        System.out.println("course1 = " + course1);
        System.out.println("course2 = " + course2);
    }
}
