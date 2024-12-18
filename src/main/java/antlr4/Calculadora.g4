grammar Calculadora;

// Reglas léxicas
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;

// Reglas sintácticas
expr
    : expr '+' term      # Add
    | expr '-' term      # Subtract
    | term               # TermExpression
    ;

term
    : term '*' factor    # Multiply
    | term '/' factor    # Divide
    | term '%' factor    # Percentage
    | factor             # FactorExpression
    ;

factor
    : NUMBER             # Number
    ;
