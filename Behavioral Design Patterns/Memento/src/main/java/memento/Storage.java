package memento;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Memento> memoList = new ArrayList<Memento>();


    public static void addMemo(Memento memo){
        memoList.add(memo);
    }

    public static Memento getMemo(int i){
        return memoList.get(i);
    }
}
