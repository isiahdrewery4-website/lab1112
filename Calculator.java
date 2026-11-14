public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        int result1 = calc.add(10,20);
        int result2 = calc.add(10, 20, 30);
        double result3 = calc.add(10.5, 20.5);
        
        System.out.println("Sum of two integers " + result1);
        System.out.println("Sum of three integers " + result2);
        System.out.println("Sum of two decimals " + result3);
    }
}
