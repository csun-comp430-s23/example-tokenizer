# Tokenizer Example #

```
id is an Identifier
i is an Integer
type ::= `int` | `bool`
op ::= `+` | `-` | `<`
exp ::= i | id | `(` op exp exp `)` |
            `(` `if` exp exp exp `)` |
            `(` `let` id type exp exp `)`
```

Tokens:

- IdentifierToken(Identifier)
- IntegerToken(int)
- IntToken
- BoolToken
- PlusToken
- MinusToken
- LessThanToken
- LeftParenToken
- RightParenToken
- IfToken
- LetToken
