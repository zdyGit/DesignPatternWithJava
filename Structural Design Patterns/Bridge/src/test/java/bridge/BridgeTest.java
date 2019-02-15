package bridge;

import org.junit.Test;

public class BridgeTest {

    @Test
    public void bridgeTest(){
        AbstractLeftBirdgePlace leftPlace = new LeftPlaceA();
        leftPlace.rightPlace = new RightPlaceB();
        leftPlace.descTarge();

        leftPlace = new LeftPlaceA();
        leftPlace.rightPlace = new RightPlaceA();
        leftPlace.descTarge();
    }
}
