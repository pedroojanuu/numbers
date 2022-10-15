package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;
    public ListFilterer(GenericListFilter filter) {this.filter = filter;}
    public List<Integer> filter(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>();
        for (Integer i : list) {
            if (filter.accept(i)) {
                newList.add(i);
            }
        }
        return newList;
    }
}
