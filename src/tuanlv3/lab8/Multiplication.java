package tuanlv3.lab8;

public class Multiplication extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public int evaluate() {
        return Math.multiplyExact(left().evaluate(), right().evaluate());
    }
}
