package com.claudino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Thiago");
        c.add("Joao");
        c.add("Jose");

        System.out.println(c.toString());
        System.out.println(c.isEmpty());
        System.out.println(c.contains("Maria"));

    }
}
