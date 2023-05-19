package PracticeHandlingExceptions.Application;
import java.util.Random;
public class TemperatureSensor implements Sensor {
    private boolean sensorOn;

    private Random random;

    public TemperatureSensor() {
        this.sensorOn = false;  // false = off ; true = on
        this.random = new Random(); //s

    }

    @Override
    public boolean isOn() {
        return this.sensorOn;

    }

    @Override
    public void setOn() {
        sensorOn = true;
    }

    @Override
    public void setOff() {
        sensorOn = false;
    }

    @Override
    public int read() {
        if (!this.sensorOn) {
            throw new IllegalArgumentException("Error: The Temperature is off");

        return random.nextInt(61) - 30;
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.setOn();
        System.out.println(sensor.read());
    }
}