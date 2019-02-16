package decorator;

public class DecoratorMode1 extends AbstractDecorator {

    public DecoratorMode1(Person p){
        super(p);
    }

    @Override
    public void decorateFace() {
        System.out.println("开始化妆脸");
        this.p.decorateFace();
        System.out.println("脸化妆结束");
    }

    @Override
    public void decorateEye() {
        System.out.println("开始化眼睛");
        this.p.decorateFace();
        System.out.println("眼睛化妆结束");
    }

    @Override
    public void decorateNose() {
        System.out.println("开始化妆鼻子");
        this.p.decorateFace();
        System.out.println("鼻子化妆结束");
    }
}
