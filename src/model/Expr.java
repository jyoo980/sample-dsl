package model;

public interface Expr {
    int accept(Visitor v);
}
