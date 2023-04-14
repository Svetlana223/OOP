package org.example.sem2.sem2.model;

public interface MarkerBehaviour {
    void acceptToMarket(Human human);
    void releaseFromMarket(Human human);
    void update();

}
