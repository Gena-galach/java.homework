import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();  // Ввод числа пользователем

        int result = factorial(n);

        System.out.println("Факториал " + n + " = " + result);

        scanner.close(); // Закрываем сканер
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1; // Возвращаем -1 для отрицательных чисел
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}