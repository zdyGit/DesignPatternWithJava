package iterator;

import org.junit.Test;

import java.util.Iterator;


public class IteratorTest {

    @Test
    public void iteratorTest(){
        Basket appleBasket = new AppleBasket();
        appleBasket.add(new Apple("apple1"));
        appleBasket.add(new Apple("apple2"));
        appleBasket.add(new Apple("apple3"));
        appleBasket.add(new Apple("apple4"));

        Iterator appleIterator = appleBasket.getIterator();
        while (appleIterator.hasNext()){
            Fruit f = (Fruit) appleIterator.next();
            System.out.println(f.fruitName);

        }
    }
}
