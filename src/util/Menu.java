package util;

import bean.DataStorage;
import service.menu.*;
import serviceOfInterfaces.MenuService;

import java.io.IOException;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add Teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add Student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all Teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all Student", new MenuShowStudentService()),
    UNKNOWN();

    private int number;
    private String name;
    private MenuService menuService;

    Menu() {
    }

    Menu(int number, String name, MenuService menuService) {
        this.name = name;
        this.menuService = menuService;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return number + "." + name;
    }

    public void process() throws IOException {
        menuService.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        System.out.println("Please select menu:");
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!DataStorage.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (DataStorage.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}
