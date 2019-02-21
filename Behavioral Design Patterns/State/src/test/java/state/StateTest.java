package state;

import org.junit.Test;

public class StateTest {

    @Test
    public void testStateChange(){
        Computer com = new Computer();
        com.setSate(new AutoAddState(com));

        int index = 0;
        while (index < 13){
            com.compute();
            index = index +1;
        }

    }
}
