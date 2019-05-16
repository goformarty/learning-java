package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] result = DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "WEST", "NORTH"});
        System.out.println(result);
        System.out.println(Arrays.toString(result));

    }
}
