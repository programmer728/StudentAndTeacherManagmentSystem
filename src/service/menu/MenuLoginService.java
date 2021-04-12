package service.menu;

import bean.DataStorage;
import serviceOfInterfaces.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void process() {
        System.out.println("Enter username:");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Enter password:");
        String password = new Scanner(System.in).nextLine();
        if (!(username.equals("user") && password.equals("12345"))) {
            throw new IllegalArgumentException("user or password is invalid!");
        }
        DataStorage.setLoggedIn(true);
    }
}
