package decorator;

public class AbstractDecorator extends Person {

    public Person p ;

    public AbstractDecorator(Person p){
        this.p = p;
    }

    public void decorateFace() {
        this.p.decorateFace();
    }

    public void decorateEye() {
        this.p.decorateEye();
    }

    public void decorateNose() {
        this.p.decorateNose();
    }
}
