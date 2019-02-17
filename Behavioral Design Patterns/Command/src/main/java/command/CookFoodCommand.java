package command;

public class CookFoodCommand implements iCommand {

    public Chef chef;

    public CookFoodCommand(Chef chef){
        this.chef = chef;
    }

    public void Exec() {
        this.chef.cookFood();
    }
}
