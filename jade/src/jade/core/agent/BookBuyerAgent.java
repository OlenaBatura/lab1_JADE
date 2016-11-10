package jade.core.agent;

import jade.core.AID;
import jade.core.Agent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olena_Batura on 31.10.2016.
 */
public class BookBuyerAgent extends Agent {

    private String targetBookTicket;

    private List<AID> sellerAgent = new ArrayList<AID>(){{
        add(new AID("seller1",AID.ISLOCALNAME));
        add(new AID("seller2",AID.ISLOCALNAME));
        add(new AID("seller3",AID.ISLOCALNAME));
    }};


    protected void setUp(){
        System.out.format("Hello! Buyer-agent {0} is ready!", getAID().getName());
    }

}
