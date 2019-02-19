package iterator;

import java.util.Iterator;
import java.util.List;

public class AppleIterator implements Iterator {

    private List<Fruit> appleList;
    private int pos;
    public AppleIterator(List<Fruit> appleList){
        this.appleList = appleList;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos>=this.appleList.size()) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Fruit next() {
        return this.appleList.get(this.pos++);
    }
}
