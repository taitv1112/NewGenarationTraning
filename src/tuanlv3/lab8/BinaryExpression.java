package tuanlv3.lab8;

public abstract class BinaryExpression extends Expression {
    public abstract Expression left();
    public abstract Expression right();
    public abstract int evaluate();
}
