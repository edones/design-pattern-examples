package behavioral.chain;

public class Request {
    private String title;
    private String description;
    private RequestType requestType;

    public Request(String title, String description, RequestType requestType) {
        this.title = title;
        this.description = description;
        this.requestType = requestType;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public RequestType getRequestType() {
        return requestType;
    }
}
