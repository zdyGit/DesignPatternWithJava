package flyweight;

import java.util.HashMap;

public class ShareToolList {
    private static ShareToolList shareToolList ;
    private static HashMap<String,MathComputer> toolList ;

    private ShareToolList(){
        toolList = new HashMap<String,MathComputer>();
        toolList.put("MATHCOMPUTER",new MathComputer());
    }

    public static ShareToolList getInstance(){
        if(shareToolList == null){
            shareToolList = new ShareToolList();
        }
        return shareToolList;
    }

    public static Object getTool(String name){
        return toolList.get(name);
    }
}
