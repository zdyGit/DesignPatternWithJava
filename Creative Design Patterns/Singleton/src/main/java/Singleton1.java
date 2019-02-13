public class Singleton1 {
    private Singleton1(){
    }

    private static Singleton1 singletonInstance = new Singleton1();

    public static Singleton1 getInstance(){
        return singletonInstance;
    }

}
