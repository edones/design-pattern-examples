package behavioral.chain;

public class SecurityGroup extends Handler {

    public SecurityGroup() {

    }

    public SecurityGroup(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.ACCESS.equals(request.getRequestType())) {
            System.out.println("Security group will handle: " + request.getTitle());
        } else {
            System.out.println(this.toString() + " escalating to " + successor.toString());
            successor.handleRequest(request);
        }
    }
}
