package prototype;

public class Person implements Cloneable {

    public String name ;

    @Override
    public Person clone(){
        try {
            return (Person) super.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
            return null;
        }
    }
}
