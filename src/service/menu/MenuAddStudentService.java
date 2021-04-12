package service.menu;

import bean.DataStorage;
import bean.Student;
import serviceOfInterfaces.MenuAddStudentServiceInter;
import util.FileUtility;

import java.io.IOException;
import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void process() throws IOException {
        System.out.println("Enter name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter surname:");
        String surname = new Scanner(System.in).nextLine();
        System.out.println("Enter age:");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Enter schoolname:");
        String schoolName = new Scanner(System.in).nextLine();
        System.out.println("Enter scholarship:");
        double scholarship = new Scanner(System.in).nextDouble();
        Student student = new Student(name, surname, age, schoolName, scholarship);

        DataStorage.instance().appendStudent(student);
        System.out.println("Student added" + student);

        FileUtility.writeObjectToFile(DataStorage.instance(), "app.obj");
    }


}
