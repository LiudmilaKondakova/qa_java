package com.example;

public class Cat {

    final Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Meow";
    }


    public void getFood() throws Exception {
        predator.eatMeat();
    }

}
