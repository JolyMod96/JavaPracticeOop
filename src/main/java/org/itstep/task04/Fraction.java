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

    // Не сильно вышло с математическими операциями

    private int gcd(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (y == 0) {
            return x;
        }
        else {
            return gcd(y, x % y);
        }
    }

    private Fraction normalize(int numerator, int denominator) {
        return normalize(new Fraction(numerator, denominator));
    }

    private Fraction normalize(Fraction fraction) {
        int gcd = gcd(numerator, denominator);
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        else if (denominator < 0) {
            return new Fraction(numerator * -1 / gcd, denominator * -1 / gcd);
        }
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    public Fraction addition(Fraction fraction) {
        return normalize(new Fraction(this.numerator * fraction.denominator + this.denominator * fraction.numerator, this.denominator * fraction.denominator));
    }

    public Fraction subtraction(Fraction fraction) {
        return normalize(new Fraction(this.numerator * fraction.denominator - this.denominator * fraction.numerator, this.denominator * fraction.denominator));
    }

    public Fraction multiplication(Fraction fraction) {
        return normalize(new Fraction(this.numerator * fraction.numerator, this.denominator * fraction.denominator));
    }

    public Fraction division(Fraction fraction) {
        return normalize(new Fraction(this.numerator * fraction.denominator, this.denominator * fraction.numerator));
    }

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator) {
        if(denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
