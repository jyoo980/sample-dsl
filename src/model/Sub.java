package model;

public class Sub implements Expr {

    Expr lhs;
    Expr rhs;

    public Sub(Expr lhs, Expr rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public int accept(Visitor v) {
        return (int) v.visit(this);
    }
}
