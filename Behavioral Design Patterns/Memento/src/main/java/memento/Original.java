package memento;

public class Original {

    private String val1;

    private String val2;


    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public Memento getMemento(){
        Memento memo = new Memento();
        memo.setVal1(this.getVal1());
        memo.setVal2(this.getVal2());
        return memo;
    }

    public void recover(Memento memo){
        this.setVal1(memo.getVal1());
        this.setVal2(memo.getVal2());
    }

}
