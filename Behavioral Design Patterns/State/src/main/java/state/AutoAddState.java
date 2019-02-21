package state;

public class AutoAddState extends AbstractState {

    public Computer com;
    public AutoAddState(Computer c){
        this.com = c;
    }
    public void compute() {
        com.num = com.num + 1;
        if(com.num>3){
            System.out.println("值太大，进入自减状态");
            com.setSate(new AutoDescState(this.com));
        }
    }
}
