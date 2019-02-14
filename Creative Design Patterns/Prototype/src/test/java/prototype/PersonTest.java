package prototype;

import org.junit.Test;

public class PersonTest {

    @Test
    public void cloneTest(){
        Person p = new Person();
        p.name = "zdy";

        Person p1 = p.clone();
        System.out.println(p1.name);
        p.name = "test";
        System.out.println(p1.name);
    }
}
