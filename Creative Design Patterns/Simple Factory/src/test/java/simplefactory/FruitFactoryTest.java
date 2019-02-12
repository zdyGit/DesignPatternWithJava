package simplefactory;

import org.junit.Test;

public class FruitFactoryTest {

    @Test
    public void getFruit(){
        Fruit fruit = FruitFactory.getApple();
        System.out.println(fruit.getName());

        fruit = FruitFactory.getBanana();
        System.out.println(fruit.getName());
    }
}
