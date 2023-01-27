package org.itstep.task05;

public class Money {
    private long hryvnia;
    private byte kopecks;

    public long getHryvnia() {
        return this.hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return this.kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public Money() {
        this(0L, (byte)0);
    }

    public Money(long hryvnia) {
        this(hryvnia, (byte)0);
    }

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public void printlnBalance() {
        System.out.println(this.hryvnia+","+this.kopecks);
    }

    // TODO:Реализовать методы арифметических операций

    public Money addition(Money money) {
        return new Money();
    }

    public Money subtraction(Money money) {
        return new Money();
    }

    public Money division(double money) {
        return new Money();
    }

    public Money multiply(double money) {
        return new Money();
    }

    public boolean equals(Money money) {
        return this.hryvnia == money.hryvnia && this.kopecks == money.kopecks;
    }
}
