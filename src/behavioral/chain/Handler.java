package behavioral.chain;

/**
 * Implement Chain of responsibility pattern
 */
public abstract class Handler {
    protected Handler successor;

    public Handler() {

    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}
