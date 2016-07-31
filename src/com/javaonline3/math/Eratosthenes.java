package com.javaonline3.math;


import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {
    public List<Integer> findOfSimpleNumbers(int n) {
        List<Integer> simpleCandidates = prepareSimpleCandidates(n);
        cleanNotSimpleNumbers(simpleCandidates);
        return filterSimpleNumbers(simpleCandidates);
    }

    private void cleanNotSimpleNumbers(List<Integer> simpleCandidates) {
        for (int p = 2; Math.pow(p, 2) < simpleCandidates.size(); p++) {
            for (int j = p; j * p < simpleCandidates.size(); j++) {
                simpleCandidates.set(j * p, 0);
            }
        }
    }

    private List<Integer> filterSimpleNumbers(List<Integer> simpleCandidates) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < simpleCandidates.size(); i++) {
            if (simpleCandidates.get(i) > 1) {
                result.add(i);
            }
        }
        return result;
    }

    private List<Integer> prepareSimpleCandidates(int n) {
        List<Integer> simpleCandidates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            simpleCandidates.add(i);
        }
        return simpleCandidates;
    }
}

