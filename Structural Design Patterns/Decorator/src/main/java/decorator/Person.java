package decorator;

public class Person implements iDecorator {
    public void decorateFace() {
        System.out.println("脸未化妆");
    }

    public void decorateEye() {
        System.out.println("眼睛未化妆");
    }

    public void decorateNose() {
        System.out.println("鼻子未化妆");
    }

    public void show(){
        decorateFace();
        decorateEye();
        decorateNose();

        System.out.println("化妆结束");
    }
}
