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
        return new Complex((this.real + complex.real), (this.imaginary + complex.imaginary));
    }

    public Complex minus(Complex complex) {
        return new Complex((this.real - complex.real), (this.imaginary - complex.imaginary));
    }

    public Complex times(Complex complex) {
        return new Complex((this.real * complex.real - this.imaginary * this.imaginary), (this.real * complex.imaginary + this.imaginary * complex.real));
    }

    @Override
    public String toString() {
        if (this.imaginary == 0) {
            return Double.toString(this.real);
        }
        else if (this.real <= 0) {
            return this.imaginary + "i";
        }
        else if (imaginary < 0) {
            return this.real + " - " + (-this.imaginary) +"i";
        }
        return this.real + " + " + this.imaginary +"i";
    }
}
