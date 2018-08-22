package behavioral.chain;

public class NetworkSupport extends Handler{
    public NetworkSupport(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.NETWORK.equals(request.getRequestType())) {
            System.out.println("Network support will handle: " + request.getTitle());
        } else {
            System.out.println("Escalating to " + successor.toString());
            successor.handleRequest(request);
        }
    }
}
