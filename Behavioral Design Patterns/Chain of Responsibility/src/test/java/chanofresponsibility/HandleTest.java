package chanofresponsibility;

import chainofresponsibility.*;
import org.junit.Test;

import javax.print.attribute.standard.MediaName;

public class HandleTest {

    @Test
    public void handleTest(){
        Request req1 = new Request(RequestType.Leave);
        req1.requestNum = 2;

        Request req2 = new Request(RequestType.Leave);
        req2.requestNum = 5;

        Request req3 = new Request(RequestType.Reimburse);
        req3.requestNum = 1000;

        Request req4 = new Request(RequestType.Reimburse);
        req4.requestNum = 20000;

        Manager jlManager = new JiLiManager();
        Manager zjlManager = new ZongJiLiManager();
        jlManager.setPreManager(zjlManager);

        jlManager.handleRequest(req1);
        jlManager.handleRequest(req2);
        jlManager.handleRequest(req3);
        jlManager.handleRequest(req4);
    }
}
