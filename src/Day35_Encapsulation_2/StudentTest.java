/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmet",100);
        Student student2 = new Student("Mehmet",1500);
        Student student3 = new Student("Mehmet",1500);
        System.out.println("student1.getStudentId() = " + student1.getStudentId());
        System.out.println("student2.getStudentId() = " + student2.getStudentId());
        System.out.println("student3.getStudentId() = " + student3.getStudentId());
    }
}
