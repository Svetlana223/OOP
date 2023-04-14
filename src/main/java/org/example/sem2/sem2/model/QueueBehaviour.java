package org.example.sem2.sem2.model;

import org.example.sem2.sem2.model.Human;

public interface QueueBehaviour{
     void takeinQueue(Human human);
    void takeOrders();
    void makeOrders();
    void releaseFromQueue();
}
