package command;

public class CookRiceCommand implements iCommand {

    public Chef chef;

    public CookRiceCommand(Chef chef){
        this.chef = chef;
    }

    public void Exec() {
        this.chef.cookRice();
    }
}
