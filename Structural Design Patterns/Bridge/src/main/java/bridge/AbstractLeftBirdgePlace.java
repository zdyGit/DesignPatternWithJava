package bridge;

public abstract class AbstractLeftBirdgePlace {
    public AbstractRightBridgePlace rightPlace;

    public abstract void setPosition();
    public void descTarge(){
        setPosition();
        rightPlace.setPosition();
    }
}
