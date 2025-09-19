package com.example.tasks.first;

public class MountainHare {
    public Integer age;
    public Double weight;
    public Integer jumpLength;
    public static String color = "Серо-рыжий";

    public MountainHare(Integer age, Double weight, Integer jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
