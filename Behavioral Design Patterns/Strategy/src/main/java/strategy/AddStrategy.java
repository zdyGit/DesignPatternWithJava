package strategy;

public class AddStrategy implements IComputeStrategy {
    @Override
    public int compute(int num1, int num2) {
        return num1+num2;
    }
}