package ClassWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int a, b;

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(calc.plus(a, b));

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(calc.minus(a, b));

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(calc.plus(a, b));

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(calc.minus(a, b));

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(calc.plus(a, b));

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println(calc.minus(a, b));


        calc.getArchive();
    }
}
