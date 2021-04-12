package service.menu;

import bean.DataStorage;
import bean.Teacher;
import serviceOfInterfaces.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void process() {
        Teacher[] teachers = DataStorage.instance().getTeachers();
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
    }
}
