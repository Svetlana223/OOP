package org.example.sem2.sem2;


import org.example.sem2.sem2.model.Human;
import org.example.sem2.sem2.model.Market;

public class ex1 {
    public static void main(String[] args) {
        Human human = new Human();
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeinQueue(human);
        market.takeOrders();
        market.makeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
