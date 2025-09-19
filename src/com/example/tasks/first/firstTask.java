package com.example.tasks.first;

import java.util.ArrayList;

public class firstTask {
    public static void outPut(){
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));
        Forest forest = new Forest(hares);

        System.out.println("В лесу лето!");
        Forest.setSeason("лето");
        forest.printHares();

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        Forest.setSeason("зима");
        forest.printHares();

        System.out.println("Список зайцев:");
        forest.printHares();
    }
}
