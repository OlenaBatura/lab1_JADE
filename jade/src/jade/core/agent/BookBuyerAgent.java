package jade.core.agent;

import jade.core.Agent;

/**
 * Created by USER on 31.10.2016.
 */
public class BookBuyerAgent extends Agent {
    protected void setUp(){
        System.out.format("Hello! Buyer-agent {0} is ready!", getAID().getName());
    }

}
