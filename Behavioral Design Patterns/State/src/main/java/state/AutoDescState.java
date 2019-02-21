package state;

public class AutoDescState extends AbstractState {

    public Computer com;
    public AutoDescState(Computer c){
        this.com = c;
    }
    public void compute() {
        com.num = com.num - 1;
        if(com.num<-3){
            System.out.println("值太小，进入自增状态");
            com.setSate(new AutoAddState(this.com));
        }
    }
}
