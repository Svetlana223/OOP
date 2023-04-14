package org.example.sem2.sem2.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarkerBehaviour {
    List<Actor> myList = new ArrayList<>();
    Queue<Actor> myList2 = new LinkedList<>();

    @Override
    public void acceptToMarket(Human human) {
        myList.add(human);

    }

    @Override
    public void releaseFromMarket(Human human) {
        myList.remove(human);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeinQueue(Human human) {
        myList2.add(human);

    }

    @Override
    public void takeOrders() {
        myList2.peek().setTakeOrder();
    }

    @Override
    public void makeOrders() {
        myList2.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        myList2.poll();
    }
}
