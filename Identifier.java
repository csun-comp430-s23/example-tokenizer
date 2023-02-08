// Example identifiers:
// MyClass
// foo
// bar
// myMethod
public class Identifier {
    public final String name;

    public Identifier(final String name) {
        this.name = name;
    }

    // inherited equals:
    // public boolean equals(final Object other) {
    //   return this == other;
    // }
    //
    // Identifier id1 = new Identifier("foo");
    // Identifier id2 = new Identifier("foo");
    // id1.equals(id2) // returns false with default equals

    @Override
    public boolean equals(final Object other) {
        if (other instanceof Identifier) {
            final Identifier asId = (Identifier)other;
            return name.equals(asId.name); // will compile
        } else {
            return false;
        }
    }

    
}
