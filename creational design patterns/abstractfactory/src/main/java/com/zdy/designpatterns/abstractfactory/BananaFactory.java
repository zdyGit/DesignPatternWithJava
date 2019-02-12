package com.zdy.designpatterns.abstractfactory;

public class BananaFactory implements FruitFactory {
    public Fruit getFruit() {
        return new Banana();
    }
}
