package command;

import org.junit.Test;

public class CommandTest {

    @Test
    public void callTest(){
        Chef chef = new Chef("杰夫");
        iCommand cookFoodCommand = new CookRiceCommand(chef);
        iCommand cookRiceCommand = new CookRiceCommand(chef);
        iCommand cookSoupCommand = new CookSoupCommand(chef);

        Demander demander1 = new Demander();
        demander1.cmd = cookFoodCommand;
        demander1.call();

        Demander demander2 = new Demander();
        demander2.cmd = cookRiceCommand;
        demander2.call();

        Demander demander3 = new Demander();
        demander3.cmd = cookSoupCommand;
        demander3.call();

    }
}
