package templatemethod;

import org.junit.Test;

public class ActionTest {

    @Test
    public void action(){
        AbstractAction abstractAction = new Action1();
        abstractAction.action();
    }
}
