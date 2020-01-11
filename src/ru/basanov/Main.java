package ru.basanov;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String string = "first";
        String string1 = "one";
        String string2 = "two";
        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();
        stringMyLinkedList.add(string);
        stringMyLinkedList.add(string1);
        stringMyLinkedList.add(string2);
        System.out.println(stringMyLinkedList.size);

        MyArrayList<String> myArrayList = new MyArrayList();
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("t");
        list.add("h");
        myArrayList.addAll(0, list);
        System.out.println(myArrayList.size());
    }
}
