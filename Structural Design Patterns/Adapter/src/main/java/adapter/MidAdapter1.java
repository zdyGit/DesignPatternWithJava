package adapter;

public class MidAdapter1 extends USB implements iHDMI{

    public void supportHDMI(){
        System.out.println("支持HDMI接口");
    }
}
