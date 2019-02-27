package templatemethod;

public abstract class AbstractAction {

    public void action(){
        subAction1();
        subAction2();
    }

    public abstract void subAction1();
    public abstract void subAction2();
}
