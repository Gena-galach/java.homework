import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int n = sb.nextInt();
        System.out.println("Введите конечное число: ");
        int m = sb.nextInt();
        CountEvenNumbers(n,m);

    }
    public static void CountEvenNumbers(int n, int m){
        for (int i = 2; i <= m ; i++) {
            if (i % 2 == 0 ){
                System.out.println(i);
            }


        }


    }
}
