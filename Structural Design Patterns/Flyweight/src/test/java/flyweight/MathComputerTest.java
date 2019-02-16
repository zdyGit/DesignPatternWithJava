package flyweight;

import org.junit.Test;

public class MathComputerTest {

    @Test
    public void computerTest(){

        ShareToolList shareToolList = ShareToolList.getInstance();
        MathComputer com = (MathComputer) shareToolList.getTool("MATHCOMPUTER");
        System.out.println(com.Add(1,2));
    }
}
