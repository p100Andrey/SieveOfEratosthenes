package com.company;


import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {

    public List<Integer> findOfSimpleNumbers(int n) {
        List<Integer> simpleNumbers = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            simpleNumbers.add(i);
        }
        boolean state;
        do {
            state = false;
            for (Integer element : simpleNumbers) {
                for (Integer elementInto : simpleNumbers) {
                    if ((elementInto % element == 0) && (element != elementInto)) {
                        state = true;
                        break;
                    }
                }
                if (state) {
                    simpleNumbers = removeElements(simpleNumbers, element);
                    break;
                }
            }
            if (state == false) {
                return simpleNumbers;
            }
        } while (state);
        return simpleNumbers;
    }

    private List<Integer> removeElements(List<Integer> enyList, Integer nextInt) {
        List<Integer> tempList = new ArrayList<>();
        for (Integer element : enyList) {
            if ((element == nextInt) || (element % nextInt != 0)) {
                tempList.add(element);
            }
        }
        return tempList;
    }

}
