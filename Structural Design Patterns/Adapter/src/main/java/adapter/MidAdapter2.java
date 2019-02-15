package adapter;

public class MidAdapter2 implements iHDMI {

    public iUSB usb;
    public void supportUSB() throws Exception {
        if(usb != null) {
            usb.supportUSB();
        }
        else{
            throw new Exception("Not Support USB");
        }
    }
    public void supportHDMI() {
        System.out.println("支持HDMI接口");
    }
}
