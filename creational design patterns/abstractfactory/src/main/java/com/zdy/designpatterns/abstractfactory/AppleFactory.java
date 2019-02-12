package com.zdy.designpatterns.abstractfactory;

public class AppleFactory implements FruitFactory {
    public Fruit getFruit() {
        return new Apple();
    }
}
