package adapter;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void adapterTest(){
        MidAdapter1 midAdapter1 = new MidAdapter1();
        midAdapter1.supportUSB();
        midAdapter1.supportHDMI();

        MidAdapter2 midAdapter2 = new MidAdapter2();
        try {
            midAdapter2.supportUSB();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        midAdapter2.supportHDMI();
    }
}
