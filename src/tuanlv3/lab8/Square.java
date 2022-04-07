package tuanlv3.lab8;

public class Square extends Expression{
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
//        return Math.pow(expression.evaluate(), 2);
        return (int) Math.pow(expression.evaluate(), 2);
    }
}
