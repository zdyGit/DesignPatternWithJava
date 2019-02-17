package chainofresponsibility;

public class JiLiManager extends Manager {
    public void handleRequest(Request req) {
        if(req.requestType == RequestType.Leave ){
            if(req.requestNum <= 3) {
                System.out.println("请假3天内，经理审批通过");
                return;
            }
            else if(req.requestNum <=7){
                System.out.println("请假一个星期内并超过3天，经理审批通过，递交下一级审批");
            }
            if(req.requestNum > 7){
                System.out.println("请假超过一个星期，经理审批不通过");
                return;
            }
        }
        this.getPreManager().handleRequest(req);
    }
}
