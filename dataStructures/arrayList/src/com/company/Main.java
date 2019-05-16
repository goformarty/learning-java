package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Marty");
        names.add("Raf");
        names.add("Alice");

        // Traversing list through Iterator
        System.out.println("\nTraversing a list through the for-each loop");
        Iterator itr = names.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Traversing a list through the for-each loop
        System.out.println("\nTraversing a list through the for-each loop");
        for(String name:names) {
            System.out.println(name);
        }
    }
}
