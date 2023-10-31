package com.example;

import java.util.List;

public class LionAlex extends Lion{
    private final List<String> friends = List.of("Марти", "Глория", "Мелман");

    public LionAlex(Feline feline) throws Exception{
        super("Самец", feline);
    }
    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
