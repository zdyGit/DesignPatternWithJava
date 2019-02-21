package memento;

import org.junit.Test;

public class MementoTest {

    @Test
    public void memoTest(){
        Original o = new Original();
        o.setVal1("a");
        o.setVal2("b");
        Storage.addMemo(o.getMemento());

        o.setVal1("a1");
        o.setVal2("b1");
        Storage.addMemo(o.getMemento());

        o.setVal1("a2");
        o.setVal2("b2");
        Storage.addMemo(o.getMemento());

        o.recover(Storage.getMemo(1));
        System.out.println(o.getVal1());
        System.out.println(o.getVal2());
    }
}
