package model;

public interface Visitor<X> {
    <X> X visit(Number num);
    <X> X visit(Add add);
    <X> X visit(Sub sub);
}
