package builder;

public class Director {
    public AbstractBuilder abstractBuilder;

    public Director(AbstractBuilder abstractBuilder){
        this.abstractBuilder = abstractBuilder;
    }

    public void constuct(){
        abstractBuilder.dressHail();
        abstractBuilder.dressBody();
        abstractBuilder.dressFeet();
    }

    public Person getPerson(){
        return abstractBuilder.person;
    }
}
