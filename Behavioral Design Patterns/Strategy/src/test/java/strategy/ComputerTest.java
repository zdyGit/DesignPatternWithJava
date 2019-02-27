package strategy;

import org.junit.Test;

public class ComputerTest {

    @Test
    public void computeTest()throws Exception{
        Computer c= new Computer();
        c.setComputeStrategy(new MulitStrategy());
        System.out.println(c.compute(2,3));
    }
}
