import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {

        // Задача про факториал
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factor = 1;
        for(;n > 0; n--)
            factor = factor * n;
        System.out.println("Факториал будет равен: " + factor);

        // Задача про Фибоначчи
        long[] arr = new long[100];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++)
            arr[i] = arr[i-2] + arr[i-1];
        for(long num : arr)
            System.out.println(num);
    }
}
