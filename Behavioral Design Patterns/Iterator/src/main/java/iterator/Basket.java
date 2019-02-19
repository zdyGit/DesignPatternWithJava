package iterator;

import java.util.Iterator;

//篮子
public abstract class Basket{
    public abstract void add(Fruit obj);
    public abstract void remove(Fruit obj);
    public abstract Iterator getIterator();
}
