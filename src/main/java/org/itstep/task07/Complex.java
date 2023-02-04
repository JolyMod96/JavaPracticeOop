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
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Complex)) {
            return false;
        }
        Complex complex = (Complex)obj;
        return Double.compare(this.real, complex.real) == 0
                && Double.compare(this.imaginary, complex.imaginary) == 0;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex plus(Complex complex) {

    }

    public Complex minus(Complex complex) {

    }

    public Complex times(Complex complex) {

    }
}
