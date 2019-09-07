package model;

public class Add implements Expr {

    Expr lhs;
    Expr rhs;

    public Add(Expr lhs, Expr rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public int accept(Visitor v) {
        return (int) v.visit(this);
    }
}
