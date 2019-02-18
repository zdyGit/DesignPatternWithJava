package interpreter;

public class DistanceCommandElement extends CommandElement {
    private int length;
    public void exec() {
        if(this.getLength()>0) {
            System.out.println(String.format("%d 米",this.getLength()));
        }
    }

    public int getLength() {
        return length;
    }

    public DistanceCommandElement(int l){
        this.setLength(l);
    }

    public void setLength(int length) {
        if(length <0 ){
            length = 0;
        }
        this.length = length;
    }
}
