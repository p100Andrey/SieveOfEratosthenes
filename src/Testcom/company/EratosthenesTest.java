package Testcom.company;

import com.company.Eratosthenes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class EratosthenesTest {
    @Test
    public void findOfSimpleNumbers() throws Exception {
        Eratosthenes eratosthenes = new Eratosthenes();
        List<Integer> result = new ArrayList<Integer>();
        result.add(2);
        result.add(3);
        result.add(5);
        result.add(7);
        result.add(11);
        result.add(13);
        result.add(17);
        result.add(19);
        List<Integer> temp = eratosthenes.findOfSimpleNumbers(20);
        assertEquals(result, temp);
    }

    @Test
    public void findOfSimpleNumbers1() throws Exception {
        Eratosthenes eratosthenes = new Eratosthenes();
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp = eratosthenes.findOfSimpleNumbers(0);
        assertEquals(result, temp);
    }

    @Test
    public void findOfSimpleNumbers2() throws Exception {
        Eratosthenes eratosthenes = new Eratosthenes();
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp = eratosthenes.findOfSimpleNumbers(-5);
        assertEquals(result, temp);
    }
}