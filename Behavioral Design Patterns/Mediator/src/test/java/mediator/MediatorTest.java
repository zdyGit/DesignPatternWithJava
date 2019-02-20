package mediator;

import org.junit.Test;

public class MediatorTest {

    @Test
    public void tradeTest(){
        AbstractMediator abstractMediator = new AbstractMediator();

        AbstractTrader buyer = new Buyer("买家",abstractMediator);
        AbstractTrader seller = new Seller("卖家",abstractMediator);

        abstractMediator.abstractTraderBuyer = buyer;
        abstractMediator.abstractTraderSeller = seller;


        buyer.afterBuy(2000);
        System.out.println(String.format("%d,%d",buyer.amt,seller.amt));

        seller.afterSell(4000);
        System.out.println(String.format("%d,%d",buyer.amt,seller.amt));
    }
}
