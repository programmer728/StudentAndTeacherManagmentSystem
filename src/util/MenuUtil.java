package util;

import java.io.IOException;
import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() throws IOException {
        Menu.showAllMenu();
        int selectedMenuNumber = new Scanner(System.in).nextInt();
        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) throws IOException {
        menu.process();
    }

}
