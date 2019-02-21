package observer;

import java.util.ArrayList;
import java.util.List;

public class XXStar extends Star {
    private List<Follower> followerList;

    public XXStar(){
        followerList = new ArrayList<Follower>();
    }
    public void happenNews() {
        System.out.println("XXStart 开始举办演唱会");
        for(Follower f:this.followerList){
            f.action("XXStar开始举办演唱会");
        }
    }

    public void addFollower(Follower f){
        followerList.add(f);
    }
}
