package command;

public class CookSoupCommand implements iCommand {

    public Chef chef;

    public CookSoupCommand(Chef chef){
        this.chef = chef;
    }

    public void Exec() {
        this.chef.cookSoup();
    }
}
