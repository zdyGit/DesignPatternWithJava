package com.zdy.designpatterns.simplefactory;

import org.junit.Test;

public class AnimalTest {

    public Animal animal ;

    @Test
    public void testEat(){
        animal = AnimalFactory.createAnimal("Fish");
        System.out.println(animal.Eat());

    }
}
