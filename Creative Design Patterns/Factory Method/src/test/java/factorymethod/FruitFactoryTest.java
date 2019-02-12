package factorymethod;

import org.junit.Test;

public class FruitFactoryTest {

    @Test
    public void getFruit(){
        iFruitFactory fruitFactory = new AppleFactory();
        System.out.println(fruitFactory.getFruit().getName());

        fruitFactory = new BananaFactory();
        System.out.println(fruitFactory.getFruit().getName());
    }
}
