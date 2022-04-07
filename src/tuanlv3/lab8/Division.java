package tuanlv3.lab8;

public class Division extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
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
        return Math.floorDiv(left().evaluate(), right().evaluate());
    }
}
