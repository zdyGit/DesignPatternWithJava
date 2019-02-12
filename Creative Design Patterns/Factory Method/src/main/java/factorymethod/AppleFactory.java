package factorymethod;

public class AppleFactory implements iFruitFactory {
    public Fruit getFruit() {
        return new Apple();
    }
}
