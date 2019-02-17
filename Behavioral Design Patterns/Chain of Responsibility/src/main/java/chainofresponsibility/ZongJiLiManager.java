package chainofresponsibility;

public class ZongJiLiManager extends Manager {
    public void handleRequest(Request req) {
        if(req.requestType == RequestType.Leave ){
            System.out.println("总经理通过请假审批");
            return ;
        }
        if(req.requestType == RequestType.Reimburse){
            if(req.requestNum <= 10000){
                System.out.println("总经理通过报销审批");
                return ;
            }
            else{
                System.out.println("报销超过10000，总经理拒绝报销审批");
                return ;
            }
        }
        System.out.println("总经理审批完毕");
    }
}
