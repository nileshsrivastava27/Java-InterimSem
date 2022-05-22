package pkgsrl;

import java.io.*;

public class Employee implements Serializable {

// Java code for serialization and deserialization

// of a Java object

    private static final long serialversionUID =

            129348938L;

    transient int a;

    static int b;

    String name;

    int age;

// Default constructor

    public Employee(String name, int age, int a, int b) {

        this.name = name;

        this.age = age;

        this.a = a;

        this.b = b;

    }

    public void displayEmployee() {
    }
}
