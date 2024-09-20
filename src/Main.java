import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        example1();
        example2();
        try{
            example3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void example3() throws FileNotFoundException {
        //прочитать  число из текстового файла e3.txt и вывести
        Scanner scanner = new Scanner(new File("e3.txt"));
        int x = scanner.nextInt();
        System.out.println(x);
    }

    private static void example2() {
        //прочитать  строку из текстового файла e2.txt и вывести
        try {
            Scanner scanner = new Scanner(new File("e2.txt"));
            String s = scanner.nextLine();
            System.out.println(s);

        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
            System.out.println(e.getMessage());
        }
    }

    private static void example1() {
        System.out.println(divIf(10, 5));
        System.out.println(divIf(9, 5));
        System.out.println(divIf(8, 0));

        System.out.println(divE(9, 5));
        System.out.println(divE(8, 0));
        try {
            System.out.println(divSimple(9, 5));
            System.out.println("1 тупое деление прошло успешно");
            System.out.println(divSimple(8, 0));
            System.out.println("2 тупое деление прошло успешно");
        } catch (ArithmeticException e) {
            System.out.println("ужас-ужас");
        }
        System.out.println("продолжаем трудиться");
    }

    public static int divIf(int a, int b) {
        if (b != 0)
            return a / b;
        else return 0;
    }

    public static int divE(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("на ноль делить не следует");
            return 0;
        }
    }

    public static int divSimple(int a, int b) {
        return a / b;
    }


}