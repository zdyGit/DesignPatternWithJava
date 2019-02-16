package fadac;

public class Switch {
    private ElectricSwitch electricSwitch = new ElectricSwitch();
    private WaterSwitch waterSwitch = new WaterSwitch();

    public void turnOn(){
        electricSwitch.turnOn();
        waterSwitch.turnOn();
    }

    public void turnOff(){
        electricSwitch.turnOff();
        waterSwitch.turnOff();
    }
}
