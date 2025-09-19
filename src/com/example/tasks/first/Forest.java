package com.example.tasks.first;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String season) {
        if (season.equals("зима")) {
            MountainHare.color = "Белый";
        } else {
            MountainHare.color = "Серо-рыжий";
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}