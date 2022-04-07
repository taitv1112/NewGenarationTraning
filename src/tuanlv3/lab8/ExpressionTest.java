package tuanlv3.lab8;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression numb1 = new Numeral(3);
        Expression numb2 = new Numeral(1);

        Expression square = new Square(numb1);
        Expression add = new Addition(square, numb2);
        Expression result = new Square(add);

        System.out.println(result.evaluate());
    }
}
