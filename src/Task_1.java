import java.io.Console;
import java.io.IOException;

/**
 * Created by alyho on 01.10.2015.
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Task_1 {

    public static void main(String args[]) {
        Task_1 t = new Task_1();
/*
        System.out.println("Executing task #1\n");
        t.task1();

        System.out.println("Executing task #2\n");
        t.task2();

        System.out.println("Executing task #3\n");
        t.task3();

        System.out.println("Executing task #4\n");
        t.task4();

        System.out.println("Executing task #5\n");
        t.task5();
*/
        System.out.println("Executing task 6_1\n");
        t.task6_1();

    }

    public void  task1() {
        System.out.println("Введите Ваше имя ниже и нажмите клавишу Enter");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println("Привет, " + name + "!");
    }

    public void task2() {
        int x;

        //отображение обратного порядка чисел
        for (x = 10; x > 0; x--)
            System.out.println("Значение х: " + x);
    }

    public void  task3() {
        int x;
        for (x = 15; x < 20; x++)
            // переход на новую строчку
            System.out.println(x);
        for (x = 15; x < 20; x++)
            //отображение в одной строке через пробел
            System.out.print(x + " ");

        System.out.print("\n");
    }

    public void  task4() {
        String parol = "5555"; // наш пароль

        System.out.println("Введите пароль и нажмите клавишу Enter");

        Scanner scan = new Scanner(System.in);
        String consolInput = scan.next();

        if (parol.equals(consolInput))
            System.out.println("Ваш пароль верный");
        else
            System.out.println("Ваш пароль не верный");
    }

    public void  task5(/*args*/) {
        /*
        for (String x : args) {
            rezult *= Integer.parseInt(x);
        }
         */

        System.out.println("Введите числа через пробел и нажмите клавишу Enter");

        Scanner scanInput = new Scanner(System.in);
        String input = scanInput.nextLine();

        Scanner scan = new Scanner(input);
        if (!scan.hasNextInt()) {
            System.out.println("Проверьте правильность ввода");
            return;
        }

        int rezult = 1;

        while(scan.hasNextInt()) {
            rezult *= scan.nextInt();
        }

        System.out.println("Произведение чисел = " + rezult);
    }

    public void  task6_1 () {

        System.out.println("Введите с консоли n целых чисел");
        Scanner scanInput = new Scanner(System.in);

        String input = scanInput.nextLine();
        Scanner scan = new Scanner(input);

        System.out.println("Четные числа");
        while(scan.hasNextInt()) {
            int x = scan.nextInt();
            if (x % 2 == 0)
                System.out.println(x);
        }

        scan.close();
        scan = new Scanner(input);

        System.out.println("Нечетные числа");
        while(scan.hasNextInt()) {
            int x = scan.nextInt();
            if (x % 2 != 0)
                System.out.println(x);
        }
    }
}
