package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sasha");
        names.add("Misha");
        System.out.println(names);
        System.out.println("Misha in names? " + names.contains("Misha"));
        System.out.println("Masha in names? " + names.contains("Masha"));
        ArrayList<String> nms = new ArrayList<>();
        nms.add("Albert");
        nms.add(0, "Edwrd");
        System.out.println("Add " + nms + " to names:");
        names.addAll(nms);
        System.out.println(names);
        System.out.println("Correcting name Edwrd:");
        names.set(names.indexOf("Edwrd"), "Edward");
        System.out.println(names.get(2));
        names.remove(0);
        System.out.println(names.subList(0, 2));
    }
}
