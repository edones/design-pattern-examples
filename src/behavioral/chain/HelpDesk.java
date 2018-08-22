package behavioral.chain;

public class HelpDesk extends Handler{
    public HelpDesk(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.OTHER.equals(request.getRequestType())) {
            System.out.println("Help desk will handle: " + request.getTitle());
        } else {
            System.out.println(this.toString() + " escalating to " + successor.toString());
            successor.handleRequest(request);
        }
    }
}
