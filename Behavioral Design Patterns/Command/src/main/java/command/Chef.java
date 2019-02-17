package command;

//厨师
public class Chef {
    public String name;

    public Chef(String name){
        this.name = name;
    }

    public void cookRice(){
        System.out.println(this.name+"开始米饭");
    }

    public void cookSoup(){
        System.out.println(this.name+"开始煲汤");
    }

    public void cookFood(){
        System.out.println("开始做菜");
    }
}
