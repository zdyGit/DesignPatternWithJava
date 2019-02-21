package observer;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void observerTest(){

        Follower f1 = new ZhangSan("张三");
        Follower f2 = new ZhangSan("李四");
        Follower f3 = new ZhangSan("王五");
        Star xxstar = new XXStar();
        xxstar.addFollower(f1);
        xxstar.addFollower(f2);
        xxstar.addFollower(f3);
        xxstar.happenNews();

    }
}
