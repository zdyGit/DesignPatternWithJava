package mediator;

public class Seller extends AbstractTrader {
    public AbstractMediator abstractMediator;

    public Seller(String name, AbstractMediator abstractMediator){
        this.name = name;
        this.abstractMediator = abstractMediator;
        this.amt = 10000;
    }

    public void afterBuy(int num) {

    }

    public void afterSell(int num) {
        if (this.amt <= num){
            return ;
        }
        this.amt = this.amt - num;
        abstractMediator.sellDeal(num);
    }
}
