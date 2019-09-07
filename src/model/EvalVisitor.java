package model;

public class EvalVisitor implements Visitor<Integer> {

    @Override
    public Integer visit(Number num) {
        return num.value;
    }

    @Override
    public Integer visit(Add add) {
        int lhs = add.lhs.accept(this);
        int rhs = add.rhs.accept(this);
        return lhs + rhs;
    }

    @Override
    public Integer visit(Sub sub) {
        int lhs = sub.lhs.accept(this);
        int rhs = sub.rhs.accept(this);
        return lhs - rhs;
    }
}
