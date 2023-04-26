/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

public class Teacher {
    private static int id = 5000;
    private int teacherId;
    private String name;
    private double salary;

    public Teacher(String name, double salary) {
        setId();
        setTeacherId(id);
        setName(name);
        setSalary(salary);
    }

    private void setId() {
        id++;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
