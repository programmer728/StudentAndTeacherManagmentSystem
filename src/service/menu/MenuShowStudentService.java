package service.menu;

import bean.DataStorage;
import bean.Student;
import serviceOfInterfaces.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void process() {
        Student[] students = DataStorage.instance().getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
