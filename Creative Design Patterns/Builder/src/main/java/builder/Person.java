package builder;

import java.util.ArrayList;

public class Person {
    public Person(){
        this.dress = new ArrayList<String>();
    }

    public ArrayList<String> dress ;

    public void show(){
        for(String item :this.dress){
            System.out.println(item);
        }
    }


}
