package org.itstep.task07;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass(obj) == Complex) {

        }
        return false;
    }
}
