package PracticeHandlingExceptions.Application;
import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {  // on when all sensors are on.
    private List<Sensor> sensors;
    private List<Integer> readings;

    // Constructor

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    // Methods
    @Override
    public boolean isOn() {             // Checks if all sensors are on/off by iterating through list
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return !sensors.isEmpty();
    }


    @Override
    public void setOn() {           // When called sensors must be set on
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }

    }


    @Override
    public void setOff() {          // When setOff is called, at least one of teh sensors must be set off
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }

    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors have been added");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            int reading = sensor.read();
            readings.add(reading);
            sum += reading;
        }
        return sum / sensors.size(); //avg of the read methods of sensors
    }

    public List<Integer> readings() {
        //return results of all the executed readings
        return readings;
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }

}
