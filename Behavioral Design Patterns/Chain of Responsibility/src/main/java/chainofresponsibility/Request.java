package chainofresponsibility;

public class Request {
    public RequestType requestType;

    public Request(RequestType rType){
        this.requestType = rType;
    }

    public int requestNum;
}
