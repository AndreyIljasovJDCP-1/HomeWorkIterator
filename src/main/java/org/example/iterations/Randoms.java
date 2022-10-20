package org.example.iterations;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final Random random = new Random();
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return min + random.nextInt((max - min) + 1);
            }
        };
    }
}
