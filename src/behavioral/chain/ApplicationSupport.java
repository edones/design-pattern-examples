package behavioral.chain;

public class ApplicationSupport extends Handler {

    public ApplicationSupport(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.SOFTWARE.equals(request.getRequestType())) {
            System.out.println("Software support will handle: " + request.getTitle());
        } else {
            System.out.println(this.toString() + " escalating to " + successor.toString());
            successor.handleRequest(request);
        }
    }
}
