package mediator;

public class AbstractMediator {
    public AbstractTrader abstractTraderBuyer;

    public AbstractTrader abstractTraderSeller;

    public void buyDeal(int num){
        this.abstractTraderSeller.amt = this.abstractTraderSeller.amt + num;
    }

    public void sellDeal(int num){
        this.abstractTraderBuyer.amt = this.abstractTraderBuyer.amt + num;
    }
}
