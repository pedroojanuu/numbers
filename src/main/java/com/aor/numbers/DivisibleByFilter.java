package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    private int val;
    public DivisibleByFilter(int value) {
        this.val = value;
    }
    @Override
    public boolean accept(Integer number) {
        return (number & val) == 0;
    }
}
