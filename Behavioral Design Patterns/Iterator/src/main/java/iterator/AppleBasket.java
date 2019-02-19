package iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppleBasket extends Basket{

    private List<Fruit> appleList;
    public AppleBasket(){
        appleList = new ArrayList<Fruit>();
    }

    @Override
    public void add(Fruit obj) {
        appleList.add(obj);
    }

    @Override
    public void remove(Fruit obj) {
        appleList.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new AppleIterator(appleList);
    }
}
