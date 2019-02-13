public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 singletonInstance;

    public static Singleton2 getInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton2();
        }
        return singletonInstance;
    }
}
