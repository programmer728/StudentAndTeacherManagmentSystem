package service.menu;

import bean.DataStorage;
import bean.Teacher;
import serviceOfInterfaces.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void process() {
        System.out.println("Enter name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter surname:");
        String surname = new Scanner(System.in).nextLine();
        System.out.println("Enter age:");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Enter schoolname:");
        String schoolName = new Scanner(System.in).nextLine();
        System.out.println("Enter salary:");
        double salary = new Scanner(System.in).nextDouble();
        Teacher teacher = new Teacher(name, surname, age, schoolName, salary);

        DataStorage.instance().appendTeacher(teacher);
        System.out.println("Teacher added " + teacher);
    }

}
