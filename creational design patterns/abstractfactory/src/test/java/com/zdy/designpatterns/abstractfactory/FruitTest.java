package com.zdy.designpatterns.abstractfactory;

import org.junit.Test;


public class FruitTest {

    @Test
    public void getFruit(){
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        System.out.println(fruit.toString());
    }
}
