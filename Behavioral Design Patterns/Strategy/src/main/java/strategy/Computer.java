package strategy;

public class Computer {
    private IComputeStrategy computeStrategy;

    public void setComputeStrategy(IComputeStrategy  strategy) {
        this.computeStrategy = strategy;
    }

    public int compute(int num1,int num2) throws Exception{
        if(this.computeStrategy!=null){
            return this.computeStrategy.compute(num1,num2);
        }
        else{
            throw  new Exception("not set computer strategy");
        }
    }
}
