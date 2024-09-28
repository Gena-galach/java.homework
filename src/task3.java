import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        System.out.println();
        int result = SumOfDigits(n);
        System.out.println(result);
    }
    public static int SumOfDigits(int n){
        int res = 0;
        while (n!=0){
            res += n%10;
            n = n/10;
        }
        return res;
    }

}
