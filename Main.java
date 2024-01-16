public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        
        calculator.calculateSum(1, 2, 3);
        calculator.calculateSum(1, 2, 3, 4);
        calculator.calculateSum(1.5, 2.5, 3.5);
    }
}