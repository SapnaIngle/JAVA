package abstraction;

// Multiple inheritance is supported through Interface.

/**
 * Functional Interface :- only one method
 * Normal Interface :- many methods
 * Marker Interface :- no methods
 * */

public interface Sports {

    public abstract void play();  // Declared method-which do not have body, incomplete method
    public abstract void play2();
}

/***
 *
 *              Abstract class                                              Interface
 *
 * 1. Abstract class can extract to another class                       1. Implementation
 *
 * 2. Partial abstraction                                               2. 100% abstraction
 *
 * 3. Private, protected methods are allowed                            3. Only public(from java 9 private)
 *
 * 4. Multiple inheritance is not supported                             4. Multiple inheritance is supported
 *
 * 5. Abstract and non-abstract methods                                 5. Only abstract(from java 8 default and static)
 *
 *
 *
 *
 * */