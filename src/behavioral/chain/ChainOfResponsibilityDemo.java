package behavioral.chain;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        //set up successor for each handler in the chain
        SecurityGroup securityGroup = new SecurityGroup();
        NetworkSupport networkSupport = new NetworkSupport(securityGroup);
        ApplicationSupport applicationSupport = new ApplicationSupport(networkSupport);
        HelpDesk helpDesk = new HelpDesk(applicationSupport);


        //call first in chain: helpDesk - should chain if helpDesk cannot handle
        Request firstRequest = new Request("No internet connection", "No Google for me..", RequestType.NETWORK);
        helpDesk.handleRequest(firstRequest);

        Request secondRequest = new Request("Cannot access file", "Looks confidential eh?", RequestType.ACCESS);
        helpDesk.handleRequest(secondRequest);

        Request thirdRequest = new Request("What is the phone number for the lab?", "uh..help?", RequestType.OTHER);
        helpDesk.handleRequest(thirdRequest);
    }
}
