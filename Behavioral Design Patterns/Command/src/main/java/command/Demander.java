package command;

public class Demander {
    public iCommand cmd;

    public void call(){
        cmd.Exec();
    }
}
