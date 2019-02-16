package decorator;

public class PLMM extends Person {

    @Override
    public void decorateFace(){
        System.out.println("脸部化妆");
    }

    @Override
    public void decorateEye(){
        System.out.println("眼睛化妆");
    }

    @Override
    public void decorateNose(){
        System.out.println("鼻子化妆");
    }
}
