package com.isep;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ArrayList<String> zoo = new ArrayList<>();
        Animal.surnom = "TOM";
        Lion lion = new Lion();
        zoo.add(lion.affiche());
        Animal.surnom = "MAX";
        Tigre tigre = new Tigre();
        zoo.add(tigre.affiche());
        zoo.forEach(System.out::println);
    }
}
