package builder;

import org.junit.Test;

public class DirectorTest {

    @Test
    public void constuctTest(){
        AbstractBuilder abstractBuilder = new OneBuilder(new Person());
        Director director = new Director(abstractBuilder);
        director.constuct();
        Person p = director.getPerson();
        p.show();

        abstractBuilder = new TwoBuilder(new Person());
        director = new Director(abstractBuilder);
        director.constuct();
        p = director.getPerson();
        p.show();

    }

}
