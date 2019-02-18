package interpreter;

public class CommandFactory {
    public static CommandElement getCommandElemet(String commendContent){
        CommandElement commandElement ;
        switch (commendContent.toUpperCase()){
            case "A":
                commandElement = new LeftCommandElement();
                break;
            case "W":
                commandElement = new UpCommandElement();
                break;
            case  "S":
                commandElement = new DownCommandElement();
                break;
            case  "D":
                commandElement = new RightCommandElement();
                break;
            case "1":
                commandElement = new DistanceCommandElement(Integer.parseInt(commendContent));
                break;
            default:
                commandElement = new NullCommandElement();
                break;
        }
        return commandElement;
    }
}
