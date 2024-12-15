grammar Calculadora;

// Reglas léxicas
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;

// Reglas sintácticas
expr:expr '+' expr      # Add
    | expr '-' expr      # Subtract
    | NUMBER             # Number
    ;
