package decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decorateTest(){
        Person p = new Person();
        p.show();

        Person p1 = new PLMM();

        AbstractDecorator abstractDecorator = new DecoratorMode1(p);
        abstractDecorator.show();

        abstractDecorator = new DecoratorMode1(p1);
        abstractDecorator.show();
    }
}
