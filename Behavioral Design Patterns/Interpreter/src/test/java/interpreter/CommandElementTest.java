package interpreter;

import org.junit.Test;

public class CommandElementTest {

    @Test
    public void commandExec(){
        String commandText = "A 1d1ese1wq1D1";
        for(char c:commandText.toCharArray()){
            CommandElement commandElement = CommandFactory.getCommandElemet(Character.toString(c));
            commandElement.exec();
        }
    }
}
