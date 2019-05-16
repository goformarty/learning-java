package com.goformarty;

import java.util.ArrayList;
import java.util.List;

public class SplitList {
    public static List[] split(List<String> list) {
        // create two empty lists
        List<String> first = new ArrayList<String>();
        List<String> second = new ArrayList<String>();

        int size = list.size();

        for (int i = 0; i < size / 2; i++) {
            first.add(list.get(i));
        }

        for(int i = size / 2; i < size; i++) {
            second.add(list.get(i));
        }
        return new List[] {first, second};
    }
}
