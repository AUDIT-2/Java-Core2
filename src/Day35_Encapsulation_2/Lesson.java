/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day35_Encapsulation_2;

import java.util.ArrayList;

public class Lesson {
    private static int nextId;
    private String lessonId;
    private String lessonName;

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public Lesson(String lessonName) {
        setNextId();
       // this.lessonName = lessonName;
        setLessonName(lessonName);
        setLessonId();

        //teachers = new ArrayList<>();
        setTeachers(new ArrayList<>());

        //students = new ArrayList<>();
        setStudents(new ArrayList<>());
    }

    private int getNextId() {
        return nextId;
    }

    private void  setNextId() {
        nextId++;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId() {
        this.lessonId = this.lessonName  + "-" + nextId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public String showTeachers(){
        String str = this.lessonName + " - Teacher List \n";
        str+="------------------------------------\n";
        str+="Sn\tTeacher Id\tTeacher Name\n";
        str+="--\t----------\t--------------------\n";
        int sNo = 1;
        for (Teacher teacher:teachers){
            str+= sNo++ + "-\t" + teacher.getTeacherId() + "\t\t" + teacher.getName() + "\n";
        }
        return str;
    }
    public String showStudents(){
        String str = this.lessonName + " - Student List \n";
        str+="------------------------------------\n";
        str+="Sn\tStudent Id\tStudent Name\n";
        str+="--\t----------\t--------------------\n";
        int sNo = 1;
        for (Student student:students){
            str+= sNo++ + "-\t" + student.getStudentId()+ "\t\t" + student.getName() + "\n";
        }
        return str;
    }
    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId='" + lessonId + '\'' +
                ", lessonName='" + lessonName + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }
}
