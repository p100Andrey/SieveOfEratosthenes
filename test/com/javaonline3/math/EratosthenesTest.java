package com.javaonline3.math;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class EratosthenesTest {

    private Eratosthenes eratosthenes;
    private int n;
    private List<Integer> expectedResult;

    public EratosthenesTest(int n, List<Integer> expectedResult) {
        this.n = n;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}. findOfSimpleNumbers({0}) == {1}")
    public static List<Object[]> list() {
        return Arrays.asList(new Object[][]{
                {20, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)},
                {0, Collections.emptyList()},
                {-20, Collections.emptyList()}
        });
    }

    @Before
    public void setup() throws Exception {
        eratosthenes = new Eratosthenes();
    }

    @Test
    public void findOfSimpleNumbers() throws Exception {
        assertEquals(expectedResult, eratosthenes.findOfSimpleNumbers(n));
    }
}