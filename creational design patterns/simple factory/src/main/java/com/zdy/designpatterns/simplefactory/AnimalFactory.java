package com.zdy.designpatterns.simplefactory;

public class AnimalFactory {
    public static Animal createAnimal(String animalType){
        Animal animal ;
        animalType = animalType.toUpperCase().trim();
        switch (animalType){
            case "BIRD":
                animal = new Bird();
                break;
            case "FISH":
                animal = new Fish();
                break;
            default:
                animal = null;
                break;
        }
        return animal;
    }
}
