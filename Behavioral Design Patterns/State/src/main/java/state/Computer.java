package state;

public class Computer {

    public int num;

    public AbstractState comState;

    public Computer(){
        this.num = 0;
    }

    public void setSate(AbstractState state){
        this.comState = state;
    }

    public void compute(){
        System.out.println(String.format("当前值：%d",this.num));
        this.comState.compute();

    }
}
