package PracticeHandlingExceptions.Application;
public class StandardSensor implements Sensor {
    private int value;

    // Constructor
    public StandardSensor(int value){
        this.value = value;
    }

    // Methods
    @Override
    public boolean isOn() {
        return true;    // true = always on  ; false = off
    }

    @Override
    public void setOn() {   // setOff() & setOn() = no effect
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return value;   // Returns the value stored in the "value" variable.
    }

    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }


}

