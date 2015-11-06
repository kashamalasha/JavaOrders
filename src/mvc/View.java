package mvc;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Представление данных и интерфейс пользователя
 */
public class View {

    public void showResult(String name, int ID){
        System.out.println(ID + ": " + name);
    }

    public Scanner sc = new Scanner(System.in);

    public void clearScreen() {
        //Очистка экрана - строка ввода в нижней части экрана
        /*for (int i = 0; i < 100; i++) {
            System.out.println("\b");
        }*/
        //Очистка экрана - строка ввода в верхней части экрана
        final String OS = System.getProperty("os.name");
        if (OS.contains("Windows")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        } else {
            final String ANSI_CLS = "\u001b[2J";
            final String ANSI_HOME = "\u001b[H";
            System.out.print(ANSI_HOME + ANSI_CLS);
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
