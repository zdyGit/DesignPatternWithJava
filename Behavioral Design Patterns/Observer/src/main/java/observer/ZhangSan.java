package observer;

public class ZhangSan extends Follower {

    public String name;
    public ZhangSan(String name){
        this.name = name;
    }
    public void action(String name) {
        System.out.println(String.format("%s 收到新消息：%s",this.name,name));
    }
}
