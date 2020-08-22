package by.jg.komarov.bean;

import java.util.Objects;

public class Subtraction {
    private  int a;
    private int b;
    private int d;

    public Subtraction() {

    }

    public Subtraction(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = a - b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subtraction that = (Subtraction) o;
        return a == that.a &&
                b == that.b &&
                d == that.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, d);
    }

    @Override
    public String toString() {
        return "Subtraction{" +
                "a=" + a +
                ", b=" + b +
                ", d=" + d +
                '}';
    }
}
