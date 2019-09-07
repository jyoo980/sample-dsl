package model;

public class Number implements Expr {

    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int accept(Visitor v) {
        return value;
    }
}
