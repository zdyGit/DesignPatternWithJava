package mediator;

public class Buyer extends AbstractTrader {
    public AbstractMediator abstractMediator;

    public Buyer(String name,AbstractMediator abstractMediator){
        this.name = name;
        this.abstractMediator = abstractMediator;
        this.amt = 10000;
    }

    public void afterBuy(int num) {
        if (this.amt <= num){
            return ;
        }
        this.amt = this.amt - num;
        abstractMediator.buyDeal(num);
    }

    public void afterSell(int num) {

    }
}
