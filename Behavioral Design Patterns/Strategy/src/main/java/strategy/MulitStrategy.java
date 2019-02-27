package strategy;

public class MulitStrategy implements IComputeStrategy {
    @Override
    public int compute(int num1, int num2) {
        return num1*num2;
    }
}
