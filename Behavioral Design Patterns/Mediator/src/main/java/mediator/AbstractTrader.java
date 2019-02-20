package mediator;

public abstract class AbstractTrader {
    public String name;
    public int amt;
    public abstract void afterBuy(int num);
    public abstract void afterSell(int num);
}
