public class Task4 {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 7;

        System.out.println("Максимум из двух чисел (10 и 15): " + findMaxOfTwo(a, b));
        System.out.println("Максимум из трёх чисел (10, 15, 7): " + findMaxOfThree(a, b, c));
    }
    
    public static int findMaxOfTwo(int num1, int num2) {
        return Math.max(num1, num2);
    }
    public static int findMaxOfThree(int num1, int num2, int num3) {
        return findMaxOfTwo(findMaxOfTwo(num1, num2), num3);
    }
}

