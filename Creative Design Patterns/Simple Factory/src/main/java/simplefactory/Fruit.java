package simplefactory;

public class Fruit {
    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    private String fruitName;

    public String getName(){
        return this.getFruitName();
    }
}
