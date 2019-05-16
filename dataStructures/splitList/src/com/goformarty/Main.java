package com.goformarty;

import java.util.ArrayList;
import java.util.List;

import static com.goformarty.SplitList.split;

public class Main {

    public static void main(String[] args) {
	List<String> list = new ArrayList();
	list.add("Hello");
	list.add("there");
	list.add("how");
	list.add("are");
	list.add("you");


    List[] lists = split(list);
    System.out.println(lists[0]);
    System.out.println(lists[1]);
    }

}

