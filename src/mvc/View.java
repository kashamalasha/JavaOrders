package mvc;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Представление данных и интерфейс пользователя
 */
public class View {

    public Scanner sc = new Scanner(System.in);

    public void showResult(int content) {
        switch (content) {
            case 1: //TODO Добавить отображение таблицы с клиентами
                //code here..
                break;
            case 2: //TODO Добавить отображение таблицы с заказами
                //code here
                break;
        }
    }
    public void clearScreen() {
        final String OS = System.getProperty("os.name");
        if (OS.contains("Windows")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.print("\u001b[2J\u001b[H");
            System.out.flush();
        }
    }

    public int getMenuItem() {
        int select = 0;
        this.showMainMenu();
        try {
            select = sc.nextInt();
        } catch (InputMismatchException exception) {
            this.getMenuItem();
        }
        sc.nextLine();
        select = this.getSubMenu(select);
        return select;
    }

    public int getSubMenu(int select){
        int sub = 0;
        select *= 10;
        switch (select){
            case 10:
                this.showClientMenu();
                break;
            case 20:
                this.showOrderMenu();
                break;
            case 30:
                this.showExitMenu();
                break;
            default:
                this.getMenuItem();
                break;
        }
        try {
            sub = select + sc.nextInt();
        } catch (InputMismatchException exception) {
            this.getSubMenu(select / 10);
        }
        sc.nextLine();
        while (sub % 10 > 2) {
            this.getSubMenu(select / 10);
        }
        if (sub % 10 == 1) {
            this.getMenuItem();
        } else if (sub == 32) {
            System.exit(0);
        }
        return sub;
    }

    public void showMainMenu(){
        this.clearScreen();
        System.out.println();
        System.out.println("  <=  Меню   =>  ");
        System.out.println("  -------------  ");
        System.out.println("  1 = Клиенты    ");
        System.out.println("  2 = Заказы     ");
        System.out.println("  3 = Выход      ");
        System.out.println("  -------------  ");
        System.out.print("  Command => ");
    }

    public void showClientMenu(){
        this.clearScreen();
        System.out.println();
        System.out.println("  <= Клиенты =>  ");
        System.out.println("  -------------  ");
        System.out.println("  1 = Назад      ");
        System.out.println("  2 = Просмотр   ");
        System.out.println();
        System.out.println("  -------------  ");
        System.out.print("  Command => ");
    }

    public void showOrderMenu(){
        this.clearScreen();
        System.out.println();
        System.out.println("  <= Заказы  =>  ");
        System.out.println("  -------------  ");
        System.out.println("  1 = Назад      ");
        System.out.println("  2 = Просмотр   ");
        System.out.println();
        System.out.println("  -------------  ");
        System.out.print("  Command => ");
    }

    public void showExitMenu(){
        this.clearScreen();
        System.out.println();
        System.out.println("  <=  Выход  =>  ");
        System.out.println("  -------------  ");
        System.out.println("  1 = Назад      ");
        System.out.println("  2 = Выход      ");
        System.out.println();
        System.out.println("  -------------  ");
        System.out.print("  Command => ");
    }
}
