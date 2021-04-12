package bean;

import java.io.Serializable;

public class DataStorage implements Serializable {
    private static DataStorage dataStorage;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean loggedIn;

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        DataStorage.loggedIn = loggedIn;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void appendStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
    }

    public void appendTeacher(Teacher teacher) {
        Teacher[] newTeacher = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeacher[i] = teachers[i];
        }
        newTeacher[newTeacher.length - 1] = teacher;
        teachers = newTeacher;
    }

    public static DataStorage instance() {
        if (dataStorage == null) {
            dataStorage = new DataStorage();
        }
        return dataStorage;
    }
}
