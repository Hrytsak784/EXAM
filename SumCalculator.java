public class SumCalculator {
    void calculateSum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Сума трьох параметрів (int): " + sum);
    }
    void calculateSum(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        System.out.println("Сума чотирьох параметрів (int): " + sum);
    }
    void calculateSum(double a, double b, double c) {
        double sum = a + b + c;
        System.out.println("Сума трьох параметрів (double): " + sum);
    }
}
