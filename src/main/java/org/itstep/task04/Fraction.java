package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // TODO:Решить проблему с математическими операциями

    private int GCD(int x, int y) {
        int r = 0;
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        r = b;
        while(a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    public Fraction addition(Fraction fraction) {
        Fraction result = new Fraction(this.numerator * fraction.denominator + fraction.numerator * this.denominator , fraction.numerator * fraction.denominator);
        int gcd = this.GCD(Math.abs(result.numerator), Math.abs(result.denominator));
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction subtraction(Fraction fraction) {
        Fraction result = new Fraction(this.numerator * fraction.denominator - fraction.numerator * this.denominator , fraction.numerator * fraction.denominator);
        int gcd = this.GCD(Math.abs(result.numerator), Math.abs(result.denominator));
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction multiplication(Fraction fraction) {
        Fraction result = new Fraction(this.numerator * fraction.denominator * fraction.numerator * this.denominator , fraction.numerator * fraction.denominator);
        int gcd = this.GCD(Math.abs(result.numerator), Math.abs(result.denominator));
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction division(Fraction fraction) {
        Fraction result = new Fraction(this.numerator * fraction.denominator / fraction.numerator * this.denominator , fraction.numerator * fraction.denominator);
        int gcd = this.GCD(Math.abs(result.numerator), Math.abs(result.denominator));
        result.numerator /= gcd;
        result.denominator /= gcd;
        return result;
    }

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator) {
        if(denominator == 0) {
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
