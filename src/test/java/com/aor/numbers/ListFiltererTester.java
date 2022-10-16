package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTester {
    @Test
    public void positive_tester() {
        PositiveFilter positiveFilter = new PositiveFilter();
        ListFilterer listFilterer = new ListFilterer(positiveFilter);
        List<Integer> list = Arrays.asList(-1, 2, -5, 6, 10, 0);
        List<Integer> expected = Arrays.asList(2, 6, 10);
        Assertions.assertEquals(expected, listFilterer.filter(list));
    }

    @Test
    public void divisible_tester() {
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(4);
        ListFilterer listFilterer = new ListFilterer(divisibleByFilter);
        List<Integer> list = Arrays.asList(-4, -8, 10, 12, 5, 40);
        List<Integer> expected = Arrays.asList(-4, -8, 12, 40);
        Assertions.assertEquals(expected, listFilterer.filter(list));
    }

    @Test
    public void both_tester() {
        GenericListFilter filter = new DivisibleByFilter(3);
        ListFilterer listFilterer = new ListFilterer(filter);
        List<Integer> list = Arrays.asList(-9, 9, 13, 25, -29, 30, 99);
        list = listFilterer.filter(list);
        filter = new PositiveFilter();
        listFilterer = new ListFilterer(filter);
        List<Integer> expected = Arrays.asList(9, 30, 99);
        Assertions.assertEquals(expected, listFilterer.filter(list));
    }
}
