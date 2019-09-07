# sample-dsl

This is a sample DSL I've created as an example for 410. Grammar is as specified below

```
<Expr> ::= <Expr> '+' <Expr>
         | <Expr> '-' <Expr>
         | <Num>

<Num> ::= [0..9]
```

