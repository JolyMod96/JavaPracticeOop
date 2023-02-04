package org.itstep.task06;

import java.util.stream.IntStream;

public class MainString {
    private char[] chars;

    public MainString() {
        clean();
    }

    public MainString(CharSequence charSequence) {
        int[] ch = charSequence.chars().toArray();
        this.chars = new char[ch.length];
        for(int i = 0; i < ch.length; i++) {
            this.chars[i] = (char)ch[i];
        }
    }

    public MainString(char symbol, int length) {
        this.chars = new char[length];
        for(int i = 0; i < length; i++) {
            this.chars[i] = symbol;
        }
    }

    @Override
    public String toString() {
        String str = new String();
        for(char ch:this.chars) {
            str += ch;
        }
        return str;
    }

    public int length() {
        return this.chars.length;
    }

    public void clean() {
        this.chars = new char[0];
    }

    public MainString concat(MainString mainString) {
        MainString resultMainString = new MainString();
        resultMainString.chars = new char[this.chars.length+ mainString.chars.length];
        for(int i = 0; i < this.chars.length; i++) {
            resultMainString.chars[i] = this.chars[i];
        }
        for(int i = this.chars.length; i < resultMainString.chars.length; i++) {
            resultMainString.chars[i] = mainString.chars[i - this.chars.length];
        }
        return resultMainString;
    }

    public int indexOf(int ch) {
        for(int i = 0; i < this.chars.length; i++) {
            if(this.chars[i] == (char)ch) {
                return i;
            }
        }
        return -1;
    }
}
