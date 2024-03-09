package com.gkevin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foo {
    public int loop() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        for (int j = 0; j < 1000000; j++) {
            Iterator<Integer> iter = list.iterator();
            iter.next();
        }

        return list.size();
    }
}
