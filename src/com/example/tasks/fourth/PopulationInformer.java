package com.example.tasks.fourth;

public class PopulationInformer {
    public static String getPopulationPercent(Continent continent) {
        String result = switch (continent) {
            case ASIA -> "59.5%";
            case AFRICA -> "16.9%";
            case EUROPE -> "9.7%";
            case AUSTRALIA -> "0.5%";
            case ANTARCTICA -> "<0.1%";
            case NORTH_AMERICA -> "7.7%";
            case SOUTH_AMERICA -> "5.6%";
            default -> "Такого материка не существует.";
        };
        return result;
    }
}
