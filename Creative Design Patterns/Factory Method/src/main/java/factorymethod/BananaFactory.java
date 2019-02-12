package factorymethod;

public class BananaFactory implements iFruitFactory {
    public Fruit getFruit() {
        return new Banana();
    }
}
