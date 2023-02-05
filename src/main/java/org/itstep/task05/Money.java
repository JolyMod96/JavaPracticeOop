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

    public Money addition(Money money) {
        Money result = new Money(this.hryvnia + money.hryvnia, (byte)(this.kopecks + money.kopecks));
        if(result.kopecks > 99) {
            result.kopecks -= 100;
            result.hryvnia += 1;
        }
        return result;
    }

    public Money subtraction(Money money) {
        Money result = new Money(this.hryvnia - money.hryvnia, (byte)(this.kopecks - money.kopecks));
        if(result.kopecks < 0) {
            result.hryvnia -= Math.ceil(-1 * (kopecks / 100));
            result.kopecks += 100 * Math.ceil(-1 * (kopecks / 100));
        }
        return result;
    }

    public Money division(double count) {
        return new Money((long)Math.floor(this.hryvnia / count), (byte) Math.floor(this.kopecks / count));
    }

    public Money multiply(double count) {
        Money result = new Money((long)Math.floor(this.hryvnia * count));
        double kopecks = this.kopecks * count;
        int x = (int)Math.floor(kopecks / 100);
        if(x > 0) {
            kopecks -= x * 100;
            result.hryvnia += x;
        }
        result.kopecks = (byte)kopecks;
        return result;
    }

    public boolean equals(Money money) {
        return this.hryvnia == money.hryvnia && this.kopecks == money.kopecks;
    }
}
